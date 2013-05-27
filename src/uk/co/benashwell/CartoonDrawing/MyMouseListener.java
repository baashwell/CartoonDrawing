package uk.co.benashwell.CartoonDrawing;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * The MyMouseListener Class implements MouseListener and is sued to listen to
 * the canvas and then the mouse is clicked on it register its co ordinates and
 * send it to the model.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 */
public class MyMouseListener implements MouseListener {
	/** VectorOfPictures Object used to run methods in the model. */
	private DrawingCanvas canvas;
	/** TabbedPane Object used to gain the file name */
	private TabbedPane tabpane;

	/**
	 * Mouse Listener Constructor used to link the frame and also create the
	 * model.
	 * 
	 * @param cf
	 */
	MyMouseListener(DrawingCanvas dc, TabbedPane tp) {
		canvas = dc;
		tabpane = tp;
	}

	/**
	 * mouseClicked method used to get the coordinates and file name and send to
	 * the model.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		int ID = e.getButton();
		// left button clicked
		if (ID == 1) {
			if (tabpane.getFile() == null) {
				JOptionPane.showMessageDialog(null,
						"Please Choose an Object to draw");
			} else {
				String s = tabpane.getFile();
				if (s == "roundtextleft.png" || s == "roundtextright.png"
						|| s == "bubbleleft.png" || s == "bubbleright.png") {
					String text = JOptionPane.showInputDialog(null,
							"Enter text here", "Enter text here",
							JOptionPane.QUESTION_MESSAGE);
					canvas.addText(s, text, e.getX(), e.getY());
				} else {
					canvas.addPic(s, e.getX(), e.getY());
				}
			}
		}
		// right button clicked
		else if (ID == 3) {
			int x = e.getX();
			int y = e.getY();
			x -= 87;
			y -= 87;

			canvas.removepicture(x, y);
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}
