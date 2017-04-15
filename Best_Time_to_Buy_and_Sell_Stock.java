package practice;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] prices = {7, 1, 5, 3, 6, 4};
     int ans = maxProfit(prices);
     System.out.print(ans);
	}
   public static int maxProfit(int[] prices) {
       int total = 0;
       for(int i=0;i<prices.length-1;i++){
    	   for(int j=i+1;j<prices.length;j++){
    		   if(prices[j]>prices[i]){
    			   total = Math.max(total, prices[j]-prices[i]);
    		   }
    	   }
       }return total;
    }
}
