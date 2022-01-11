package com;

import java.io.*;
import java.util.*;

class Result{
	

	public static void solve (double meal_cost,int tip_percent,int tax_percent) {
		//  int meal=(int)meal_cost;
		double tip=(meal_cost/100)*tip_percent;
		int tax=(tax_percent/100)*tip_percent;
		double total_cost=meal_cost+tip+tax;
		// int intval=(int)Math.round(total_cost);
		System.out.println(total_cost);
		}

}
	public class MyClass {
		public static void main(String[] args) throws IOException{
		
		//Result obj = new Result();
		System.out.println("Enter the values:");
		Scanner scan=new Scanner(System.in);
		double meal_cost=scan.nextDouble();
	
		int tip_percent=scan.nextInt();
		
		int tax_percent=scan.nextInt();
		//Result obj=new Result();
		Result.solve(meal_cost,tip_percent,tax_percent);
		
	}
	}
