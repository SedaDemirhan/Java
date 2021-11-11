package day34_encapsulation;

public class C03_ArabaMain {
	
	
	
	public static void main(String[] args) {
/*1- filedlarý model(String), renk(String), motor(int), yil (int)
    olan Araba  isimli bir class tanýmlayýnýz.
 2- bütün fieldlarý parametre alan bir constructor tanýmlayýnýz.
 3- bütün fieldlarý için getter ve setter metodlarý oluþturunuz.
 4- ArabaMain isminde main method için bir class oluþturunuz.
 5- Ýki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 6- araclarýn motor ve yýlýný hatalý veri girisine karsi kapsulleyiniz.
 */
	C04_Araba volvo=new C04_Araba("xc90", "beyaz", -2400, -2020);
	C04_Araba audi=new C04_Araba("Q7", "bej", -3000, -2021);
	C04_Araba honda=new C04_Araba();//default parametresiz cons.
		
	honda.model="civic";
	honda.renk="gri";
	honda.setYil(1999);
	honda.setMotor(1400);
	
	System.out.println("honda yil :"+honda.getYil());//1999
	System.out.println("honda motor :"+honda.getMotor());//1400
	System.out.println ("volvo motor :" +volvo.getMotor());//2400
	System.out.println("audi yil :"+audi.getYil());//2021
		
	}
	}


	


