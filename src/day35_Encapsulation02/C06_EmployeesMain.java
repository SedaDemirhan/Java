package day35_Encapsulation02;

import java.util.Scanner;

public class C06_EmployeesMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ad�n�z� giriniz :");
		String name=scan.nextLine();
		
		System.out.println("l�tfen do�um tarihinizi giriniz :");
		String dob=scan.nextLine();
		
		System.out.println("maa��n�z� giriniz :");
		int salary=scan.nextInt();
		
		C05_Employees calisan=new C05_Employees();
		
		calisan.setDob(dob);
		calisan.setName(name);
		calisan.setSalary(salary);
		
		int calisanYas=calisan.yasHesapla(dob);
		
		if (calisanYas>18) {
			System.out.println("Welcome to our company "+name+" your salary is ."+salary);
			
		}else if (calisanYas<18) {
			System.out.println(" come back when you are 18 years old");
			
		}else if (calisanYas==18) {
			System.out.println(" we can have inter with you after that you can have a"+salary+ "salary");
			
			
		}
		
		

	}

}
