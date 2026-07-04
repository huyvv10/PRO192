
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap giai thuong ban dat duoc: ");
        int n = sn.nextInt();
        switch (n){
            case 1:
                System.out.println("Ban dat giai nhat duoc thuong 1000000");
                break;
            case 2:
                System.out.println("Ban dat giai nhi duoc thuong 500000");
                break;
            case 3:
                System.out.println("Ban dat giai ba duoc thuong 200000");
                break;
            case 4:
                System.out.println("Ban dat giai khuyen khich duoc thuong 10000");
                break;
            default:
                System.out.println("Chuc ban may man lan sau.");
                break;
        }
    }
}
