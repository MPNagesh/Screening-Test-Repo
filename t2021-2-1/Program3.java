import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a%2==0){
			for(int i=1; i<=a-1; i++){
				System.out.print((2*i-1)+" ");
			}
		}
		else{
			for(int i=1;i<=a; i++){
				System.out.print((2*i-1)+" ");
			}
		}
		
	}

}
