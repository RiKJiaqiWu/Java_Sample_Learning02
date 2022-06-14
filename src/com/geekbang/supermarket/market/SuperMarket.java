package com.geekbang.supermarket.market;

public class SuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerChandise[] merchandises;
    public int[] merchandiseSold;

    public MerChandise getBiggestProfitMerchandise() {
        MerChandise curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerChandise m = merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }
}
