package com.prowings.multithreading.sync;

public class TestBookMySeatApp {
	
	public static void main(String[] args) {
		
		System.out.println("Main method started !");
		
		
		BookMySeats bookMySeats1=new BookMySeats();
		BookMySeats bookMySeats2=new BookMySeats();
		
		BookMySeatApplication thread1=new BookMySeatApplication(bookMySeats1,5);
		BookMySeatApplication thread2=new BookMySeatApplication(bookMySeats2,5);
		
		thread1.setName("Ram");
		thread2.setName("Laxman");
		
		thread1.start();
		thread2.start();
		
		
		System.out.println("Main method Ended !");
		
	}

}

