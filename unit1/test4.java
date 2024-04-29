import java.util.*;
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height: ");
        double initialHeight = sc.nextDouble();
        System.out.print("Enter the weeks growing: ");
        int weeks = sc.nextInt();
        System.out.println((weeks*0.5)+(initialHeight));
    }
}
