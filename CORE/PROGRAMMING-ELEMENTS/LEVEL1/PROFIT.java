
//QUES4.
public class PROFIT{
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice ;
        double profitPercentage = ((double) profit / costPrice )*(100);
        System.out.print("The Cost Price is INR " + costPrice + " and Selling price is INR "+ sellingPrice + "\n" + "The profit is INR "+ profit + " and the Profit percentage is " + profitPercentage );
    }
}