import java.util.Scanner;

class Distan {
    public static void main(String arg[])

    {
        // Variable Declaration
        int x1, x2, y1, y2;

        double distance;

        // Accepting User Inputs

        Scanner king = new Scanner(System.in);

        System.out.println("Enter value for X1");

        x1 = king.nextInt();

        System.out.println("Enter for Y1");

        y1 = king.nextInt();

        System.out.println("Enter value for X2");

        x2 = king.nextInt();

        System.out.println("Enter for Y2");

        y2 = king.nextInt();

        // calculating the Square root of th
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        // printing the Output
        System.out.println("Distance Between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is " + distance);

    }

}