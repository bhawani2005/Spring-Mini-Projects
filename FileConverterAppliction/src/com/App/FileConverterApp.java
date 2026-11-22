package com.App;

import java.util.Scanner;

class MsgToFile{
	FileConverter converter;

	public MsgToFile(FileConverter converter) {
		this.converter = converter;
	}
	
	public String convert(String data) {
		return converter.convert(data);
	}
	
}

class FileConverterFactory{
	public static FileConverter getFileConverter(String type) {
		FileConverter converter = null;
		if(type.equalsIgnoreCase("word")) {
			converter = new WordFileConverter();
		}
		else if(type.equalsIgnoreCase("pdf")) {
			converter = new PdfFileConverter();
		}
		else {
			converter = null;
		}
		
		return converter;
	}
}

interface FileConverter{
	public String convert(String data);
}

class WordFileConverter implements FileConverter{

	@Override
	public String convert(String data) {
		String result = "<html>"+data+"</html>";
		return result;
	}
	
}
 
class PdfFileConverter implements FileConverter{

	@Override
	public String convert(String data) {
		String result = "<pdf>"+data+"</pdf>";
		return result;
	}
	
}

public class FileConverterApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\u001B[31m"+"Enter Your massage : ");
		System.out.println("\u001B[0m"+"---------------------");
		String data = sc.next();
		
		System.out.println("Enter Word for convert into word file.");
		System.out.println("Enter PDF for convert into pdf file.");
		String type = sc.next();
		String result = FileConverterFactory.getFileConverter(type).convert(data);
		
		System.out.println(result);
		
		sc.close();
	}

}
