import java.util.Scanner;
import java.text.DecimalFormat;

public class QBrating {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Touchdowns:");
		int TD = s.nextInt();
		
		System.out.println("Total yards:");
		int YDS = s.nextInt();
		
		System.out.println("Interceptions:");
		int INT = s.nextInt();
		
		System.out.println("Completions:");
		int COMP = s.nextInt();
		
		System.out.println("Number of passes attempted :");
		int ATT = s.nextInt();
		
		double a = (COMP/ATT-0.3)*5;
		double b = (YDS/ATT-3)*0.25;
		double c = (TD/ATT)*20;
		double d = 2.375-(INT/ATT)*25;
		double PRating = (a+b+c+d)*100/6;
		
		System.out.println("The QB rating is "+PRating);
	}
}
