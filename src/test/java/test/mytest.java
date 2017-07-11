package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class mytest {
	public static void main(String[] args) {
		try {
			//输出重定向
			System.setOut(new PrintStream(
					new FileOutputStream( "g:\\haohao.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dwdwdw");
	}
}
