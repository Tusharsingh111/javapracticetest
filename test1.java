import java.util.Scanner;
public class test1{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1 + " ");
            }
            System.out.println(" ");
        }
    }
}