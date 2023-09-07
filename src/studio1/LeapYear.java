package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("What year would you like to check?");
int val1 = in.nextInt();
boolean Div4 = val1%4 == 0;
boolean Div100 = val1%100 != 0 || val1%400 == 0;
System.out.println(Div4 && Div100);
	}

}
