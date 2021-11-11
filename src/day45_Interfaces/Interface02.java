package day45_Interfaces;

public interface Interface02 {
	
	//soru �u: Buradaki default ve static bizim bildi�imiz default ve static mi?
	//cevap: HAYIR
	public default void deneme() {
		System.out.println("default keyword'lu method �al��t�");
		
	}
	//Bizim bildi�imiz default acess modifier'di
	//bir method da birden fazla acess modifier olur mu?
	//bizim interface'de olu�turdu�umuz t�m method'lar public'dir
	//�nterface de default keyword kullanarak concreate method olu�turabiliriz
	//buradaki default keyword'u access modifier de�il
	//java'n�n ozel bir ��z�m�d�r
	
	//buradaki default keyword bas�na yaz�ld��� method'un concrete oldu�unu belirtir
	
	static void deneme2() {
		System.out.println("static keywor'lu method �al��t�");
	}
//yukar�da default keyword� kullanarak olu�turdu�umuz method'lar
//override edilmek ZORUNDA DE��LD�R.
}
