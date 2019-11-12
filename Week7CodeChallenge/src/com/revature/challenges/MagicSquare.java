package com.revature.challenges;


public class MagicSquare {

	public static void main(String[] args) {
		int[][] solution1 = new int[3][3];
		solution1[0][0]=8;
		solution1[0][1]=3;
		solution1[0][2]=4;
		solution1[1][0]=1;
		solution1[1][1]=5;
		solution1[1][2]=9;
		solution1[2][0]=6;
		solution1[2][1]=7;
		solution1[2][2]=2;
		
		
	int[][] given_matrix = new int[3][3];
		given_matrix[0][0]=5;
		given_matrix[0][1]=3;
		given_matrix[0][2]=4;
		given_matrix[1][0]=1;
		given_matrix[1][1]=5;
		given_matrix[1][2]=8;
		given_matrix[2][0]=6;
		given_matrix[2][1]=4;
		given_matrix[2][2]=2;
		
		int cost = 0;
		for (int i = 0; i < 3; i++) 
			for (int j = 0; j< 3; j++)				
				{
				if (given_matrix[i][j] != solution1[i][j]) {
					cost = cost + java.lang.Math.abs(given_matrix[i][j] - solution1[i][j]);
					given_matrix[i][j] = solution1[i][j];
					
				}
			}
				System.out.println(cost);
	}

}
