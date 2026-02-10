package test;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("working 0 to 26 programs ");

Scanner y=new Scanner(System.in);

int h =y.nextInt();
System.out.println(" even or odd");
System.out.println("Enter the number");
if(h==0 || h<0){
	if(h!=0 & h<0){
		System.out.print("it negative");
	}
else {
	System.out.println("it");
}
}
else if(h%2==0 || h%2!=0) {
	if(h%2==0) {
		System.out.print("its even");
	}
	else if(h%2!=0) {
		System.out.println("its odd");
	}
		
	else {
		System.out.println("its 0");
	}
	
}

	}

}
