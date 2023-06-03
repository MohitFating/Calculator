package Java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a First No : \n");
		double FirstNum = sc.nextDouble();
		
		System.out.println("Enter a Second No : \n");
		double SecondNum = sc.nextDouble();
				
		System.out.println("Select an Operation (+,-,*,/) :\n");
		char Operation = sc.next().charAt(0);
		
		double result=0;
		
		switch(Operation)
		{
			case '+' :
				result = FirstNum + SecondNum; 
				break;
			case '-' :
				result = FirstNum - SecondNum; 
				break;
			case '/' :
				result = FirstNum / SecondNum; 
				break;
			case '*' :
				result = FirstNum * SecondNum; 
				break;	
			default:
				System.out.println("Invalid Operation try Assing Operations only.");
		}
		
		System.out.println("The Given Result Is : "+FirstNum+" "+Operation+" "+SecondNum+" = "+result);
		
	}

}
