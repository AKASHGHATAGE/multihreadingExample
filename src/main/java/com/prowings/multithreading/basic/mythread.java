package com.prowings.multithreading.basic;

public class mythread extends Thread{

	
	public mythread(String name) {
		
		super(name);
		System.out.println("passing parameter into the method");
	}

	public mythread() {
		super();
		System.out.println("passing parameter without the method");
	}

	@Override
	public void run() {
		System.out.println("Inside the Run() of MyThread!!!");
		myMethod1();
	}

	public void myMethod1()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println("Value of mythread class " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
