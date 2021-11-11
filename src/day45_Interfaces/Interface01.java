package day45_Interfaces;

public interface Interface01 {
	
	public void motor( );// �nterface i�inde abstract methodlar ve �ZEL concrete methodlar olabir.
	/*
	 * bir abstract method'un body'si olmad���ndan o method'un istenenen dinamik �zelli�i nas�l ger�ekle�tirece�ini
	 *bilmemiz m�mk�n de�ildir.
	 *sadece ne yapaca��n� biliriz. 
	 *
	 *
	 *Bu method bize sunu anlat�r:
	 *Beni inherit eden her concrete class'�n dinamik motore olmal�d�r.
	 *
	 */

	void vites();//Beni inherit eden her concrete class'�n dinamik vites �zelli�i olmal�d�r.
	
	abstract void kasa();//Beni inherit eden her concrete class'�n dinamik kasa �zelli�i olmal�d�r.


//Interface'de sadece ABSTRACT.PUBL�C methodlar olur.
//bu iki keyword'u yazsak da yazmasak da java t�m method'lar� bu �ekilde kabul eder.

	String ISIM="Mustafa";//Java isim kelimesini italik ve bold yapt�
						//demek ki t�m variabller final ve statik tir.

}
