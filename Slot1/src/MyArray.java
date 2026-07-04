
import java.util.Scanner;

public class MyArray {

    public static void displayArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void inputArray(int a[]) {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sn.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //C1: vua khai bao vua khoi tao
        int arr[] = {5, 6, 7, 2, 6, 9, 2};
        displayArr(arr);

        System.out.print("Input number of elements n = ");
        int n = sn.nextInt();
        //C2: Xin cap phat 1 mang gom n phan tu
        int[] arr2 = new int[n];
        inputArray(arr2);
        displayArr(arr2);
    }
}
