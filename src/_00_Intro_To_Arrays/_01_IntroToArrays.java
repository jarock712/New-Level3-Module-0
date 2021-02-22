package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = {"Snickers", "Hersheys", "Twix","KitKat","Reeeses"}; 
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "AlmondJoy";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "Butterfinger";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
		int [] array2 = new int[5];
		//8. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		int [] array3 = new int [49];
		for (int i = 0; i < 49; i++) {
			array3[i] = ran.nextInt(100);
			System.out.println(array3[i]);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = array3[0];
		for (int i = 1; i < array3.length; i++) {
			if (smallest > array3[i]) {
				smallest = array3[i];
			}
		}
		//10 print the entire array to see if step 8 was correct
		for (int j = 0; j < array3.length; j++) {
			System.out.println(array3[j]);
		}
		//11. print the largest number in the array.
		int biggest = array3[0];
		for (int i = 1; i < array3.length; i++) {
			if (biggest < array3[i]) {
				biggest = array3[i];
			}
		}
		//12. print only the last element in the array
		System.out.println(array3[array3.length - 1]);
	}
}