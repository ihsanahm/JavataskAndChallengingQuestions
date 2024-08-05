import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Length of rectangle : ");
        int length=input.nextInt();
        System.out.print("Enter the Width of rectangle : ");
        int width=input.nextInt();
        int perimeter=2*(length+width);
        System.out.println("Perimeter of rectangle is : "+perimeter);
    }
}
