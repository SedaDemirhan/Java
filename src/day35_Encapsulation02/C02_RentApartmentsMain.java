package day35_Encapsulation02;

import java.util.Scanner;

public class C02_RentApartmentsMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("adinizi giriniz :");
		String name=scan.nextLine();
		
		System.out.print("dairenizde talep ettiginiz oda sayisini giriniz :");
		int odaSayisi=scan.nextInt();
		
		System.out.print("balkon tercihinizi giriniz(true/false :");
		boolean balcony=scan.nextBoolean();
	
		C01_RentApartments kiraci=new C01_RentApartments();
		
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
	
		int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
		System.out.println(kiraci.getName()+" bey kira ücretiniz :"+toplamKira);
		
	}

}
