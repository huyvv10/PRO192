
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int age;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input your age: ");
        age = sn.nextInt();
        
        if (age>=18)
            System.out.println("Adult");
        else
            System.out.println("Children");
        
        String rs = age>=18? "Đủ tuổi kết hôn" : "Còn non";
        System.out.println(rs);        
        
    }
}
