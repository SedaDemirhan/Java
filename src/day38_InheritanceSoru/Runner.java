package day38_InheritanceSoru;

public class Runner {

	public static void main(String[] args) {
		
		Cat c1=new Cat();//p'siz cons ile obje Data type cat classýnda

		/*Ayni isimli variable'lar callobj. call edilirken once objenin kendi 
 class'indaki variable call edilir sonra parentindeki variable call edilir
*/		
		System.out.println(c1.a);// 5 animal
		System.out.println(c1.c);//9 kendi class c mammal dan deðil
		System.out.println(c1.d);//5 kendi class
		System.out.println(c1.m);//4 mammal
		
c1.mM();//anaimalmammal  Animal class---->call
c1.mC();//cat  cat class--->call
c1.mA();//mammal  Mammal class--->call
/* method calla edilirken ayný isimli methodlarýn hangisinin alýýnacaðýnaconst karar verir.
 * childen parente doðru hiyerarþi yapýlýr.Babadan dedeye önce kimde görürse
 * Data Type ve constructor farklý classlar ---->parent obj =new Child();
 * parent class'dan baþlanýr child classýndan deðil
 */
Mammal c2=new Cat("X");

System.out.println(c2.a);//5 animal class--->
System.out.println(c2.c);//mammal class--->
System.out.println(c2.m);//mammmal class--->







	}

}
