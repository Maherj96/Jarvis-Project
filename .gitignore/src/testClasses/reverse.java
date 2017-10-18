package testClasses;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("I am currently dying!"
				+ "");
		int num= input.nextInt();
		
		int x = num %10;
		int y = num/10;
		int z = y%10;
		
		System.out.print(x + y + z);
		}

	}


