package application2;

import java.util.List;

import util.MyHanddlerFile;
import util.MyMatcher;

public class Program1 {

	public static void main(String[] args) {
		MyMatcher<String> myMatcherString = new MyMatcher<>();
		
		String path1 = "C:\\temp\\lista1.txt";
		List<String> lista1 = MyHanddlerFile.process(path1);
		
		String path2 = "C:\\temp\\lista2.txt";
		List<String> lista2 = MyHanddlerFile.process(path2);
		
		String path3 = "C:\\temp\\lista3.txt";
		List<String> lista3 = MyHanddlerFile.process(path3);
		
		System.out.println(myMatcherString.verify(lista1, lista3));
		System.out.println(myMatcherString.verify(lista1, lista2));
	}
}
