import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;
        
        while(continueCalc) {
            System.out.println("\n=== Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            
            int choice = sc.nextInt();
            
            if(choice == 5) {
                System.out.println("Thank you for using Calculator!");
                break;
            }
            
            if(choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result = 0;
            
            switch(choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if(num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
            }
        }
        
        sc.close();
    }
}
