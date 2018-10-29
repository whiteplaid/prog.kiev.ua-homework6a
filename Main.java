package com.homework.factorial;

public class Main {

	public static void main(String[] args) {
		Thread[] tmp = new Thread[100];
		for (int i = 0; i < tmp.length; i+=1) {
			tmp[i] = new Thread (new FactorialThread (i));
		}
		for (int i = 0; i < tmp.length;i+=1) {
			tmp[i].start();
		}
	}

}
