package edu.cis232;

public class FirstExample {

	public static void main(String[] args) {
		countDown(10);

	}
	
	public static void countDown(int count){
		//base case/stopping condition
		if(count <= 0){
			return;
		}
		
		//recursive case
		System.out.println(count);
		countDown(count - 1);
	}

}
