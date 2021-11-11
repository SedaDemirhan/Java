package day47_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01{

	public static void main(String[] args) {
	
		LinkedList<String>ll1=new LinkedList<>(Arrays.asList("erdem","mehmet","samet","said","yagmur"));
		
		System.out.println(ll1);//[erdem, mehmet, samet, said, yagmur]
		
		ll1.add("merve");
		System.out.println(ll1);//[erdem, mehmet, samet, said, yagmur, merve]
		
		ll1.add(2, "faruk eczanesi");
		System.out.println(ll1);//[erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve]
	
		
		LinkedList<String>ll2=new LinkedList<>(Arrays.asList(":-)",";-("));
		ll1.addAll(ll2);
		System.out.println(ll1);//[erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(]
	
		ll1.addFirst("gayet");
		System.out.println(ll1);//[gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(]

		ll1.addLast("baþarýlý");
		System.out.println(ll1);//[gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, baþarýlý]

		ll1.addAll(3, ll2);
		System.out.println(ll1);//[gayet, erdem, mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, baþarýlý]

		ll1.remove();
		System.out.println(ll1);//[erdem, mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, baþarýlý]
	
		ll1.removeFirst();
		System.out.println(ll1);//[mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, baþarýlý]
		
		
		ll1.remove("faruk eczanesi");
		System.out.println(ll1);//[mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, baþarýlý]
		
		ll1.remove(2);
		System.out.println(ll1);//[mehmet, :-), samet, said, yagmur, merve, :-), ;-(, baþarýlý]
		
		ll1.removeFirstOccurrence(":-)");//ilk görülen node siler
		System.out.println(ll1);//[mehmet, samet, said, yagmur, merve, :-), ;-(, baþarýlý]
	
	
	}

}
