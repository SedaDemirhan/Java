package day12_stringManipulations;

public class Ödev_03 {

	public static void main(String[] args) {
		/*String methodlarini kullanarak "Java ogrenmek123 Cok guzel@" String’ini “Java
ogrenmek cok guzel" sekline getirin
*/
		
		String str="Java ogrenmek123 Cok guzel@";
		
		System.out.println(str.replaceAll("123", "").replace("@", ""));
	}

}
