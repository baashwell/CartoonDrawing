package uk.co.benashwell.CartoonDrawing;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 * The MenuListener class Implements ActionListener and is used to listen to the
 * Frames menu and act to what happens in it.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 */
public class MenuListener implements ActionListener {
	/** CartoonFrame Object used to link back to the frame */
	private CartoonFrame cf;

	/**
	 * The Menu Listener Constructor Links the Listener to the Frame
	 * 
	 * @param frame
	 */
	public MenuListener(CartoonFrame frame) {
		cf = frame;
	}

	/**
	 * The actionPerformed Method is implemented to pick up when the menu is
	 * used and to act accordingly.
	 */
	public void actionPerformed(ActionEvent e) {
		// get the command being used
		String actionCommand = e.getActionCommand();

		if (actionCommand.equals("Exit")) {
			int answer = JOptionPane.showConfirmDialog(cf, "Are you sure?",
					"Exit Confirmation", JOptionPane.YES_NO_OPTION);
			if (answer == JOptionPane.YES_OPTION) {
				System.exit(0);
			} else if (answer == JOptionPane.NO_OPTION) {
			}
		}
		// clear canvas or set canvas colour
		else if (actionCommand.equals("Clear")) {
			cf.clearCanvas();
		} else if (actionCommand.equals("White")) {
			cf.colourChange(Color.white);
		} else if (actionCommand.equals("Blue")) {
			cf.colourChange(Color.blue);
		} else if (actionCommand.equals("Red")) {
			cf.colourChange(Color.red);
		} else if (actionCommand.equals("Yellow")) {
			cf.colourChange(Color.yellow);
		} else if (actionCommand.equals("Green")) {
			cf.colourChange(Color.green);
		} else if (actionCommand.equals("Choose Your Own")) {
			// Shows the colour chooser window.
			Color c = JColorChooser.showDialog(null, "Choose Your Colour",
					Color.white);
			cf.colourChange(c);
		}
	}
}
