package day05_Wrapper_Concatenaion;

public class C2_Concatenation {

	public static void main(String[] args) {
	String str1="Hello";
	String str2="World";
	int sayi1=3;
	int sayi2=4;
	
	// ***kesinlikle say� ve harf yazmadan sadece variable isimlerini kullanarak
	// Hello1 yazdirin
	
	System.out.println(str1+(sayi2-sayi1));
	// Hello 5 World
	
	System.out.println(str1+" " +"5"+ " " +str2);
	
	System.out.println(str1+ " " +sayi1+sayi2);
	
	System.out.println((sayi1+sayi2)+str2);

	System.out.println(sayi1+""+sayi2);
	}

}
