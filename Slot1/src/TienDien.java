
import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so kw dien da tieu thu: ");
        int n = sn.nextInt();
        int S = 0;
        if (n<=100)
            S = n * 1984;
        else if (n<=200)
            S = 100 * 1984 + (n-100)*2380;
        else if (n<=400)
            S = 100*1984 + 100*2380 + (n-200)*2998 ;
        else if (n<=700)
            S = 100*1984 + 100*2380 + 200*2998 + (n-400)*3571;
        else
            S = 100*1984 + 100*2380 + 200*2998 + 300*3571 +(n-700)*3967;
        System.out.println("Tong so tien phai tra: "+S);
        System.out.println("Tong so tien phai tra bao gom 10% VAT: "+ (S*1.1));
    }
}
