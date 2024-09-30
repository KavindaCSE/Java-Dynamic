import java.util.*;

public class coin {

    public static int coinCal(int coin,List<Integer> coins){
        return coinCal(coin, coins,new HashMap<>());
    }

    public static int coinCal(int coin ,List<Integer> coins,HashMap<Integer,Integer> memo){
        if(coin == 0){
            return 0;
        }

        int minCoin = -1 ;

        if (memo.containsKey(coin)){
            return memo.get(coin);
        }

        for(int item : coins){
            int balance = coin - item;
            if (balance >= 0){
                int count = coinCal(balance,coins,memo);
                if (count > -1){
                    int subCoin = 1 + count;
                    if ( subCoin < minCoin || minCoin == -1){
                        minCoin = subCoin;
                    }
                }
            }
        }

        memo.put(coin, minCoin);
        
        return minCoin;
    }
    
    public static void main(String[] arg){
        List<Integer> amount = Arrays.asList(2,5,4);
        int result = coinCal(8,amount);
        System.out.println(result);
    }
}
