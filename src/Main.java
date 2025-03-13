import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];
        int sum = 0;
        double average = 0.0;
        int userInput = 0;
        int timesFound = 0;
        int userInput2 = 0;
        boolean numberFound = false;
        int maxValue = dataPoints[0];
        int minValue = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
            average = (double) sum / dataPoints.length;
        }

        System.out.println("\nThe sum of the random array (dataPoints) is " + sum);
        System.out.println("The average of the random array (dataPoints) is " + average);

        userInput = SafeInput.getRangedInt(in, "Please input an integer that is between 1-100", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                timesFound++;
            }

        }

        System.out.println("The user's input, " + userInput + ", was found " + timesFound + " times in the array.");

        userInput2 = SafeInput.getRangedInt(in, "Please input a second integer that is between 1-100", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                System.out.println("The user's input, " + userInput2 + ", was found at array index " + i + " within the array.");
                numberFound = true;
                break;
            }

        }

        if (!numberFound) {
            System.out.println("The user's input, " + userInput2 + ", was not found in array index.");
        }

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }

        System.out.println("\nThe minimum value in the dataPoints array is " + minValue + ".");
        System.out.println("The maximum value in the dataPoints array is " + maxValue + ".");

        System.out.println("\nAverage of dataPoints is " + getAverage(dataPoints));

    }

    public static double getAverage(int values[]) {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
            return (double) sum / values.length;


    }

}