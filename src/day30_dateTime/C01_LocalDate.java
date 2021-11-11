package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		
LocalDate tarih=LocalDate.now();//tarih isminde obj creat ettik!!!new anahtar� kullan�lmaz
System.out.println("bug�n�n tarihi :" +tarih);
		
System.out.println("bug�nden 21 gun sonrasi :"+tarih.plusDays(21));// 2021-08-23

System.out.println("bug�nden 3 y�l sonrasi :"+tarih.plusYears(3));//2024-08-02
System.out.println("bug�nden 3 gun 5 ay 2 y�l sonrasi :"+tarih.plusDays(3).plusMonths(5).plusYears(2));//2024-01-05
System.out.println("bug�nden 40 gun �ncesi :"+tarih.minusDays(40));//2021-06-23

System.out.println("bug�n�n 5 y�l �ncesi 2 ay sonrasi 3 hafta ertesi :" +tarih.minusYears(5).plusMonths(2).plusWeeks(3) );//2016-10-23



System.out.println(tarih.getDayOfMonth());// 2
System.out.println(tarih.getDayOfWeek());// MONDAY
System.out.println(tarih.getMonthValue());// 8
System.out.println(tarih.getMonth());//AUGUST
System.out.println(tarih.getYear());//2021

LocalDate dogumGnDate=LocalDate.of(1987, 8, 17);
System.out.println("dogum tarihi :" +dogumGnDate);//1987-08-17
System.out.println("dogum g�n� :"+dogumGnDate.getDayOfWeek());//MONDAY

	}

}
