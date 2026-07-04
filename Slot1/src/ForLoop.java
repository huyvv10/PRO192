
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sn.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 0; i <= n; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = n; i >=0; i--) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = n; i >=0; i-=2) {
            System.out.print(i+" ");
        }        
        System.out.println("");
    }
}
