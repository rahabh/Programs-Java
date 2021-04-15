package com.codes;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		int result =0;
		//1. Approach
		// Use the concept of XOR 
		// 0^0 = 1 ^1 =0
		// 1 ^ 0 = 0 ^1 = 1
		// 0 ^ x = x
		
		for (int i=0; i<nums.length; i++) {
			result = result ^ nums[i];
		}
		System.out.println("result: " + result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {6,6,9,0,0,9,1,7,7};
		int [] nums1 = {1,2,2,0,0,3,3,4,1};
		SingleNumber sNumber = new SingleNumber();
		sNumber.singleNumber(nums);
		sNumber.singleNumber(nums1);

	}

}
