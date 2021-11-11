package day38_InheritanceSoru;
/*
1) Animal isiminde class creat edip 2 farklý methoda prnt komutu yazýnýz.
 Animal class'ýnda int type biri initialize(assaingmet) edilmiþ
 digeri initialize(assaingmet) edilmemiþ  iki farkli instance veriable creat ediniz.
 Animal class'ýnda int parametre'li ve parametresiz'siz iki cons creat ediniz.
 
 2)Mammal isiminde class creat edip 2 farklý methoda prnt komutu yazýnýz.
 methodlardan biri parentindeki metod ile ayný isimde olsun
   Mammal class'ýnda int type  initialize(assaingmet) edilmiþ biri parentindeki veriable ayný isimde
 digeri farklý isimde  iki farkli instance veriable creat ediniz.
 Mammal class'ýnda char p'li ve p'siz cons creat ediniz.
 p'li cons parentindeki p'li cons call etsin. p'siz cons kendi class'ýndaki p'li cons call etsin

 3)Cat isiminde class creat edip parentindeki ile ayný isimde  methoda prnt komutu yazýnýz.
 Cat class'ýnda int type  initialize(assaingmet) edilmiþ biri parentindeki veriable ayný isimde
 digeri farklý isimde  iki farkli instance veriable creat ediniz.
 Cat class'ýnda p'li ve p'siz cons creat ediniz.
String p'li cons classýndaki p'siz cons call etsin ve parentindeki ayný isimdeki veriable print etsin

4)Runner class'ý creat ederek  class ve cons ayný veya farklý obj ler creat ederk veriable ve metod call ile yazdýrnýz.
parent --> child
animal --> Mammal --> Cat
 */

public class Animal{
	
	public void mA() {
		System.out.println("animal");
	}
	public void mM() {
		System.out.println("anaimal"+"mammal");
	}
public int a=5;
public int m;
public Animal() {
	System.out.println("p'siz animal cons");
	
}
	public Animal( int i) {
		System.out.println("p'li cons");
	}

	}


