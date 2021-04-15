package com.codes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, YYYY hh:mm:ss");
		String time = localDateTime.format(format);
		
		System.out.println(time);

	}

}

