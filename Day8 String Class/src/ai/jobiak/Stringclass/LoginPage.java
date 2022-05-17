package ai.jobiak.Stringclass;
import java.util.Scanner;


public class LoginPage {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String Space = " ";
		String Star = "*";
		int j=0;
		System.out.println("create an account:\n");
	
		System.out.println("Enter user Id :\n");
		String userId = scan.nextLine();
		//for(int i=1;i<=3;i++) {
		if(userId.contains(Space) || userId.length() <8 || userId.contains(Star) ) {
			System.out.println("try again, refresh the page: ");
		
			return;	
		//}
		}
		System.out.println("create your password : \n");
		String pass = scan.nextLine();
		if(pass.length()<8) {
			System.out.println("try again, refresh the page: ");
			
		}
		else {
			System.out.println("\ngreat! your registration was successful.\n");
		}
		
		
		System.out.println("_____________________________________login now_________________________________________\n");
		
		for(int attempt=1; attempt<3; attempt++) {
		System.out.println("Enter your useId: \n");
		
		String  userIdcheck = scan.nextLine();
		if(!(userId.equals(userIdcheck))) {
			System.out.println("incorrect ...\nTry again...\n");
		}
		else {
			
			break;
		}
		}
		
		
		for(int limit=3; limit>0; limit--) {
			System.out.println("\nenter your password:\n");
			String pass1 = scan.nextLine();
			if(!(pass.equals(pass1))) {
				
				System.out.println("incorrect password....\nTry again...\n");
				System.out.println("you have "+limit+ " attempts left");
				j++;
				
			}
			
			else {
				System.out.println("\nyour logged in successfully.");
				break;
			}
			
			
		}
	
		//if(pass.length()>=8 && pass.contains(pass))) {
			
		//}
		if(j==3) {
			System.out.println("YOU'RE BEING BLOCKER FOR 24 HOURS:\n");
			
			}
		
		}
		
		
		

	}


