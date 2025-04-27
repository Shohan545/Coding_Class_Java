package Day_3;
import java.util.Scanner;
public class LowercaseASCIIvalueornot {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		int ASCCInum=st.nextInt();
		if(ASCCInum>=91 && ASCCInum<=122 ) {
			System.out.println("It is LowerCase");
		}
		else {
			System.out.println("error");
		}
	}
}
