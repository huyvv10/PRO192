
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyArray {
    public static void display(int arr[]){
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }       
         System.out.println("");
    }
    public static void displayReverse(int arr[]){
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }      
   
    public static void main(String[] args) {
        int [] arr ={6,4,3,6,3,8,9,2,9,5};
        
        display(arr);
        displayReverse(arr);
        
        int n=6;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = sn.nextInt();
        int [] arr2 = new int[n];
        
        //Input an array        
        for (int i = 0; i < n; i++) {
            System.out.print("arr2["+i+"] = ");
            arr2[i] = sn.nextInt();
        }
        display(arr2);

//        Sort Asc collection
        Arrays.sort(arr);
        System.out.println("After sorting");
        display(arr);
        
    }
}
