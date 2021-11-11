package day45_Interfaces;

public interface Interface01 {
	
	public void motor( );// ýnterface içinde abstract methodlar ve ÖZEL concrete methodlar olabir.
	/*
	 * bir abstract method'un body'si olmadýðýndan o method'un istenenen dinamik özelliði nasýl gerçekleþtireceðini
	 *bilmemiz mümkün deðildir.
	 *sadece ne yapacaðýný biliriz. 
	 *
	 *
	 *Bu method bize sunu anlatýr:
	 *Beni inherit eden her concrete class'ýn dinamik motore olmalýdýr.
	 *
	 */

	void vites();//Beni inherit eden her concrete class'ýn dinamik vites özelliði olmalýdýr.
	
	abstract void kasa();//Beni inherit eden her concrete class'ýn dinamik kasa özelliði olmalýdýr.


//Interface'de sadece ABSTRACT.PUBLÝC methodlar olur.
//bu iki keyword'u yazsak da yazmasak da java tüm method'larý bu þekilde kabul eder.

	String ISIM="Mustafa";//Java isim kelimesini italik ve bold yaptý
						//demek ki tüm variabller final ve statik tir.

}
