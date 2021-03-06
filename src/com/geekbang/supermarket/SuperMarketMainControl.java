package com.geekbang.supermarket;

import com.geekbang.supermarket.market.SuperMarket;
import com.geekbang.supermarket.market.MerChandise;

import java.util.Scanner;

public class SuperMarketMainControl {
    public static void main(String[] args) {
        // 创建一个小超市类
        SuperMarket littleSuperMarket = new SuperMarket();
        // 依次给超市的名字，地址，赋值
        littleSuperMarket.superMarketName = "全家Family";
        littleSuperMarket.address = "黄浦区西藏南路400号";
        littleSuperMarket.parkingCount = 100;
        // 给超市200种商品
        littleSuperMarket.merchandises = new MerChandise[200];
        // 统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        MerChandise[] all = littleSuperMarket.merchandises;

        // 遍历并给200种商品赋值
        for (int i = 0; i < all.length; i++) {
            // 创建并给商品的属性赋值
            MerChandise m = new MerChandise();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            all[i] = m;
        }

        // 创建一个Scanner读取输入
        Scanner scanner = new Scanner(System.in);
        MerChandise m0 = all[0];
        while (true) {
            System.out.println("今日超市大特惠，所有商品第二件半价！选择要购买的商品索引：");
            int index = scanner.nextInt();
            if (index < 0) {
                System.out.println("欢迎再次光临！");
                break;
            }

            System.out.println("请输入要购买的数量：");

            int count = scanner.nextInt();

            MerChandise m = littleSuperMarket.merchandises[index];

            System.out.println("用户选择的商品是超市里价值最高的：" +m.isTheBiggestTotalValueOne(littleSuperMarket));

            double totalCost = m.buyAndPrintLeft(count, true);

            boolean m0BiggerThan = m0.totalValueBiggerThan(m);

            System.out.println("m0的总价值比用户选择的要大：" + m0BiggerThan);

            System.out.println("商品总价为：" + totalCost);
        }

    }
}
