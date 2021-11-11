package day44_abstractclasses;

public class C1_Final {
	
	final static int SAYI=10;
	
	//instance bir variable'i final ve static yaparsanýz java bunu bold yapar
	//biz de ismi BUYUK HARFLE YAZARIZ
	
	String isim;//null
	//instance variable'lara ilk deðer atamasý yapmak zorunda deðiliz
	//deðer atamadýðýmýzda java data türüne göre default bir deðer atar
	
	//final String soyisim;
	//final variable'larý deðeri sonradan deðiþtirilemeyeceði için
	//ilk atama yapýlmadan oluþturulmasýna java izin vermez

	public static void main(String[] args) {
		
System.out.println(Integer.MAX_VALUE);
	}
	
	public void deneme() {
		System.out.println("deneme yapýyoruz");
		
		
	}
	public final void deneme2() {
		System.out.println("deneme yapýyoruz 2");
		
		
	}

}
