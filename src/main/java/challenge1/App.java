package challenge1;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

/*Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string
and the number of characters the string contains.

Example Output
What is the input string? Homer
Homer has 5 characters.

Constraints
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

Challenges
If the user enters nothing, state that the user must enter something into the program.

*/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String inputString = input.nextLine();


        if(inputString.isEmpty()) {
            System.out.println("You must enter something into the program");
        } else {
            int inputLenghth = inputString.length();
        System.out.println(inputString + " has " + inputLenghth + " characters.");
       }
    }
}
