package day30_dateTime;

import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {
	LocalDate bugun=LocalDate.now();
	LocalDate date=LocalDate.of(2020, 11, 15);
	int fark =bugun.compareTo(date);
	System.out.println(bugun);
	System.out.println(date);
	System.out.println(fark); // kars�la�t�r�lan iki tarihin en b�y�k parcas�n�n fark�n� verir.
	
	}

}
