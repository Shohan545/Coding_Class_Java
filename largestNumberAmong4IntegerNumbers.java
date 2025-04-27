package Day_3;
import java.util.Scanner;
public class largestNumberAmong4IntegerNumbers {
	public static void main(String[]args) {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the 4 Integer: ");
		System.out.println();int a=st.nextInt();int b=st.nextInt();int c=st.nextInt();int d=st.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println(a);
		}
		else if(b>a && b>c && b>d) {
			System.out.println(b);
		}
		else if(c>a && c>b && c>d) {
			System.out.println(c);
		}
		else
			System.out.println(d);
	}
}
