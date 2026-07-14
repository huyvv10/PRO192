
public class SortArray {

    //Bubble sort asc
    public static void sortAsc(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int tg = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tg;
                }
            }
        }
    }

    //Bubble sort asc
    public static void sortPos1Pos2Asc(int a[], int pos1, int pos2) {
        for (int i = pos1; i < pos2 - 1; i++) {
            for (int j = pos2 - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int tg = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tg;
                }
            }
        }
    }

    //Bubble Sort desc
    public static void sortDesc(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] < a[j]) {         //Swap > to <
                    int tg = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tg;
                }
            }
        }
    }

    //Find maximum value
    public static int findMax(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //Find minimum value
    public static int findMin(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int findFirstPos(int a[], int x) {
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static int findFirstPos2(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    //Count number of even elements
    public static int countEven(int a[]){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) count++;
        }
        return count;
    }
    
    //Count number of odd elements
    public static int countOdd(int a[]){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 1) count++;
        }
        return count;
    }

    //Return true if n is a prime number; Reuturn false otherwise
    public static boolean isPrime(int n){
        if (n<2) return false;
        for (int i = 2; i*i <= n ; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    public static void displayPrime(int a[]){
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]))
                System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public static int countPrime(int a[]){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) count++;                
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 6, 3, 8, 11,9, 7, 9, 5};
        System.out.println("Maximum value: " + findMax(arr));
        System.out.println("Minimum value: " + findMin(arr));
        System.out.println("Position of first max: " + findFirstPos(arr, findMax(arr)));
        System.out.println("Position of first min: " + findFirstPos(arr, findMin(arr)));
        display(arr);
        sortPos1Pos2Asc(arr, findFirstPos(arr, findMin(arr)), findFirstPos(arr, findMax(arr)));
        display(arr);
        System.out.println("Numbwer of even elements: "+countEven(arr));
        System.out.println("Numbwer of odd elements: "+countOdd(arr));
        System.out.println("List prime numbers: ");
        displayPrime(arr);
        System.out.println("Number of primes: "+countPrime(arr));
    }
    
}
