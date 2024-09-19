package edu.guilford;
import java.util.Random;
import java.util.Scanner;
//Daniel Sasser
//9/19/24
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("you will be rolling 10 dice, please chose how many sides the dice will have: "); //this line and the next line help to declare the number and sides
        int sides = scan.nextInt();
        System.out.println("How many dice would you like to roll: ");
        int number =scan.nextInt();
        int sum =0; //this line states the sum and starts it at 0

        Random rand = new Random();

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) {
            int diceRoll = rand.nextInt(1,sides + 1); //for this line i added plus one, to help make the sides 1 higer, allowing for the value you input for sides to appear
            sum += diceRoll; // this line adds the value of the dice roll to the sum
            //System.out.println("Dice roll " + diceRoll + "\t" + "sum of " + i + "d" + sides + " = " + sum);
        }

        System.out.println(number + "d" + sides + "=" + sum);
        scan.close();
    }
}