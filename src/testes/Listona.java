package testes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class Listona {

	public static void main(String[] args) {
		try {
			Set<String> set = new HashSet<>();
			Files.readAllLines(Paths.get("C:\\temp\\1.txt")).forEach(x -> set.add(x)); 
			set.forEach(x -> System.out.print(x + ", "));
			System.out.println("\n" + set.size());
			//Files.lines(Paths.get("C:\\temp\\1.txt")).forEach(System.out::println); //esse retorna uma stream
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
