package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FlatFile {

	public static void main(String[] args) throws FileNotFoundException {

		List<Person> list = readfile("C:\\Users\\Rohit\\eclipse-workspace\\2020\\FlatFileReader2\\src\\com\\example\\demo\\Untitled.txt");

		print(list);
	}

	private static void print(List<Person> list) {
		list.forEach((Person person) -> System.out.println(person));
		
	}

	private static List<Person> readfile(String fileName) throws FileNotFoundException {

		List<Person> list = new ArrayList<>();

		File file=new File(fileName);
		if(file.canRead())
		{
			Person p;
			Scanner sc=new Scanner(file);
			
			while(sc.hasNext())
			{
				p=new Person();
				p.setFirstName(sc.next());
				p.setLastName(sc.next());
				list.add(p);
			}
		}
		return list;
	}

}
