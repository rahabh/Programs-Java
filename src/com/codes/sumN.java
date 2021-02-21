package com.codes;

public class sumN {
	public void solution(int N) {
		int[] arr = new int[N];
		for (int i = 1; i < N; i++) {
			arr[i] = i;

		}
//		return i;

//		for (int i = 0; i < N; i++) {
//			System.out.println(arr[i]);
//		}

		int [] arrSum = new int [N];
		int [] arrTemp = new int [N];
		
		for (int i=0; i<N;i++) {
			arrTemp[i]=arr[i];
			StringBuilder str1 = new StringBuilder();
			StringBuilder str2 = new StringBuilder();
		
		}
		
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				if (arr[i]+arr[j]==N) {
					System.out.println(arr[i] +" and " + arr[j]);
					
				}
			}
		}
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumN n = new sumN();
		n.solution(16);
	}

}
