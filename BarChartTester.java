import java.util.Scanner;

public class BarChartTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int inputNumber = scanner.nextInt();

            BarChart barChart = new BarChart(inputNumber);
            barChart.displayBar();
        }

        scanner.close();
    }
}