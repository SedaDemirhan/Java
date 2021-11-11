package day35_Encapsulation02;

import java.util.Scanner;

public class C04_BookMain {

	public static void main(String[] args) {
		
		C03_Book kitap=new C03_Book();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("son okudugunuz kitabý giriniz :");
		String kitap2=scan.nextLine();
		
		kitap.setBookName("calikuþu");
		kitap.setAuthorName(kitap2);
		
		System.out.println("1.kitabým :"+kitap.getBookName()+" ikinci kitabým :"+kitap.getAuthorName());
		
	}

}
