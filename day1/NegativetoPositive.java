package week1.day1;

public class NegativetoPositive {
	
	public static void main(String[] args) {
		int num=-40;
		int positive;
		 if(num<0) {
		System.out.println("Number is positive: "+num);
	}
		 else if (num==0){
			 System.out.println("Number is Zero:"+num);
			 
		 }
		 else {
			 System.out.println("Number is negative:"+num);
			 positive=num*(-1);
			 System.out.println("Number converted to positive:"+positive);
		 }
}
}