import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Rectangle class - creates a rectangle with a certain length and width
 */
public class Rectangle implements Shape {
    private double length;
    private double width;

    /**
     * Rectangle constructor - reads file to set length and width of the rectangle
     * @param filename
     * @throws IOException
     */
    public Rectangle (File filename) throws IOException {
        Scanner infile = new Scanner (filename);
        String line = infile.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(line, "(,): ");
        tokenizer.nextToken();
        tokenizer.nextToken();
        int x1 = Integer.parseInt(tokenizer.nextToken());
        int y1 = Integer.parseInt(tokenizer.nextToken());
        String line2 = infile.nextLine();
        StringTokenizer tokenizer2 = new StringTokenizer(line2, "(,): ");
        tokenizer2.nextToken();
        tokenizer2.nextToken();
        int x2 = Integer.parseInt(tokenizer2.nextToken());
        int y2 = Integer.parseInt(tokenizer2.nextToken());
        length = x2 - x1;
        width = y2 - y1;
    }

    /**
     * default Rectangle constructor
     * sets Rectangle length and width to 0
     */
    public Rectangle (){
        length = 0;
        width = 0;
    }

    /**
     * calculates and returns area of rectangle
     * @return area
     */
    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    /**
     * calculates and returns perimeter of rectangle
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        double perimeter = ((length*2) + (width*2));
        return perimeter;
    }

    /**
     * returns rectangle length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * returns rectangle width
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * returns info about the rectangle as a string
     * @return output - length, width, area, and perimeter of rectangle
     */
    public String toString (){
        double area = getArea();
        double perimeter = getPerimeter();
        String output = ("Rectangle Length = " + length + ", Width = " + width + ", Area = " + area + ", Perimeter = " + perimeter);
        return output;
    }
}
