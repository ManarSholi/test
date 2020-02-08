package addPack;

import java.io.IOException;

public class AddClass {
	public static int add(int a, int b){
		return a+b;
	}
	public static void main(String[] args) throws IOException {
		int c;
		int b;
		b = System.in.read();
		int a;
		a = System.in.read();
		c = add(b,a);
		System.out.println(c);
	}

}
