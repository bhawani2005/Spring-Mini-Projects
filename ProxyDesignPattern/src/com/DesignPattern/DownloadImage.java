package com.DesignPattern;

public class DownloadImage {

	IImageGenerator generator;
	
	public byte[] getImage(String data, String type) {
		
		if (type.equalsIgnoreCase("web")) {
			generator = new RealImageGenerator();
			return generator.imageGenerator(data);
		}
		else {
			generator = new CompressedImageGenerator();
			return generator.imageGenerator(data);
		}
	}
}
