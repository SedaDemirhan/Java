package day41_exception02;

public class Exception03 {

	public static void main(String[] args) {
	
		
	String str1=" ";//space
	String str2="";//hiclik
	String str3=null;//str3 variable'n�n hi�bir de�ere e�it olmad���n� belirten pointer
	
	System.out.println(str1.length());//1
	System.out.println(str2.length());//0
	//System.out.println(str3.length());//NullPointerException
	System.out.println(str3+" erol ta�");//null erol ta�
	//System.out.println(str3.concat("erol ta�")); -->null olarak atanm�� bir obj uygun olmayan bir i�lem yap�l�rsa 
	//java NullPointerException unchecked verir.
	}

}
