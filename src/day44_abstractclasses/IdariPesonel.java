package day44_abstractclasses;

public class IdariPesonel extends Personel {
	//extends personel yazarak Abstract personele concrete bir child olu�turdum
	//ve java CTE verdi
	//��z�m olarak �retti�i 2 ihtimal var
	//1-Un implemented(uyarlanmam��) methodlar� uyarla
	//2-ya da Personel class's�ndan abstract kelimesini kald�r
	//Bu class'�n cal��abilmesi i�in 2 i�lemden birini yapmak zorunday�z

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//concreate bir class'da abstract bir method olabilir mi?
	
	//public abstract void surekliCalisma();
	//Bastract bir method sadece abstract bir class'da olu�turulabilir
	//The abstract method surekliCalisma in type IdariPesonel can only be defined by an abstract class

	@Override
	public void maasHesapla() {
	System.out.println("idari personel maa�� 4000 tl");
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
