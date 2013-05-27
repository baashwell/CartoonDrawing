package uk.co.benashwell.CartoonDrawing;
import java.awt.*;
import java.awt.Image;
import java.awt.image.ImageObserver;

/**
 * A class to hold the image location and file name, also holds the methods to
 * draw each picture.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 * 
 */
public class Picture implements ImageObserver {

	/** X co ordinate */
	protected int x;
	/** Y co ordinate */
	protected int y;
	/** an image object that is given a file name and creates a viewable image */
	protected java.awt.Image image;
	/** file name of the image wanted */
	protected String filename;

	/**
	 * Constructor to set variables of class
	 * 
	 * @param filename
	 *            name of file to use for image
	 * @param x
	 *            x co ordinate of image
	 * @param y
	 *            y co ordinate of image
	 */
	public Picture(String filename, int x, int y) {
		this.filename = filename;
		this.x = x;
		this.y = y;
	}

	/**
	 * Method to actually draw image
	 * 
	 * @param g
	 *            a graphics object
	 */
	public void drawPicture(Graphics g) {
		g.drawImage(image, x, y, this);
	}

	/**
	 * method to convert the file name of this object to an image, populates
	 * image variable
	 */
	public void convertToImage() {
		image = Toolkit.getDefaultToolkit().getImage(filename);
	}

	/**
	 * get x co ordinate
	 * 
	 * @return x co ordinate
	 */
	public Integer getX() {
		return x;
	}

	/**
	 * get y co ordinate
	 * 
	 * @return y cordinate
	 */
	public Integer getY() {
		return y;
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}
}
