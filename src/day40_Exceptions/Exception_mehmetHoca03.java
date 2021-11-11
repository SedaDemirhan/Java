package day40_Exceptions;

public class Exception_mehmetHoca03 {

	public static void main(String[] args) {
//try catch blogundaki e nin görevi;
		
		int sayi1=10;
		int sayi2=0;
		
		Exception_mehmetHoca exp=new Exception_mehmetHoca();
		//esitliðin solundaki Exception_mehmetHoca hem class adý hem de exp objesi icin data turu
		
	try {
		System.out.println(sayi1/sayi2);

	} catch (ArithmeticException e) {
	
		System.out.println(e);
		
		System.out.println(e.getMessage());// by zero
		
		e.printStackTrace();
		//java.lang.ArithmeticException: / by zero
		//at day40_Exceptions.Exception_mehmetHoca03.main(Exception_mehmetHoca03.java:15)

	
	}	
		
	}

}
