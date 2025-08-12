import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose your first number:");
		int num1=in.nextInt();
		System.out.println("Choose your operaion:");
		char operation=in.next().charAt(0);
		System.out.println("Choose your second number:");
		int num2=in.nextInt();
		int ans;
		switch(operation){
		    case '+':
		        ans=num1+num2;
		        System.out.println("Num1+Num2="+ans);
		        break;
		    case '-':
		        ans=num1-num2;
		        System.out.println("Num1-Num2="+ans);
		        break;
		    case '*':
		        ans=num1*num2;
		        System.out.println("Num1*Num2="+ans);
		        break;
		    case '/':
		        ans=num1/num2;
		        System.out.println("Num1/Num2="+ans);
		        break;
		}
	}
}
