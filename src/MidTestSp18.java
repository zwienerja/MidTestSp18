import javax.swing.*;
import java.io.File;
import java.io.IOException;

/*
@author Jared Zwiener
algorithm:
    1. get coordinate input file
    2. set rectangle shape and variables based on coordinates
    3. implement shape interface's rules
    4. output rectangle and shape info in main method

UNK CSIT 150 Midterm 2018
This is the driver program to test the exam code
written by individual students.

Students:
Be sure to use the package: midterm150 for the code.
You should NOT need to modify this program.
Your code in the Shape and Rectangle programs should be designed to work with this test code.

 */
public class MidTestSp18 {

    /**
     * Main method
     * creates a rectangle from an input file
     * outputs information about the rectangle including length, width, area, and perimeter
     * @param args
     * @throws IOException
     */
    public static void main (String[] args)throws IOException
    {
        File inputFile = getInputFile();
        Rectangle r = new Rectangle(inputFile);
        System.out.println(r);
        System.out.println("Rectangle r length = "+r.getLength());
        System.out.println("Rectangle r width = "+r.getWidth());
        System.out.println("Rectangle r area = "+r.getArea());
        System.out.println("Rectangle r perimeter = "+r.getPerimeter());

        Shape s = new Rectangle(inputFile);
        System.out.println("Shape: "+ s);
        System.out.println("Shape s area = "+s.getArea());
        System.out.println("Shape s perimeter = "+s.getPerimeter());
    }
    /**
     * get input file
     *
     * @return Scanner file for input
     * @throws IOException
     */
    private static File getInputFile() throws IOException {
        // Get the INPUT filename.
        JFileChooser chooser = new JFileChooser();
        File home = new File(System.getProperty("user.home"));
        chooser.setCurrentDirectory(home);
        int status = chooser.showOpenDialog(null);

        if (status != JFileChooser.APPROVE_OPTION) {
            System.out.println("No File Chosen");
            System.exit(0);
        }

        // Open the file.
        return chooser.getSelectedFile();
    }

}
