package com.prowings.multithreading.sync;

public class BookMySeats {

	private static int totalavelebaleSeats=10;
	
	
	public synchronized static void  bookSeats(String username,int requestedSeats)
	{
		System.out.println(" Inside the bookseats Methods !!!");	
		if(totalavelebaleSeats>=requestedSeats)
		{
			System.out.println(username +" is trying to book "+requestedSeats +" seats ..");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			totalavelebaleSeats=totalavelebaleSeats-requestedSeats;
			System.out.println(username +"Successfully books  "+requestedSeats +"seats remaing "+ totalavelebaleSeats);
			
		}
		else {
			System.out.println(username +"Can not book seats "+requestedSeats + "Seats. Reaming "+totalavelebaleSeats +" left");
		}
	}
	
}
