package com.DesignPattern;

import java.util.Random;

public class RealImageGenerator implements IImageGenerator {

	@Override
	public byte[] imageGenerator(String data) {
		
		byte[] image = new byte[data.length()];
		Random random = new Random();
		for(int i=0; i<image.length; i++) {
			image[i] = (byte) random.nextInt(2);
		}

		return image;
	}
}


