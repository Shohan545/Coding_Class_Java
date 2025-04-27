package Day_3;
import java.util.Scanner;
public class lagestNumberofTwoInteger {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		int num1=st.nextInt();
		int num2=st.nextInt();
		if(num1>num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
}
