package uk.co.benashwell.CartoonDrawing;
import java.awt.*;

import javax.swing.*;

/**
 * ButtonPanel class extends JPanel and is used to create the different buttons
 * found in the tabs at the top of the programme.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 */
@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {

	/** Button 1 for the tab */
	private JButton button1;
	/** Button 2 for the tab */
	private JButton button2;
	/** Button 3 for the tab */
	private JButton button3;
	/** Button 4 for the tab */
	private JButton button4;
	/** Button listener to listen for clicks on the buttons. */
	private ButtonListener bl;
	/** Link to the TabbedPane. */
	private TabbedPane tabPane;

	/**
	 * The constructor for the button panel.
	 * 
	 * @param gridLayout
	 *            A simple layout type
	 * @param x
	 *            The number panel that you are on
	 * @param tp
	 *            the link back to the tabbed panel
	 */
	public ButtonPanel(GridLayout gridLayout, int x, TabbedPane tp) {

		// create the listener for the buttons and find out what panel we are on
		bl = new ButtonListener(this);
		tabPane = tp;
		if (x == 1)
			panelCreate("boyhappy.png", "boysad.png", "boytongue.png",
					"boyangry.png", 1);
		if (x == 2)
			panelCreate("girlhappy.png", "girlsad.png", "girltongue.png",
					"girlangry.png", 5);
		if (x == 3)
			panelCreate("circle.png", "square.png", "triangle.png", "star.png",
					9);
		if (x == 4)
			panelCreate("roundtextleft.png", "roundtextright.png",
					"bubbleleft.png", "bubbleright.png", 13);

		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);

	}

	/**
	 * Method to create the panel and add all buttons icons to it.
	 * 
	 * @param image1
	 *            First image file.
	 * @param image2
	 *            Second image file.
	 * @param image3
	 *            Third image file.
	 * @param image4
	 *            Fourth image file.
	 * @param startNumber
	 *            Number to start assigning your action command with.
	 */
	public void panelCreate(String image1, String image2, String image3,
			String image4, int startNumber) {

		Icon icon1 = new ImageIcon(image1);
		Icon icon2 = new ImageIcon(image2);
		Icon icon3 = new ImageIcon(image3);
		Icon icon4 = new ImageIcon(image4);

		button1 = new JButton(icon1);
		button1.setActionCommand(Integer.toString(startNumber));
		button1.addActionListener(bl);

		button2 = new JButton(icon2);
		button2.setActionCommand(Integer.toString(startNumber + 1));
		button2.addActionListener(bl);

		button3 = new JButton(icon3);
		button3.setActionCommand(Integer.toString(startNumber + 2));
		button3.addActionListener(bl);

		button4 = new JButton(icon4);
		button4.setActionCommand(Integer.toString(startNumber + 3));
		button4.addActionListener(bl);
	}

	/**
	 * Returning the file name of the chosen image for other parts of the
	 * programme.
	 */
	public void setFile(String s) {
		tabPane.setFile(s);
	}

}
