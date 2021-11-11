package day31_varargs;

public class C06_StringBuilder02 {

	public static void main(String[] args) {

		StringBuilder sb1=new StringBuilder();// boþ bir sb1 creat ettik
		//sb ye eleman ekleme
		sb1.append("faruk");
		System.out.println("sb1 ilk hali:"+sb1);
		sb1.append(" efehan");
		System.out.println("sb1 efehan eklenmiþ hali :"+sb1);
		System.out.println("sb1 uzunluk :"+sb1.length());
		System.out.println("sb1 kapasitesi :"+sb1.capacity());
		System.out.println("sb1 son hali :"+sb1.append(" "+"güzel insan"));
		System.out.println("sb1 son hali kapasite :"+sb1.capacity());
		
	
	
	
	
	
	}

}
