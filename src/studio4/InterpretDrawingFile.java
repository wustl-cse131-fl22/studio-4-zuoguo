package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String type = in.next();
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		int x3 = in.nextInt();
		Boolean T1 = in.nextBoolean();
		double x4 = in.nextDouble();
		double x5 = in.nextDouble();
		double x6 = in.nextDouble();
		double x7 = in.nextDouble();
		Color purple = new Color(x1, x2, x3);
		StdDraw.filledEllipse(x4, x5, x6, x7);


		
	}

	private static void filledEllipse(double x4, double x5, double x6, double x7) {
		// TODO Auto-generated method stub
		
	}
}
