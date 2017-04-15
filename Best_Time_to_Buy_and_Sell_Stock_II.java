package practice;

public class Best_Time_to_Buy_and_Sell_Stock_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] prices = {1,2,3,4,5,6};
       int ans = maxProfit(prices);
       System.out.print(ans);
	}
	public static int maxProfit(int[] prices) {
		int price=0;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i]<prices[i+1]){
				price+=(prices[i+1]-prices[i]);
			}
		}return price;
    }
}
