import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;

        while (true) {
            System.out.print("Miles driven (-1 to exit): ");
            int miles = scanner.nextInt();

            // Check for sentinel value to exit the loop
            if (miles == -1) {
                break;
            }

            System.out.print("Gallons used: ");
            int gallons = scanner.nextInt();

            // Calculate miles per gallon for the current trip
            int mpg = miles / gallons;

            System.out.println("Miles per gallon: " + mpg);

            // Update the total miles and total gallons
            totalMiles += miles;
            totalGallons += gallons;
            tripCount++;
        }

        // Calculate and display the overall miles per gallon
        if (tripCount > 0) {
            int overallMpg = totalMiles / totalGallons;
            System.out.println("Overall miles per gallon: " + overallMpg);
        } else {
            System.out.println("No trips recorded.");
        }

        scanner.close();
    }
}
