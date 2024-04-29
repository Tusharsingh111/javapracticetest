import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance:");
        double Distance = sc.nextDouble();
        double km = 0.621371;
        System.out.println(Distance*km);
    }
}
