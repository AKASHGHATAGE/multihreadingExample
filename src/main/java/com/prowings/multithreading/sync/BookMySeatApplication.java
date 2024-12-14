package com.prowings.multithreading.sync;

public class BookMySeatApplication extends Thread{
	
	BookMySeats bookMySeats;
	int seats;
		
	
	public BookMySeatApplication(BookMySeats bookMySeats1, int seats) {
		super();
		this.bookMySeats=bookMySeats;
		this.seats=seats;
	}

	
	@Override
	public void run() {
		
		
		String threadName =Thread.currentThread().getName();
		System.out.println(threadName + "Initiated Seat Booking !!");
		
		BookMySeats.bookSeats(threadName, seats);
		
		System.out.println(threadName + "Finished Seat Booking !!");

	}
	
	
	
	

}
