package Calculator;
import java.util.Scanner;
public class TempConvtApp {

	public static void main(String[] args) {
		float f,c;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Fahrenheit to Celsius:");
		System.out.println("Enter 2 for Celsius to Fahrenheit:");
		i=sc.nextInt();
		switch(i)
		{
		case 1:	System.out.println("Enter Fahrenheit:");
				f=sc.nextFloat();
				c=((f-32)*5)/9;
				System.out.println("Corresponded Celsius: "+c);
		break;
		case 2:	System.out.println("Enter Celsius:");
				c=sc.nextFloat();
				f=(c*9)/5+32;
				System.out.println("Corresponded Fahrenheit: "+f);
		break;
		default:System.out.println("Invalid input");
		}
		sc.close();
	}

}
