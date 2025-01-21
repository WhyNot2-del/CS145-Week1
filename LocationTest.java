// Names: Brody Weinkauf, Jackson [LastName], Christopher [Lastname]
// Class: CS 145
// Date: 1/21/2025 12:05PM
// Assignment 1
// Purpose: To take in user input and create a multi-dimensional array

// imports Scanner class
import java.util.Scanner;

public class LocationTest {

    public static void main(String[] args) {

        // initializes variables
        /* Probably create an object from the constructor class */
        Scanner line = new Scanner(System.in);
        Scanner token = new Scanner(System.in);
        Integer column = 0;
        Integer row = 0;
        String lines = "";
        int nums = 0;

        //  Scanner reads user input to create the multi-dimensional array parameters
        System.out.println("Please enter the # of rows");
        row = token.nextInt();
        System.out.println("Please enter the # of columns");
        column = token.nextInt();

        int largestNum[][] = new int[row][column];

        //  takes in user inputs and adds each number to the correct location in the multi-dimensional array
        for (int i = 0; i < row; i++) {
            System.out.printf("%s%d%s%d%s%n", "Please enter the numbers of row", i+1, " each number seperated by a space. ", column, " numbers needed.");
            lines = line.nextLine();
            //  seperates each number inputted by a space and puts them into an array
            String digits[] = lines.split(" ");
            //  parses the String variables into ints and places them into the correct location in the multi-dimensional array
            for (int j = 0; j < column; j++) {
                nums  = Integer.parseInt(digits[j]);
                largestNum[i][j] = nums;
            }  // ends nested for loop
        }  // ends for loop

        /* Call method from manager class {Honestly how I write this section is determined upon how the manager class is set up} */

        /* Example of what the output may look like. Will add a little visual of the array with the largest number in brackets which may be best done with a method
         * in the Manager class. */
         // System.out.printf("%s%d%s%d%s%d%s", "The largest number is: ", Object.getMaxValue(), " Located at (", Object.getRow(), ",", Object.getColumn(), ")");

    }  // ends main method
}  // ends LocationTest class