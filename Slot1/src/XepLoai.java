
import java.util.Scanner;


public class XepLoai {

    public static void main(String[] args) {
        float gpa;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input your gpa = ");
        gpa = sn.nextFloat();
        if (gpa >= 9)
            System.out.println("Excellence");
        else if (gpa >= 8)
            System.out.println("Good");
        else if (gpa >= 7)
            System.out.println("Well");
        else if (gpa >= 5)
            System.out.println("Fair");
        else
            System.out.println("Poor");

    }
//    Bậc 1 (0 - 50 kWh    ): 1.984 VNĐ
//    /kWh Bậc 2 (51 - 100 kWh    ): 2.050 VNĐ
//    /kWh Bậc 3 (101 - 200 kWh    ): 2.380 VNĐ
//    /kWh Bậc 4 (201 - 300 kWh    ): 2.998 VNĐ
//    /kWh Bậc 5 (301 - 400 kWh    ): 3.350 VNĐ
//    /kWh Bậc 6 (Từ 401 kWh trở lên    ): 3.460 VNĐ    /kWh          
}
