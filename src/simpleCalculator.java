import java.util.Scanner;


public class simpleCalculator {
    public static void main(String[]args ){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to simple calculator");
        System.out.print("Please Enter a Number :");
        int num1=input.nextInt();
        System.out.print(" Now,Please Enter An other  Number :");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of  numbers are : "+ sum);


    }
}
