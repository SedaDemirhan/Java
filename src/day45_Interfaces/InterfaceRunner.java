package day45_Interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
	//static olarak tan�mlanm�� bir variable veya method 
	//baska class'dan classIsmi.method ismi �eklinde �a��rabilir
		
		Interface02.deneme2();
		
	//default keyword� ile olu�turdu�umuz method ise obje �zerinden ca��r�labilir
		
		InterfaceRunner obj1=new InterfaceRunner();
		
		obj1.deneme();

	}

}
