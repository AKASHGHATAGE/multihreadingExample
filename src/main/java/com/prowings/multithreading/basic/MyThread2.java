package com.prowings.multithreading.basic;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside the Run() of MyThread2!!!");
		MyThread2();
	}
	
	public void MyThread2() {
		for(int i=10;i>5;i--)
		{
			System.out.println("Another object thread values = "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
	

}
