package com.geekbang.supermarketV2;
import com.geekbang.supermarketV2.marketV2.MerchandiseV2;
import static com.geekbang.supermarketV2.marketV2.MerchandiseV2.getVIPDiscount;

public class MerchandiseMainControl {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2
                ("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
        System.out.println(getVIPDiscount());

    }
}
