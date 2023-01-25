import java.util.Scanner;
class exp10{
	public static void main(String[] args){
		int a,b,res;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two Integers : " );
		a=in.nextInt();
		b=in.nextInt();
		try{
			res=a/b;
			System.out.println("Result = "+res);
		}
		catch(ArithmeticException e){	
			System.out.println("Exception caught : Division By Zero");
		}
	}
}