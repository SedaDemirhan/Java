package day11_stringManupulations;

public class C04_StringManipulationso4 {

	public static void main(String[] args) {
		
		String kkNo="Java 123 @%";
		
		System.out.println(kkNo.replace(" ", ""));
		
		System.out.println(kkNo);
		
		//replaceAll
		
		System.out.println(kkNo.replaceAll("\\s", ""));//sadece boþluklara atama yapar
		System.out.println(kkNo.replaceAll("\\S", "*"));//boþluk olmayan herþeyi * yapar
		System.out.println(kkNo.replaceAll("\\s", "*"));
		System.out.println(kkNo.replaceAll("\\w", "-"));// harf veya rakamlarýn hepsini deðiþtirir
		System.out.println(kkNo.replaceAll("\\W", "-"));//harf ve rakam dýþýndaki herþey
		System.out.println(kkNo.replaceAll("\\d", "0"));// rakam(digit) hepsi
		System.out.println(kkNo.replaceAll("\\D", "a"));// digir (rakamlarýn) dýþýndaki herþey
		
		// syso icinde yapilan manipulation'lar asil String'i degistirmez
        System.out.println(kkNo);
        
        kkNo = "1234 5698 1278 5687"; // atama yapinca kalici olarak degistirmis oluruz
        System.out.println(kkNo);
       
	}

}
