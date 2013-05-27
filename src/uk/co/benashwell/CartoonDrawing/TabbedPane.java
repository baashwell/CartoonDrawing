package uk.co.benashwell.CartoonDrawing;
import java.awt.*;
import javax.swing.*;

/**
 * This class sets up the tabbed panel to be used to choose which image to place
 * on the canvas.
 * 
 * @author Ben Ashwell, Martin Key, Abel Toro
 */
@SuppressWarnings("serial")
public class TabbedPane extends JTabbedPane {

	/** The file name to be used for each different button */
	private String file;

	/**
	 * constructor that creates each tab and adds them to the panel
	 */
	public TabbedPane() {

		// keeps track of which panel you are creating
		int x = 1;

		JPanel panel1 = new ButtonPanel(new GridLayout(1, 4), x, this);
		x++;
		JPanel panel2 = new ButtonPanel(new GridLayout(1, 4), x, this);
		x++;
		JPanel panel3 = new ButtonPanel(new GridLayout(1, 4), x, this);
		x++;
		JPanel panel4 = new ButtonPanel(new GridLayout(1, 4), x, this);

		this.addTab("Boys", null, panel1);
		this.addTab("Girls", null, panel2);
		this.addTab("Shapes", null, panel3);
		this.addTab("Text Box", null, panel4);

	}

	/**
	 * Set the name of the file
	 * 
	 * @param s
	 *            name to set file to
	 */
	public void setFile(String s) {
		file = s;
	}

	/**
	 * Get the name of the file
	 * 
	 * @return the file name
	 */
	public String getFile() {
		return file;
	}
}
