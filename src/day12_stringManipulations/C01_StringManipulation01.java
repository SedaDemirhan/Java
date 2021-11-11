package day12_stringManipulations;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
	String str="java candir";
	
	System.out.println(str.substring(5));//candir
	System.out.println(str.substring(10));//r
	System.out.println(str.substring(11));// hiçlik
	System.out.println(str.substring(20));//hata
	
	System.out.println(str.substring(5,8));//can
	}

}
