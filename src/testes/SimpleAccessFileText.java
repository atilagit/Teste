package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleAccessFileText {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\1.txt"))){
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
