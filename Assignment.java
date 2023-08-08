package Mayuri;
import java.util.*;

public class Assignment
{
    public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	int choice,result;
	System.out.println("Enter the first number:");
	num1 = sc.nextInt();
	System.out.println("Enter the second number:");
	num2 = sc.nextInt();
   do
     {	
	System.out.println("Enter the choice:");
	choice = sc.nextInt();
   switch(choice)
     {
	case 1:
	result = num1 + num2;
	System.out.println("Result is : "+result);
	break;

	case 2:
	result = num1 - num2;
	System.out.println("Result is : "+result);
	break;

	case 3:
	result = num1 * num2;
	System.out.println("Result is : "+result);
	break;

	case 4:
	result = num1 / num2;
	System.out.println("Result is : "+result);
	break;

	default:
	System.out.println("Invalid operator");
	break;
    }
     }while(choice<5);

   }
}