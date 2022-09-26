import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two double values");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Enter a Addition for add,Subtraction for sub,Multiplication for mul and Division for div");
		String operator = scan.next();
		switch(operator){
		case "add": System.out.println("Addition of a+b= "+(a+b));
		break;
		case "sub": System.out.println("Subtraction of a-b= "+(a-b));
		break;
		case "mul": System.out.println("Multipalication of a*b= "+(a*b));
		break;
		case "div": System.out.println("Division of a/b= "+(a/b));
		break;
		default: System.out.println("Invalid operator");
		}
	}

}
