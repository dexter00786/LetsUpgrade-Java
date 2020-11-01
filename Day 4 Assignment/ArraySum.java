

import java.util.Scanner;

public class ArraySum {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int sum;
    public void setArray(){
        System.out.println("Enter the values of Array :");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void arraySum(){
        for(int i = 0; i<5; i++){
            sum = arr[i] + sum;
        }
        System.out.println("Sum of the array is "+sum);
    }

    public static void main(String[] args) {
        ArraySum ar = new ArraySum();
        ar.setArray();
        ar.arraySum();
    }
}
