import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    
	public void setArray(){
    System.out.println("\nEnter the values of array:");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
    }
    
	public void getOdd(){
        for(int i = 0; i<5; i++){
            if(arr[i]%2!=0) {
                System.out.println(arr[i]);
            }
        }
    
	}
	public static void main(String[] args){
		Array a = new Array();
        a.setArray();
        a.getOdd();
	}
	
}