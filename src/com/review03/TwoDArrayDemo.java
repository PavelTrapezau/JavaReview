package com.review03;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		//1st way of creating 2d array
		int[][]numbers=new int[2][3];
		//enter into array.into row index0 and column index 2
		numbers[0][2]=8;
		numbers[1][0]=5;
		
		//2nd way of 2d-array
		int[][]numbers2= {
				{5,6,8},
				{9,2,3}
		};
		System.out.println("Lets get some val from numbers2");
		int value=numbers2[1][0];
        System.out.println("Its should be 9.Is it?"+value);
        //2d array is married to nested for loop
        int rows=numbers2.length;
        int columns=numbers2[0].length;
        for(int row=0;row<numbers2.length;row++) {
        	System.out.println("I am in the "+row+ " row");
        	for(int col=0;col<numbers2[row].length;col++) {
        		System.out.print("I am in column "+col);
        		System.out.println("The val is"+numbers2[row][col]);
        		
        	}
        	System.out.println();
        }
	}

}
