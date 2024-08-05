import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner Area=new Scanner(System.in);
        System.out.print("Enter the Base of the rectangle:");
        double Base=Area.nextDouble();
        System.out.print("Enter the hight of the rectangle:");
        double hight=Area.nextDouble();
        double area=((0.5)*Base*hight);
        System.out.println("The area of the rectangle is: "+area);
    }
}
