import java.util.Scanner;
public class caladd
{
	public static void main(String args[])
	{
		float res,a,b;
		char choice,ch;
		Scanner scan=new Scanner(System.in); 
		
		do
		{
			System.out.println("1.Add");
			System.out.println("2.exit");
			System.out.println("enter your choice");
			choice=scan.next().charAt(0);
			switch(choice)
			{
				case '1': System.out.println("enter two nos");
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a+b;
				System.out.println("result is"+res);
				break;
 			
				case '2': System.exit(0);
					break;
				default: System.out.println("invalid choice");

			}
		}while(choice!=2);	
	}
}
