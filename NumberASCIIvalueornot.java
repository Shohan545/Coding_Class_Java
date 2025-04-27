package Day_3;
import java.util.Scanner;
public class NumberASCIIvalueornot {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the ASCCI Num: ");
		int ASCCInum=st.nextInt();
		if(ASCCInum >=65 && ASCCInum <=122) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
