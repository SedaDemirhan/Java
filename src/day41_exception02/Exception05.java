package day41_exception02;

public class Exception05 {

	public static void main(String[] args) {
	int sayi=34;
	
	String str="1453";
	
	//String str1=sayi;//cte---->checked exception ClassCast
	
	int okulNo=Integer.parseInt(str);
	
	System.out.println("okul no:"+okulNo);
	System.out.println(str+35);//143535
	System.out.println(str+35);//1488
	
	String str1="14a3";
	
	int strSayi=Integer.parseInt(str1);//NumberFormatException
	
	//UNchecked--->(r)Unchecked
	
	Object sayi3=45;//Object data type hz adem javanýn tum classlarýnýn parenti
	
	String strSayi2=(String)sayi3;//data Type Class Casting buyuk veri kucuk kont atandý

	}

}
