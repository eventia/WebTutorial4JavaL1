package com.ludens.inout;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainClass {
	public static void main(String[] args) throws IOException {

		InputStream in = System.in;
		
		// Step 1. read one char and show one 		
		int a;
		a = in.read();
		System.out.println(a-'0');

//		// Step 2. read 3 chars and show all
//		InputStreamReader reader = new InputStreamReader(in);
//		char a[] = new char[3];
//		reader.read(a);
//		System.out.println(a);
//		
//		// Step 3. Scanner
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.next());
//		
//		// Setp 4. File Out
//		FileOutputStream output = new FileOutputStream("c:/dev/out.txt");
//		String data = "Hello World";
//		output.write(data.getBytes());
//		output.close();
//		
//		// Setp 5. File In
		FileInputStream input = new FileInputStream("c:/dev/out.txt");
		byte b[] = new byte[1024];
		input.read(b);
		System.out.println(new String(b));
		input.close();

		
	}
}
