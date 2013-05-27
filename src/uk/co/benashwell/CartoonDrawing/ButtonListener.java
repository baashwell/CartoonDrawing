package uk.co.benashwell.CartoonDrawing;
import java.awt.event.*;

/**
 * The ButtonListener Class implements ActionListener and is used to listen to
 * the button and set the appropriate filename.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 */
public class ButtonListener implements ActionListener {
	/** A String to hold the file name */
	private String file;
	/** ButtonPanel Object so can send the file name back */
	private ButtonPanel buttonPanel;

	/**
	 * The ButtonListener constructor sets up the link back to the ButtonPanel
	 * to pass the file name back.
	 * 
	 * @param bp
	 *            The panel that the listener is linked to
	 */
	public ButtonListener(ButtonPanel bp) {
		buttonPanel = bp;
	}

	/**
	 * The action performed method implemented so that when a button is pressed
	 * it can set the right file name.
	 */
	public void actionPerformed(ActionEvent e) {
		// pick up the action and convert to an integer
		int actionCommand = Integer.parseInt(e.getActionCommand());

		// switch dependent on what action happened
		switch (actionCommand) {
		case 1:
			file = "boyhappy.png";
			break;
		case 2:
			file = "boysad.png";
			break;
		case 3:
			file = "boytongue.png";
			break;
		case 4:
			file = "boyangry.png";
			break;
		case 5:
			file = "girlhappy.png";
			break;
		case 6:
			file = "girlsad.png";
			break;
		case 7:
			file = "girltongue.png";
			break;
		case 8:
			file = "girlangry.png";
			break;
		case 9:
			file = "circle.png";
			break;
		case 10:
			file = "square.png";
			break;
		case 11:
			file = "triangle.png";
			break;
		case 12:
			file = "star.png";
			break;
		case 13:
			file = "roundtextleft.png";
			break;
		case 14:
			file = "roundtextright.png";
			break;
		case 15:
			file = "bubbleleft.png";
			break;
		case 16:
			file = "bubbleright.png";
			break;

		}

		// return the file name
		returnFile();
	}

	/**
	 * Method to return the file name to the panel.
	 */
	public void returnFile() {
		buttonPanel.setFile(file);
	}
}
