package day44_abstractclasses;

public class C1_Final {
	
	final static int SAYI=10;
	
	//instance bir variable'i final ve static yaparsan�z java bunu bold yapar
	//biz de ismi BUYUK HARFLE YAZARIZ
	
	String isim;//null
	//instance variable'lara ilk de�er atamas� yapmak zorunda de�iliz
	//de�er atamad���m�zda java data t�r�ne g�re default bir de�er atar
	
	//final String soyisim;
	//final variable'lar� de�eri sonradan de�i�tirilemeyece�i i�in
	//ilk atama yap�lmadan olu�turulmas�na java izin vermez

	public static void main(String[] args) {
		
System.out.println(Integer.MAX_VALUE);
	}
	
	public void deneme() {
		System.out.println("deneme yap�yoruz");
		
		
	}
	public final void deneme2() {
		System.out.println("deneme yap�yoruz 2");
		
		
	}

}
