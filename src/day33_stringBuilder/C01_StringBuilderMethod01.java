package day33_stringBuilder;

public class C01_StringBuilderMethod01 {

	public static void main(String[] args) {

		
		//****equals metodu
	//SB de equals metodu classýndan farklý çalýþýr.String classýndaki ==operatörü
	//	ile ayný iþlemi yapar.Hem içerik hemde referans eþitliðine bakar.
	
	String s="hayat";
	StringBuilder sb=new StringBuilder("hayat");
	
	//System.out.println(s==sb);-->farklý data typlarý karþýlaþtýrma operatörü derleyemez CTE verir
	
	System.out.println(s.equals(sb));//false
	
	System.out.println(s.equals(sb.toString()));//true****burada sb string çevirdik iki string karþýlaþtýrýlmýþ oldu ve hem içerik hem referans ayný
	System.out.println(sb.equals(sb.toString()));//false***builder ile string karþýlaþrýldý!
	
	System.out.println(sb.toString().concat("guzel"));// hayatguzel
	
	System.out.println(sb.append(s,2,5));
	
	}

}
