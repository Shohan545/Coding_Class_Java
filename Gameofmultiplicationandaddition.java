package Day_3;
import java.util.Scanner;
public class Gameofmultiplicationandaddition {
public static void main(String[]args) {
	Scanner st=new Scanner(System.in);
	int a=st.nextInt();
	int b=st.nextInt();
	if(a%2==0 && b%2==0) {
		int c=a*b;
		System.out.println(c);
	}
	else {
		int c=a+b;
		System.out.println(c);
	}
}
}
