package day44_abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {

		System.out.println(C1_Final.SAYI);
//stataic bir variable okul ismi gibi herkes i�in ayn�d�r
		
	//	C1_Final.SAYI+=20;
		
	//sayi variable'i final olarak tan�mland��� i�in DE���T�R�LEMEZ
		C2_Final2 obj1=new C2_Final2();
		obj1.deneme();
		
		
	}

	@Override
	public void deneme() {
		
		super.deneme();
		System.out.println("child class'daki ovveriding method");
		
	}
	/*
	public void deneme2() {
		//Cannot override the final method from C1_Final
	}
	*/
	
	//final class yapt���m�zda inherit edilemez

}
