package Unit3;

/**
 * Description:
 * Date: 2024-12-17
 * @author Alex Reydman
 */
public class MathPlus {

    // Main method to test the distance method, hypotenuse method, numOfFactors method, and isPrime method
    public static void main(String[] args) {
        // Usage of distance method
        double x1 = 1.0, y1 = 2.0, x2 = 4.0, y2 = 6.0;
        double dist = distance(x1, y1, x2, y2);
        System.out.println("The distance between the points is: " + dist);

        // Example usage for calculating the hypotenuse
        double side1 = 3.0;
        double side2 = 4.0;
        
        // Calculate and print the hypotenuse
        double hypotenuse = calculateHypotenuse(side1, side2);
        System.out.println("The hypotenuse is: " + hypotenuse);
        
        // Example usage for numOfFactors method
        int number = 12;
        int factorsCount = numOfFactors(number);
        System.out.println("The number of factors of " + number + " is: " + factorsCount);

        // Example usage for isPrime method
        int primeCheck = 7;
        boolean isPrimeResult = isPrime(primeCheck);
        System.out.println("Is " + primeCheck + " prime? " + isPrimeResult);
    }

    // Method to calculate the distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        // Calculate the difference in x and y coordinates
        double dx = x2 - x1;
        double dy = y2 - y1;
        
        // Distance formula
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to calculate the hypotenuse of a right-angled triangle
    public static double calculateHypotenuse(double side1, double side2) {
        // Using the Pythagorean theorem: c = sqrt(a^2 + b^2)
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    // Method to calculate the number of factors of a given number
    public static int numOfFactors(int number) {
        int count = 0;
        
        // Loop through numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if i is a factor of number
                count++;  // Increment the count for each factor
            }
        }
        
        return count;  // Return the total number of factors
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Check if number is less than or equal to 1
        if (number <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // If divisible, number is not prime
            }
        }

        return true;  // If no divisors are found, number is prime
    }
}
