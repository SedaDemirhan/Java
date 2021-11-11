package day36_Inheritance;

public class C02_muhasebe extends C01_personal  {
	
	public int saatUcreti;
	public String statü;
	public int maas;
	

	public int maasHesapla() {
		
		int maas =saatUcreti*8*30;
		return maas;
		

	}

}
