
import java.util.Scanner;

public class Vidu1 {
    public static void main(String[] args) {
//        datatype tenbien
        int n=5, m=7;
        char c1 = 'F', c2='P', c3='T';
        float f=7.5F;
        double d;
        boolean flag;
        String str = "Vu Van Huy";
        System.out.println(n + " + " + m + " = "+ (m+n));
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        n = sn.nextInt();
        System.out.print("Input m = ");
        m = sn.nextInt();
        System.out.println(n + " + " + m + " = "+ (m+n));
        System.out.println(n + " - " + m + " = "+ (n-m));
        System.out.println(n + " * " + m + " = "+ (m*n));
        System.out.println(n + " / " + m + " = "+ ((float)n/m));
        System.out.println(n + " / " + m + " = "+ 
                String.format("%.2f",(float)n/m));

        System.out.println((int)c1); 
        System.out.println(c1+c2+c3);
        System.out.println(c1+""+c2+""+c3);
        System.out.print("Input a string: ");
        str = sn.nextLine();
        System.out.println("Inputed string: "+ str);
        System.out.println("Vi tri thu 2: "+str.charAt(1));
        
        System.out.print("Input a character: ");
        c1 = sn.next().charAt(0);
        System.out.println("Inputed character: "+c1);
        System.out.print("Input your gpa: ");
        f = sn.nextFloat();
        System.out.println("Your GPA is: " + f);
        System.out.print("Input your salary: ");
        d = sn.nextDouble();
        System.out.println("Your salary is: " + d);
       
    }
}
