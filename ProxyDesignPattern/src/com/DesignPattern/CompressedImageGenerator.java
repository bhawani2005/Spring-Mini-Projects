package com.DesignPattern;

import java.util.Arrays;

public class CompressedImageGenerator implements IImageGenerator {

	private RealImageGenerator generator;
	
	@Override
	public byte[] imageGenerator(String data) {
		
		generator = new RealImageGenerator();
		
		byte[] image = Arrays.copyOf(generator.imageGenerator(data), data.length()-4);
		
		return image;

	}

}
