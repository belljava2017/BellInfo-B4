import java.util.Scanner;

public class MinNumber{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		System.out.println("inputs recieved: "+ a+ " "+b +" "+ c+" "+ d);
		
		if(a<b && a<c && a<d){
			System.out.println("Minimum Number: "+a);
		} else if(b<c && b<d && b<a){
		   System.out.println("Minimum Number: "+b);
		} else if(c<d && c<b && c<a){
				System.out.println("Minimum Number: "+c);
		} else {
			 	System.out.println("Minimum Number: "+d);
		}
		
	}
	
}