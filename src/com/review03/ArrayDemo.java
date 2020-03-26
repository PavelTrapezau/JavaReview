package com.review03;

public class ArrayDemo {

	public static void main(String[] args) {
		
	//1st way 
		//declaring array
	//int[] numbers=new int [5];
	//initializing values for array elements
//	numbers[3]=10;
//	numbers[1]=7;
//	numbers[2]=8;
//	numbers[0]=5;
//	numbers[4]=20;
//	System.out.println(numbers[0]);
//	System.out.println(numbers[1]);
//	System.out.println(numbers[2]);
//	System.out.println(numbers[3]);
//	System.out.println(numbers[4]);
//	//printing the elements with index 2,third element
//	System.out.println("Printing using index with variable");
//	int i=2;
//	System.out.println(numbers[i]);
//    i++;
//    System.out.println(numbers[i]);
//    int arrayLength=numbers.length;
//    System.out.println("The length of the array is : "+arrayLength);
//    // a) method using for loop
//    System.out.println("Using for loop");
//    for(int j=0;j<arrayLength;j++) {
//    	System.out.println(numbers[j]);
//    	// b) using for-each loop/advanced for loop/enhanced for loop
//    	// this method iterates the whole array
//    	System.out.println("Using for each loop");
//    	for(int number:numbers) {
//    		System.out.println(number);
//   	}
    	// 2nd professional way
    	System.out.println("Second way using curly brackets");
    	int[]numbers2= {4,6,8,9,15};
    	System.out.println("Length is "+numbers2.length);
    	for (int j=0;j<numbers2.length;j++) {
    		System.out.println(numbers2[j]);
    	}
    
	}

}
