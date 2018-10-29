package com.homework.factorial;

import java.math.BigInteger;


public class FactorialThread implements Runnable {
	private int number;

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	public FactorialThread() {
		super();
	}

	public int getNumber() {
		return number;
	}
	private BigInteger calculateFactorial (int number) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 2; i <= number; i+=1) {
			factorial = factorial.multiply(new BigInteger("" + i));
		}
		return factorial;
	}
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		for (int i = 1; i <= this.number; i+=1) {
			System.out.println(thr.getName() + " " + i + "!= " + calculateFactorial(i));
		}
		
	}
	

}
