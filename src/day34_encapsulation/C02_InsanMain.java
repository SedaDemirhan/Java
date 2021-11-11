package day34_encapsulation;

public class C02_InsanMain {

	public static void main(String[] args) {
	
		C01_AdemOglu insan1=new C01_AdemOglu();
		
		//insan1.age=47;
		insan1.name="seda";
		insan1.surName="demirhan";
		
		insan1.yasAta(-47);
		System.out.println(insan1.name);//seda
		System.out.println(insan1.surName);//demirhan
		System.out.println(insan1.yasGoster());//47
	}

}
