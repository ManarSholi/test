package addPack;

import java.io.IOException;
import java.util.Scanner;
public class AddClass {
	public static int add(int a, int b){
		int d;
		d = a+b;
		return d;
	}
	public static void main(String[] args) throws IOException {
		int c;
		int b;
		Scanner in = new Scanner(System.in);
		b = in.nextInt();
		int a;
		a = in.nextInt();
		c = add(b,a);
		System.out.print(c);
		
	}

}
