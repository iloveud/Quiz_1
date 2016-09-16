import java.util.Scanner;
public class MLGB_QBRATE {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the touchdowns:  ");
		double TD = input.nextDouble();
		System.out.print("Enter the  total yards:  ");
		double Yards = input.nextDouble();
		System.out.print("Enter the Interceptions:  ");
		double INT = input.nextDouble();
		System.out.print("Enter the completions:  ");
		double COMP = input.nextDouble();
		System.out.print("Enter the number of passes attempted:  ");
		double ATT = input.nextDouble();
		
		double a = ( COMP / ATT - 0.3 ) * 5;
		double b = ( Yards / ATT - 3 ) * 0.25;
		double c = ( TD / ATT ) * 20;
		double d = 2.375 - (INT / ATT * 25 );
		
		
		if ( a > 2.375) {
			a = 2.375;
		}
		
		else if (a < 0) {
			a = 0;
		}
		
		if ( b > 2.375) {
			b = 2.375;
		}
		
		else if ( b < 0) {
			b = 0;
		}
		
		if ( c > 2.375) {
			c = 2.375;
		}
		
		else if ( c < 0) {
			c = 0;
		}
		
		if ( d > 2.375) {
			d = 2.375;
		}
		
		else if ( d < 0) {
			d = 0;
		}
		double Passer_Rating = (( a + b + c + d) / 6 ) * 100;	
		
		System.out.println("The QB rating is" + Passer_Rating);
	}

}