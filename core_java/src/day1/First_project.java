package day1;
import java.util.*;

public class First_project {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		String s1=scan.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.print(s2);
		if(s2.equals(s1)) {
			System.out.print(" " +"this is palindrom");
		}
		else {
			System.out.print(" "+"not a palindrom");
		}
	}

}
