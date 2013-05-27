package uk.co.benashwell.CartoonDrawing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The CartoonFrame class inherits from JFrame class. It is used to create the
 * Frame and add the Menu with the Action Listener, the TabbedPane and the
 * Canvas with the Mouse Listener
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro.
 */
@SuppressWarnings("serial")
public class CartoonFrame extends JFrame implements WindowListener {
	/** The actual MenuBar. */
	private JMenuBar mb;
	/** The Menu Colours. */
	private JMenu colours = new JMenu("Colours");
	/** The MenuItem White. */
	private JMenuItem white = new JMenuItem("White");
	/** The MenuItem Blue. */
	private JMenuItem blue = new JMenuItem("Blue");
	/** The MenuItem Red. */
	private JMenuItem red = new JMenuItem("Red");
	/** The MenuItem Yellow. */
	private JMenuItem yellow = new JMenuItem("Yellow");
	/** The MenuItem Green. */
	private JMenuItem green = new JMenuItem("Green");
	/** The MenuItem to Choose Your Own Colour */
	private JMenuItem ownColour = new JMenuItem("Choose Your Own");
	/** The Menu Options. */
	private JMenu options = new JMenu("Options");
	/** The MenuItem Clear */
	private JMenuItem clear = new JMenuItem("Clear");
	/** The Menu Item Exit. */
	private JMenuItem exit = new JMenuItem("Exit");
	/** The MenuListener Object used to listen to the menu. */
	private MenuListener menuList;
	/** The DrawingCanvas Object used to create the white space to draw on. */
	private DrawingCanvas canvas;
	/** The TabbedPane Object used to create the pane which holds the buttons. */
	private TabbedPane tabbedpane;
	/** The MouseListener Object Used to listen to the mouse Co-ordinates. */
	private MyMouseListener ml;

	/**
	 * The Constructor for the Cartoon Frame Class. It sets up the frame and
	 * then creates the menu bar, adds the menu's to it. It then creates the
	 * button panel and the drawing canvas and also adds them. It creates the
	 * Listeners for the menu and the drawing canvas too.
	 * 
	 */
	public CartoonFrame() {
		// set up the frame
		this.setTitle("Cartoon Drawing");
		addWindowListener(this);

		// set menu listener and add items to the menu
		mb = new JMenuBar();
		menuList = new MenuListener(this);

		this.setJMenuBar(mb);

		mb.add(colours);
		colours.add(white);
		white.addActionListener(menuList);
		colours.add(blue);
		blue.addActionListener(menuList);
		colours.add(red);
		red.addActionListener(menuList);
		colours.add(yellow);
		yellow.addActionListener(menuList);
		colours.add(green);
		green.addActionListener(menuList);
		colours.add(ownColour);
		ownColour.addActionListener(menuList);

		mb.add(options);
		options.add(clear);
		clear.addActionListener(menuList);
		options.add(exit);
		exit.addActionListener(menuList);

		// add tabbed pane which holds the images
		tabbedpane = new TabbedPane();
		add(tabbedpane, BorderLayout.NORTH);

		// add canvas with listener
		canvas = new DrawingCanvas();
		add(canvas, BorderLayout.CENTER);
		ml = new MyMouseListener(canvas, tabbedpane);
		canvas.addMouseListener(ml);

		// pack it all together and show
		pack();
		setVisible(true);

	}

	/**
	 * getFile method gets the file name from the tabbed pane and returns it to
	 * the method calling it.
	 * 
	 * @return String
	 */
	public String getFile() {
		String file = tabbedpane.getFile();
		return file;
	}

	/**
	 * Method to change the colour of the canvas.
	 * 
	 * @param c
	 */
	public void colourChange(Color c) {
		canvas.setBackground(c);
	}

	/**
	 * This method runs the clear method in the DrawingCanvas object
	 */
	public void clearCanvas() {
		canvas.clear();
	}

	/**
	 * Code for when the close button is pressed you ask if you are sure that
	 * they want to quit
	 * 
	 * @param e
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		int answer = JOptionPane.showConfirmDialog(this, "Are you sure?",
				"Exit Confirmation", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else if (answer == JOptionPane.NO_OPTION) {
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
	}
}
