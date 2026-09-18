package com.sreenu.test;

public class Revision2 {
	
	public static void main(String[] args) {
		
		/*String s = "Hello";
		
		s = s + " World";
		
		String s1 = s.concat(" World");
		
		System.out.println(s);
		System.out.println(s1); */
		
		/* StringBuilder sc = new StringBuilder("Hello");
		sc.append(" World");
		sc.append("A");
		sc.append("B");
		System.out.println(sc); */
		
		/* String s = "Hello";
		
		String sc = new StringBuilder(s).reverse().toString(); */
		
		
		
		String str = "Kodewala,Academy,BTM,Bengaluru";
		String[] splittedarray = str.split(",");
		for(String s : splittedarray) {
			System.out.println(s);
		}
		
		
		
		System.out.println(str.contains("Academy"));
		System.out.println(str.startsWith("Kod")); // true
		System.out.println(str.endsWith("uru"));
		
		// conversions
		
		String s1 = "Kodewala";
		char[] ch = s1.toCharArray();
		for(char c:ch) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		StringBuffer sb = new StringBuffer("Kodewala");
		sb.append(", BTM");
		sb.append(", Bengaluru");
		
		System.out.println(sb);
	}

}
