package day35_Encapsulation02;

import java.util.Scanner;

public class C04_BookMain {

	public static void main(String[] args) {
		
		C03_Book kitap=new C03_Book();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("son okudugunuz kitab� giriniz :");
		String kitap2=scan.nextLine();
		
		kitap.setBookName("caliku�u");
		kitap.setAuthorName(kitap2);
		
		System.out.println("1.kitab�m :"+kitap.getBookName()+" ikinci kitab�m :"+kitap.getAuthorName());
		
	}

}
