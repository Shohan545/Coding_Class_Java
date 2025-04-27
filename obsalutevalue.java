package Day_3;
import java.util.Scanner;
public class obsalutevalue {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=st.nextInt();
		if(num<0) {
			int absalute=num*-1;
			System.out.println(absalute);
		}
		else {
			System.out.println("it is absalute value");
		}
	}
}
