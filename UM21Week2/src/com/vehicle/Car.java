package com.vehicle;

import java.util.ArrayList;

public class Car {
	public void getLuckyRegistrationNumber(int luckyNumber) {
		System.out.println("Lucky Number : " + luckyNumber);
		//
		// int sum = 0;
		// int i = 5423;
		// System.out.println("Entered Number : " + i);
		// while(i>0){
		// sum = sum + i%10;
		// ///System.out.println(sum);
		// i = i /10;
		// //System.out.println(i);
		// }
		// System.out.println("Sum = " + sum);
		// if(sum>10){
		// i = sum;
		// sum = 0;
		// while(i>0){
		// sum = sum + i%10;
		// ///System.out.println(sum);
		// i = i /10;
		// //System.out.println(i);
		// }
		// }
		// System.out.println("Sum = " + sum);
		
		//Primitives	Wrappers
		//byte  	  	 - Byte
		//short    		- Short
		//int      		- Integer
		//long    		- Long
		//float   	 	- Float
		//double  		- Double
		//char    		- Character
		//boolean 		 - Boolean
		
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		int curVal = 0;
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			if ((i < 10) && (i == luckyNumber)) {
				//Integer wI = new Integer(i); // converting a primitive to wrapper object
				//resultList.add(wI);
				Integer wI = Integer.valueOf(i);
				resultList.add(wI); //Autboxing - converting a primitive to wrapper class object automatically
			} else if (i >= 10) {
				curVal = i;
				while (curVal > 0) {
					sum = sum + curVal % 10;
					curVal = curVal / 10;
				}
				if (sum > 10) {
					curVal = sum;
					sum = sum + curVal % 10;
					curVal = curVal / 10;
				}
			}
			if (sum == luckyNumber) {
				resultList.add(i);
			}
			sum = 0;
		}
		for(Integer x : resultList){ // unboxing - converting a wrapper object to primitive directly
			int rX = x.intValue();
			if(rX>0){
				System.out.println(rX);
			}
		}
	}
}
