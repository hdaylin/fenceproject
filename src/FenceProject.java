
import java.util.Scanner;
public class FenceProject {

	public static void main(String[] args) {
		
		int wood =25; 
		int chainlink = 15; 
		int gate = 150;  
		int permit = 50; 
		double tax = 0.06;  
		int num_gates=0;
		double subtotal; 
		double total = 0; 
		int cost=0;
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("How many feet do you need?"); 
		int feet = keyboard.nextInt(); 
		
		System.out.println("What type of fence do you want?"); 
		String type = keyboard.next(); 
	
		
		System.out.println("How many gates do you want?"); 
		num_gates = keyboard.nextInt();  
		
		while(num_gates > 3 || num_gates <= 0){
			System.out.println("Enter a number between 1-3"); 
			System.out.println("How many gates do you want?"); 
			num_gates = keyboard.nextInt();
		}
			
		
		if (type.equals("wooden")){
			 cost = feet * wood;
		}
		else if(type.equals("chainlink")){ 
			 cost = feet * chainlink;
			
		}
		
		subtotal = cost + (gate * num_gates); 
		tax = subtotal * tax; 
		total = subtotal + tax + permit; 
		System.out.println(total);
	}

}
