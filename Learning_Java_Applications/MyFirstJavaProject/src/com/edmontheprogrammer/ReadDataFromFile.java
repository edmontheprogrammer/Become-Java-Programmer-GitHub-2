package com.edmontheprogrammer;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path file = FileSystems.getDefault().getPath("", "file.txt");
		List<String> lines = Files.readAllLines(file); 
//		for (int i  = 0 ; i < lines.size(); i++) {
//			System.out.println(lines.get(i));
//		}
		
		lines.forEach((str) -> System.out.println(str));
		lines.forEach( System.out::println);

	}

}
