package Day_3;

import java.util.Scanner;

public class findUpperCaseASCCIvalueornot {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		int ASCCInum=st.nextInt();
		if(ASCCInum>=65 && ASCCInum<=90 ) {
			System.out.println("It is UpperCsse");
		}
		else {
			System.out.println("error");
		}
	}
}
