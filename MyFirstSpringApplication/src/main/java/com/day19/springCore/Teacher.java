package com.day19.springCore;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Teacher {
	private int id;
	private String name;
	private String className;
	private List<String> subject;
	//private String Department;
}
