import java.util.Scanner;

class BarChart {
    private int numberOfAsterisks;

    public BarChart(int numberOfAsterisks) {
        this.numberOfAsterisks = numberOfAsterisks;
    }

    public void displayBar() {
        for (int i = 0; i < numberOfAsterisks; i++) {
            System.out.print("*");
        }
        System.out.println(); // Print a newline after displaying the asterisks
    }
}