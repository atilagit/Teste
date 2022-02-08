package testes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MoreSimpleAccessFileText {

	public static void main(String[] args) {
		try {
			Files.readAllLines(Paths.get("C:\\temp\\1.txt")).forEach(System.out::println); //esse retorna um list
			Files.lines(Paths.get("C:\\temp\\1.txt")).forEach(System.out::println); //esse retorna uma stream
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
