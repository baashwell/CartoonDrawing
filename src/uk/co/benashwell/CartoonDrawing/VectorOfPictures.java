package uk.co.benashwell.CartoonDrawing;
import java.awt.*;
import java.util.*;

/**
 * class that contains the vector of picture images, allows drawing and clearing
 * of each element.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 * 
 */
public class VectorOfPictures {

	/** vector (list) of pictures */
	private Vector<Picture> pictures;

	/**
	 * Constructor that populates vector
	 */
	public VectorOfPictures() {
		pictures = new Vector<Picture>();
	}

	/**
	 * Add picture to vector
	 * 
	 * @param p
	 *            picture to add
	 */
	public void addPicture(Picture p) {
		pictures.add(p);
	}

	/**
	 * remove all pictures from vector
	 */
	public void clearPictures() {
		pictures.removeAllElements();
	}

	/**
	 * Draw all pictures in vector
	 * 
	 * @param g
	 *            Graphics object
	 */
	public void drawAll(Graphics g) {
		// temporary picture to hold ones from vector
		Picture pic;

		for (int i = 0; i < pictures.size(); i++) {

			pic = (Picture) (pictures.get(i));

			if (pic instanceof Image) {
				Image img = (Image) pic;
				img.convertToImage();
				pic.drawPicture(g);
			} else {
				TextBubble text = (TextBubble) pic;
				text.convertToImage();
				text.drawText(g);
			}

		}
	}

	/**
	 * Remove a picture at this co ordinate location
	 * 
	 * @param x
	 *            x co ordinate
	 * @param y
	 *            y co ordinate
	 */
	public void removepicture(int x, int y) {
		Picture pic;

		for (int i = 0; i < pictures.size(); i++) {
			pic = (Picture) (pictures.get(i));
			int picx = pic.getX();
			int picy = pic.getY();

			if ((picx - 60 < x && x < picx + 60)
					&& (picy - 60 < y && y < picy + 60)) {
				pictures.remove(i);
			}
		}
	}
}
