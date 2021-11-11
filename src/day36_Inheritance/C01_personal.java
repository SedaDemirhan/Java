package day36_Inheritance;

public class C01_personal {
	
	public static int sayac=1000;
	public int id;
	public String isim;
	public String soyisim;
	public String adres;
	public String tel;
	
	public int idAta() {
		this.id=sayac++;
		return id;
	}

	public static void main(String[] args) {
		
	}

}
