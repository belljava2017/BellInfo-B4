import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse:");       
		int number = scan.nextInt();
        
        int i=0, result=0;
        while(number!=0){
        	result = result*10;
        	result = number%10+result;
        	number = number/10;
        }
        System.out.println("Reversed Number: "+ result);
	}

}
