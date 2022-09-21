package com.javapractice;

import java.io.*;
import java.util.*;

public class Sumofthreeintgers {

	// Prints all triplets in arr[] with 0 sum
	static void findTriplets(int[] arr, int n) {
		boolean isfound = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						isfound = true;
					}
				}
			}
		}

		// If no triplet with 0 sum found in array
		if (isfound == false)
			System.out.println(" Number not exist ");
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		findTriplets(arr, n);
	}

}
