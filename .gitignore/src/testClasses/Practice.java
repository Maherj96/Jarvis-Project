package testClasses;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		int x=1;

		
		
		int correct = 0;
		int incorrect = 0;
	
		while(x <=5){
			
			int num1 = (int)(Math.random()*50+26);
			int num2=(int)(Math.random()*25+1);
			
			System.out.println(num1 +" - "+ num2+":");
			
			Scanner input = new Scanner(System.in);
			int answer = input.nextInt();
			
			if(answer == num1-num2){
				System.out.println("Correct!");
				correct++;
			}
			
			else{
				System.out.println("Wrong!");
				incorrect++;
			}
			
			x++;	
		}
		System.out.println("You got " + correct + " correct and " + incorrect + " incorrect." ) ;
		System.out.println("Your grade is: " + correct / 5);
		


	}
}
	
	


