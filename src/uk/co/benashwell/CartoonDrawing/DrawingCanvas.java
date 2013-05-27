package uk.co.benashwell.CartoonDrawing;
import javax.swing.*;

import java.awt.*;

/**
 * DrawingCanvas class extends Jpanel and is used to set up the panel which will
 * be used to place the images on.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 */
@SuppressWarnings("serial")
public class DrawingCanvas extends JPanel {
	/** A class which contains a vector of pictures to be used */
	private VectorOfPictures vop;

	/**
	 * This constructor sets the size and colour of the drawing canvas
	 */
	public DrawingCanvas() {
		vop = new VectorOfPictures();
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(700, 400));
	}

	/**
	 * Paint Component method calls the super method and then runs method draw
	 * all in the VectorOfPictures Object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		vop.drawAll(g);
	}

	/**
	 * This Method creates a Picture Object using the parameters given it then
	 * runs the add picture method in the VectorOfPictures Object and then
	 * lastly repaints the canvas
	 * 
	 * @param filename
	 *            file name of picture to be added
	 * @param x
	 *            x co ordinate of click
	 * @param y
	 *            y co ordinate of click
	 */
	public void addPic(String filename, int x, int y) {
		// change coords so appears in middle of click
		// but means all pictures must be the same size 170px * 170px
		x -= 87;
		y -= 87;
		Image i = new Image(filename, x, y);
		vop.addPicture(i);
		repaint();
	}

	/**
	 * Method to add a text box to the canvas
	 * 
	 * @param filename
	 *            filename of textbox
	 * @param caption
	 *            the caption to go within the text box
	 * @param x
	 *            x position of click
	 * @param y
	 *            y position of click
	 */
	public void addText(String filename, String caption, int x, int y) {
		x -= 87;
		y -= 87;
		TextBubble text = new TextBubble(filename, caption, x, y);
		vop.addPicture(text);
		repaint();
	}

	/**
	 * This method clears the screen by calling the VectorOfPictures method
	 * clearPictures and then repaints the canvas
	 */
	public void clear() {
		vop.clearPictures();
		repaint();
	}

	/**
	 * This method calls removepicture to remove one image from the canvas then
	 * repaints the canvas
	 * 
	 * @param x
	 *            x co ordinate of picture to remove
	 * @param y
	 *            y co ordinate of picture to remove
	 */
	public void removepicture(int x, int y) {
		vop.removepicture(x, y);
		repaint();
	}

}
