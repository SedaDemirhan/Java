package day41_exception02;

public class Exception03 {

	public static void main(String[] args) {
	
		
	String str1=" ";//space
	String str2="";//hiclik
	String str3=null;//str3 variable'nýn hiçbir deðere eþit olmadýðýný belirten pointer
	
	System.out.println(str1.length());//1
	System.out.println(str2.length());//0
	//System.out.println(str3.length());//NullPointerException
	System.out.println(str3+" erol taþ");//null erol taþ
	//System.out.println(str3.concat("erol taþ")); -->null olarak atanmýþ bir obj uygun olmayan bir iþlem yapýlýrsa 
	//java NullPointerException unchecked verir.
	}

}
