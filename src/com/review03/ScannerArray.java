package com.review03;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
	//	Use scanner to ask for the size of the array
       Scanner scan=new Scanner(System.in);
       System.out.println("How many elements do you want ?");
       int size=scan.nextInt();
       System.out.println(size);
       //I am creating an array with size=whatever he gave us
       int[] nums=new int[size];
       
       //for loop inserts numbers into array
       for (int i=0;i<size;i++) {
    	   System.out.println("Give me a number to store in the array");
    	  
    	   nums[i] =scan.nextInt();
       }
       System.out.println("Lets see");
       //This loop reads numbers from the array
       for(int n:nums) {
    	   System.out.println(n);
       }
      
	}

}
