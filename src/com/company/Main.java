package com.company;

public class Main {

	public static int calculateSum(int Andrei, int Robert){
		return Andrei + Robert ;
	}

    public static void main(String[] args) {
		int ourAge = calculateSum(24,21);;

	    if (ourAge >= 45){
	    	System.out.println("Allowed");
		}else  if (ourAge <45){
	    	System.out.println("Not Allowed");
		}

    }
}
