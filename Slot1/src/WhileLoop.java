import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        //Tim USCLN cua 2 so a va b
        Scanner sn = new Scanner(System.in);
        System.out.print("Input a = ");
        int a = sn.nextInt();   
        System.out.print("Input b = ");
        int b = sn.nextInt();  
        int x,y;
        x=a; y=b;
        while (a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("USCLN la: "+a);
        System.out.println("USCLN cua "+x+" va "+y+" la: "+a);
        //Tinh tong cac so tu 1 den n
//        int i=0, S=0;
//        while (i<=n){
//            S+=i;   //S=S+i;
//            i++;
//        }
//        System.out.println("Total value to "+n+" is: "+ S);
//        while (condition){
//            Statements
//        }
        
    }
}
