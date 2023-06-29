import java.util.Scanner;

public class Задача1 {

    public static void main(String[] args) {
       num();
    }
    static void num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input yuor num: ");
        int num =sc.nextInt();
        int sum = 0;
        int fact =1;
        for (int index = 0; index < num; index++) {
            sum+=index+1;    
        }
        for (int index = 0; index < num; index++) {
            fact *=index+1;
        }
        System.out.printf("Factorial num = %d",fact);
        System.out.printf("\nSumma at1 to num = %d",sum);
        sc.close();
    }
}