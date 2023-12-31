import java.util.Scanner;

public class Задача3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers separated by a space: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        reader.close();
        switch(op) {
            case '+': ans = num1 + num2;
            break;
            case '-': ans = num1 - num2;
            break;
            case '*': ans = num1 * num2;
            break;
            case '/': ans = num1 / num2;
            break;
            default:  System.out.printf("Error! Enter correct operator");
            return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
    

