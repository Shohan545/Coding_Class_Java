package Day_3;
import java.util.Scanner;
public class hellowWorld {
	public static void main(String[]args) {
			Scanner st=new Scanner(System.in);
			int Grade=st.nextInt();
			if(Grade>=90 && Grade<100) {
				System.out.println("A+");
			}
			else if(Grade>100 && Grade<0) {
				System.out.println("Invalid");
			}
			else if(Grade>=80 && Grade<90){
				System.out.println("A");
			}
			else if(Grade>=70 && Grade<80) {
				System.out.println("B+");
			}
			else if(Grade>=60 && Grade<70) {
				System.out.println("B");
			}
			else if(Grade>=50 && Grade<60) {
				System.out.println("C+");
			}
			else if(Grade>=40 && Grade<50) {
				System.out.println("C");
			}
			else {
				System.out.println("Fail");
			}
		}
	}
