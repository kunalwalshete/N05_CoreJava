package org.tns.challenges;

public class ReversibleNumbers {
    public static int countReversibleNumbers(int size) {
        int count = 0;

        // Loop through numbers from 1 to the given size
        for (int i = 1; i <= size; i++) {
            // Check if the number meets the reversible conditions
            if (isReversible(i)) {
                count++;
            }
        }

        return count;
    }

    // Helper method to check if a number is reversible
    private static boolean isReversible(int num) {
        // Check for leading zeroes or duplicate digits in the number
        if (num % 10 == 0 || containsDuplicateDigits(num)) {
            return false;
        }

        // Calculate the reverse of the number
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        // Calculate the sum of the number and its reverse
        int sum = num + reverse;

        // Check if the sum is odd
        return sum % 2 != 0;
    }

    // Helper method to check if a number contains duplicate digits
    private static boolean containsDuplicateDigits(int num) {
        boolean[] digitsSeen = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (digitsSeen[digit]) {
                return true;
            }
            digitsSeen[digit] = true;
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int size = 30;
        int result = countReversibleNumbers(size);
        System.out.println("There are " + result + " reversible numbers under " + size + " as follows:");
        for (int i = 1; i <= size; i++) {
            if (isReversible(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
