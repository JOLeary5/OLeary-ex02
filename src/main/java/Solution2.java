/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Prompt user to enter a string
    - count the # of characters in the string
    - return the # to the user
 */
import java.util.Scanner;

public class Solution2
{
    public static void main(String[] args)
    {
        int counter = 0;
        Scanner scanR = new Scanner(System.in);
        System.out.println("Enter a String for Character Count: ");
        String cString = scanR.nextLine();

        counter = cString.length();

        System.out.println(cString + " has " + counter + " characters.");
    }
}

