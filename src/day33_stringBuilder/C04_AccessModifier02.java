package day33_stringBuilder;

public class C04_AccessModifier02 {

	public static void main(String[] args) {
	
		C03_AccessModifier01 obj1=new C03_AccessModifier01();
	
System.out.println(obj1.defaultAge);//17
System.out.println(obj1.protectedAge);//32
System.out.println(obj1.publicAge);//61



C05_AccessModifier03 name=new C05_AccessModifier03();
System.out.println(name.defaultName);//seda
System.out.println(name.protectedName);//elif
System.out.println(name.publicName);//zara

///*****private getiremiyoruz kendi class dan ulaþýlabilir çünkü*****
	}

}
