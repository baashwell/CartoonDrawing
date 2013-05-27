package uk.co.benashwell.CartoonDrawing;
import java.awt.Graphics;

/**
 * Class to deal with and hold all the information about text bubbles, or any
 * picture with text in.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 * 
 */
public class TextBubble extends Picture {

	/** text for the image */
	private String caption;
	/**
	 * constructor to set the text bubbles variables
	 * 
	 * @param FileName
	 *            name of the file for the image
	 * @param caption
	 *            text for this image
	 * @param x
	 *            x co ordinate
	 * @param y
	 *            y co ordinate
	 */
	public TextBubble(String FileName, String caption, int x, int y) {
		super(FileName, x, y);
		this.caption = caption;
	}

	/**
	 * set the caption
	 * 
	 * @param s
	 *            text for caption
	 */
	public void setCaption(String s) {
		s = caption;
	}

	/**
	 * get the caption
	 * 
	 * @return caption
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * Draw the text and image onto the canvas
	 * 
	 * @param g
	 *            Graphics object
	 */
	public void drawText(Graphics g) {
		g.drawImage(image, x, y, this);
		g.drawString(caption, x + 30, y + 80);
	}

}
