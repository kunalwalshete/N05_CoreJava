package org.tns.assignmentone;
import java.util.Scanner;

public class CheckReverseNumber {

    public static boolean checkOrder(int[] pinkyNumbers, int[] maryNumbers) {
        for (int i = 0; i < pinkyNumbers.length; i++) {
            if (pinkyNumbers[i] != maryNumbers[maryNumbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many numbers is Pinky going to tell: ");
        int n = s.nextInt();
        s.nextLine();

        int[] pinkyNumbers = new int[n];
        int[] maryNumbers = new int[n];

        // Read the numbers said by Pinky
        System.out.println("Numbers told by Pinky: ");
        for (int i = 0; i < n; i++) {
            pinkyNumbers[i] = s.nextInt();
        }

        // Read the numbers said by Mary in reverse order
        System.out.println("Numbers told by Mary: ");
        for (int i = n - 1; i >= 0; i--) {
            maryNumbers[n - 1 - i] = s.nextInt();
        }

        // Check if the order is correct
        boolean isOrderCorrect = checkOrder(pinkyNumbers, maryNumbers);

        if (isOrderCorrect) {
            System.out.println("Yes, the numbers are in correct order.");
        } else {
            System.out.println("No, the numbers are not in correct order.");
        }
    }
}
