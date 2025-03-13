import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] dataPoints = new int[100];
        int sum = 0;
        double average = 0.0;

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

    }
}