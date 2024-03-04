package BasicProgram;

public class Palandrome {

	public static void main(String[] args) {
		int num1=123271;
		int temp=num1;
		int num2=0;
		while(temp>0)
		{
			num2=num2*10;
			num2=num2+temp%10;
			temp=temp/10;
		
		}
		System.out.println("given number is "+num1);
		if(num1==num2)
			System.out.println("Given number is  palandrome");
		else
			System.out.println("given number is not palndrome");
	}

}
