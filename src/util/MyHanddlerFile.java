package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyHanddlerFile {
	public static List<String> process(String path) {
		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				list.add(line.trim());
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return list;
	}
}
