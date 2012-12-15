package problems;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;

import javax.swing.text.DateFormatter;

import gui.Win;

/**
 * Prime factors
 * @author Nathan
 *
 */
public class Prob3 implements Runnable {
	private static final long c = 600851475143l;
	private static long i;
	@Override
	public void run() {
		long ans = c;
		System.out.println(DateFormat.getTimeInstance().format(Calendar.getInstance().getTime()));
		while(!(c%ans==0&&prime(ans)))ans-=2;
		System.out.println(DateFormat.getTimeInstance().format(Calendar.getInstance().getTime()));
		Win.getInstance().result.setText(String.valueOf(ans));
		Win.getInstance().validate();
	}
	
	/**
	 * When passed an odd number, determines if it is a prime.
	 * @param n MUST BE an odd number
	 * @return true if n is prime.
	 * @author Oscar_Sanchez (adapted)
	 */
	public static boolean prime(long n){
	    for(i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
