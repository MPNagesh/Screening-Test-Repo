import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[9];
		for(int i=0; i<=arr.length-1; i++){
			arr[i] =i+1;
		}
		System.out.println("Enter a number");
		int a =scan.nextInt();
		int[]arr1 =new int[a];
		System.out.println("Enter any integers");
		for(int i=0; i<=arr1.length-1; i++){
			arr1[i]=scan.nextInt();
		}
		for(int i=0; i<=arr.length-1; i++){
			int count =0;
			for(int j=0; j<=arr1.length-1; j++){
				if(arr1[j]%arr[i]==0){
					count++;
				}
			}
			System.out.print(arr[i]+":"+count+",");
		}
	}

}
