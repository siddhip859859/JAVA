import java.util.Scanner;
public class A2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a=0.0;
	double b=0.0;
	System.out.println("Enter Value 1: ");
	if(sc.hasNextInt() || !sc.hasNextDouble()) {
		System.out.print("ERR : Enter double value!!");
		sc.next();
	}
	else {
		a=sc.nextDouble();
		}
	
	System.out.println("Enter Value 2: ");
	if(sc.hasNextInt() || !sc.hasNextDouble()) {
		System.out.print("ERR : Enter double value!!");
		sc.next();
	}
	else {
		b=sc.nextDouble();
		
		
		}
	System.out.println("Avg : "+ (a+b/2));
	
	
	
}
}