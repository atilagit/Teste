package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Test {
    public static void main(String[] args) {
    	
    	String palavra = "texto";
    	
    	List<String> lista = Arrays.asList(palavra, palavra);
    	
    	System.out.println(lista);
    }
}