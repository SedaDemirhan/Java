package day41_exception02;

public class MehmetHoca_Exception07 {

	public static void main(String[] args) {
		
		int sayi=10;
	//	String str=sayi;//CTE
		
		String str="123456";

		System.out.println(str+10);//12345610
		
		int strSayi=Integer.parseInt(str);
		System.out.println(strSayi+10);//123466
		
		String str2="123a45";
		System.out.println(Integer.parseInt(str2));//NumberFormatException
		
		
		
	}

}
