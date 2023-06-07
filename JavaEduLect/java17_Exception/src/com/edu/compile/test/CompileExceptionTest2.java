package com.edu.compile.test;

/*
 * Compile시 예외 발생 --> 예외처리를 무조건 하고 사용해야 한다.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading {
	public void readFile(String fileName) {
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			
		}
		
	}
}

public class CompileExceptionTest2 {

	public static void main(String[] args) {
		
		FileReading f = new FileReading();
		String fileName = "C:\\JavaEduWork\\java01_OOP\\src\\com\\edu\\oop\\Greeting.java";
		f.readFile(fileName);
		
		System.out.println("파일을 잘 읽어들였습니다.");
	}

}
