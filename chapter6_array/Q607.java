package chapter6_array;

import java.util.ArrayList;
import java.util.List;

//Q: buy and sell a stock once
public class Q607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] prices = {310,315,275,295,260,270,290,230,255,250};
		System.out.println(maxProfitBuySellOnce(prices));

	}
	
	//for each position in array, store the current minPrice seen, max_profit for that position is price - minPriceSeen
	//O(n)t , O(1)sp
	public static double maxProfitBuySellOnce(double[] prices){
		double maxProfit = Double.MIN_VALUE;
		double minPrice = Double.MAX_VALUE;
		for(double price: prices){
			if(price < minPrice){
				minPrice = price;
			}
			if(price - minPrice > maxProfit){
				maxProfit = price - minPrice;
			}
		}
		return maxProfit;
	}

}
