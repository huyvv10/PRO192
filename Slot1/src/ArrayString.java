
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sn.nextInt();
        sn.nextLine();
        
        String [] name = new String[n];
        for (int i = 0; i < name.length; i++) {
            System.out.print("name["+(i+1)+"] = ");
            name[i] = sn.nextLine();
        }
        
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+" ");
        }
    }
}
