import java.util.Scanner;

public class ThreeIntergers {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int number1;
    	int number2;
    	int number3;
    	int sum;
    	int average;
    	int product;
    	int smallest;
    	int largest;
    	
    	//prompt for three integers
    	System.out.print("Enter an integer: ");
    	number1 = input.nextInt();
    	System.out.print("Enter an integer: ");
    	number2 = input.nextInt();
    	System.out.print("Enter an integer: ");
    	number3 = input.nextInt();
    	
    	
    	//Calculate sum
    	sum = number1 + number2 + number3;
    	
    	//Calculate average
    	average = sum / 3;
    	
    	//Calculate product
    	product = number1 * number2 * number3;
    	
    	//Calculate smallest
    	smallest = Math.min(Math.min(number1, number2 ), number3);
    	
    	//Determine largest
    	largest = Math.max(Math.max(number1, number2), number3);
    	
    	//Display results
    	System.out.printf("sum = %d%n", sum);
    	System.out.printf("average = %d%n", average);
    	System.out.printf("product = %d%n", product);
    	System.out.printf("smallest = %d%n",smallest);
    	System.out.printf("largest = %d%n", largest);
    	
    	input.close(); //Close the scanner
    }
}
