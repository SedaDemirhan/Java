package day33_stringBuilder;

public class C01_StringBuilderMethod01 {

	public static void main(String[] args) {

		
		//****equals metodu
	//SB de equals metodu class�ndan farkl� �al���r.String class�ndaki ==operat�r�
	//	ile ayn� i�lemi yapar.Hem i�erik hemde referans e�itli�ine bakar.
	
	String s="hayat";
	StringBuilder sb=new StringBuilder("hayat");
	
	//System.out.println(s==sb);-->farkl� data typlar� kar��la�t�rma operat�r� derleyemez CTE verir
	
	System.out.println(s.equals(sb));//false
	
	System.out.println(s.equals(sb.toString()));//true****burada sb string �evirdik iki string kar��la�t�r�lm�� oldu ve hem i�erik hem referans ayn�
	System.out.println(sb.equals(sb.toString()));//false***builder ile string kar��la�r�ld�!
	
	System.out.println(sb.toString().concat("guzel"));// hayatguzel
	
	System.out.println(sb.append(s,2,5));
	
	}

}
