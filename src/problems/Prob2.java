package problems;

import gui.Win;

public class Prob2 implements Runnable {
		@Override
		public void run() {
			long ans = 0;
			int one = 0;
			int two = 1;
			while(two<4000000){
				int t=two;
				two += one;
				one = t;
				ans += two*(-two%2+1);
			}
			Win.getInstance().result.setText(String.valueOf(ans));
			Win.getInstance().validate();
		}
}
