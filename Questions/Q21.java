package Questions;
import java.util.*;

public class Q21 {
    static double cal(double a,double b,double c){
        return Math.pow(a,3)+(3*Math.pow(a,2)*b)+3*Math.pow(b,2)*a+Math.pow(b, 3);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        scanner.close();
        System.out.println(cal(a, b, c));
    }
}
