package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		  int sum;
		  System.out.println(f);
		  int s=1;
		  System.out.println(s);
		  for (int i =2; i<=7; i++) {
			  sum=f+s;
			  System.out.println(sum);
			  f=s;
			  s=sum;
	}

}
}