package javaxm3.sbww;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//在 LeetCode 商店中， 有 n 件在售的物品。每件物品都有对应的价格。然而，也有一些大礼包，每个大礼包以优惠的价格捆绑销售一组物品。
//
//给你一个整数数组 price 表示物品价格，其中 price[i] 是第 i 件物品的价格。另有一个整数数组 needs 表示购物清单，其中 needs[i] 是需要购买第 i 件物品的数量。
//
//还有一个数组 special 表示大礼包，special[i] 的长度为 n + 1 ，其中 special[i][j] 表示第 i 个大礼包中内含第 j 件物品的数量，且 special[i][n] （也就是数组中的最后一个整数）为第 i 个大礼包的价格。
//
//返回 确切 满足购物清单所需花费的最低价格，你可以充分利用大礼包的优惠活动。你不能购买超出购物清单指定数量的物品，即使那样会降低整体价格。任意大礼包可无限次购买。
//
public class MyLeetCode0227 {
    Map<List<Integer>,Integer> memo = new HashMap<>();
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {

        int n = price.size();
        List<List<Integer>> filterSpecial = new ArrayList<>();
        for (List<Integer> sp:special) {
            int totalCount = 0,totalPrice = 0;
            for (int i = 0; i < n; i++) {
                totalCount+=sp.get(i);
                totalPrice+=sp.get(i)*price.get(i);
            }
            if (totalCount>0&&totalPrice>sp.get(n)){
                filterSpecial.add(sp);
            }
        }
        return dfs(price,special,needs,filterSpecial,n);


    }
    public int dfs(List<Integer> price,List<List<Integer>> special,List<Integer> curNeeds,List<List<Integer>> filterSpecial,int n){
            if (!memo.containsKey(curNeeds)){
                int minPrice = 0;
                for (int i = 0; i < n; i++) {
                    minPrice+=curNeeds.get(i)*price.get(i);
                }
                for (List<Integer> surSpecial:filterSpecial) {
                    int SpecialPrice = surSpecial.get(n);
                    List<Integer> nxtNeeds = new ArrayList<>();


                    for (int i = 0; i < n; i++) {
                        if (surSpecial.get(i)>curNeeds.get(i)){
                            break;
                        }
                        nxtNeeds.add(curNeeds.get(i)-surSpecial.get(i));
                    }


                    if (nxtNeeds.size()==n){
                        minPrice=Math.min(minPrice,dfs(price, special, nxtNeeds, filterSpecial, n)+SpecialPrice);
                    }


                }
                memo.put(curNeeds,minPrice);
            }
            return memo.get(curNeeds);
    }
}
