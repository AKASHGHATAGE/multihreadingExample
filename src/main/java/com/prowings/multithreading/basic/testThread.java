package com.prowings.multithreading.basic;

public class testThread {
	
	public static void main(String[] args) {
		
		System.out.println("Main method started ");
		
		mythread mythread1=new mythread();
		MyThread2 myThread2=new MyThread2();
		Thread trThread=new Thread(myThread2);
		mythread1.start();
		trThread.start();
		
		
		System.out.println("Main method Ended ");
	}

}
