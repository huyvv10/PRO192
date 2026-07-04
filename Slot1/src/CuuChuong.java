
import java.util.Scanner;

public class CuuChuong {
    public static void main(String[] args) {
        //Nhap n tu ban phim
        //In ra bang cuu chuong cua n
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sn.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x "+ i + " = "+n*i);
        }
        System.out.println("");
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j < 10; j++) 
                System.out.print(j + " x " + i + " = "+ i*j+"\t");
            System.out.println("");
        }
    }
}
