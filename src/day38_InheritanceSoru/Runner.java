package day38_InheritanceSoru;

public class Runner {

	public static void main(String[] args) {
		
		Cat c1=new Cat();//p'siz cons ile obje Data type cat class�nda

		/*Ayni isimli variable'lar callobj. call edilirken once objenin kendi 
 class'indaki variable call edilir sonra parentindeki variable call edilir
*/		
		System.out.println(c1.a);// 5 animal
		System.out.println(c1.c);//9 kendi class c mammal dan de�il
		System.out.println(c1.d);//5 kendi class
		System.out.println(c1.m);//4 mammal
		
c1.mM();//anaimalmammal  Animal class---->call
c1.mC();//cat  cat class--->call
c1.mA();//mammal  Mammal class--->call
/* method calla edilirken ayn� isimli methodlar�n hangisinin al��naca��naconst karar verir.
 * childen parente do�ru hiyerar�i yap�l�r.Babadan dedeye �nce kimde g�r�rse
 * Data Type ve constructor farkl� classlar ---->parent obj =new Child();
 * parent class'dan ba�lan�r child class�ndan de�il
 */
Mammal c2=new Cat("X");

System.out.println(c2.a);//5 animal class--->
System.out.println(c2.c);//mammal class--->
System.out.println(c2.m);//mammmal class--->







	}

}
