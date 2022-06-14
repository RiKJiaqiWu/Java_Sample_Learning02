package com.geekbang.supermarketV2;
import com.geekbang.supermarketV2.marketV2.SuperMarketV2;
import com.geekbang.supermarketV2.marketV2.MerchandiseV2;

public class SuperMarketV2MainControl {
    public static void main(String[] args) {
        // 创建一个小超市类
        SuperMarketV2 littleSuperMarket = new SuperMarketV2(
                "有家小超市", "浦东新区世纪大道666号",
                100, 200, 200);

        System.out.println("VIP的折上折折扣最终为：" + MerchandiseV2.getDiscountOnDiscount(littleSuperMarket));

    }
}
