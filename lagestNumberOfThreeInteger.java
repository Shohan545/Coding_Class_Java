package Day_3;

import java.util.Scanner;

public class lagestNumberOfThreeInteger {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		int num1=st.nextInt();
		int num2=st.nextInt();
		int num3=st.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
		}
		
}
