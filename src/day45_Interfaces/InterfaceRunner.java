package day45_Interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
	//static olarak tanýmlanmýþ bir variable veya method 
	//baska class'dan classIsmi.method ismi þeklinde çaðýrabilir
		
		Interface02.deneme2();
		
	//default keywordü ile oluþturduðumuz method ise obje üzerinden caðýrýlabilir
		
		InterfaceRunner obj1=new InterfaceRunner();
		
		obj1.deneme();

	}

}
