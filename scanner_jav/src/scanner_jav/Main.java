package scanner_jav;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int a;
		String b;
		double c;
		char d;
		
		a = sc.nextInt();
		b = sc.next();
		c = sc.nextDouble();
		d = sc.next().charAt(0);
		
		System.out.println(" ");
		
		System.out.println("Dados Digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
	}

}
