import java.util.Scanner;

public class compoundIntrest {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Welcome to to the compound interest calculator\n\n");
        System.out.print("Enter the principal amount : ");
        double principal=Input.nextDouble();
        System.out.print("Enter the rate of interest : ");
        double rate=Input.nextDouble();
        System.out.print("Enter the time in years : ");
        double time=Input.nextDouble();
        double compoundInterest=principal * Math.pow((1 + rate /100),time);
        System.out.println("The Compound interest is : "+compoundInterest);
        Input.close();
        System.out.println("\n Thanks for using our Application!");

    }
}
