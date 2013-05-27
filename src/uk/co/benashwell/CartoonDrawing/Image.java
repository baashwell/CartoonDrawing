package uk.co.benashwell.CartoonDrawing;
/**
 * Class to hold information about image, that can then be used in the vector of
 * pictures
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 * 
 */
public class Image extends Picture {

	/**
	 * Constructor to call super constructor and set variables for this image
	 * 
	 * @param filename
	 *            Name of file to use for image.
	 * @param x
	 *            X position.
	 * @param y
	 *            Y position.
	 */
	public Image(String filename, int x, int y) {
		super(filename, x, y);
	}

}
