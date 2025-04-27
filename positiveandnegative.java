package Day_3;
import java.util.Scanner;
public class positiveandnegative {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=st.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num==0) {
			System.out.println("0");
		}
		else {
			System.out.println("Negative");
		}
	
	}

}
