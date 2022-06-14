package com.geekbang.guessnumber;
import java.util.Scanner;

public class GuessNumber {
    public int rangeStart = 1;
    public int rangeEnd = 8;
    public int guessTotal = 5;
    public int totalCorrectCount = 0;
    public int num = 0;
    public int guessnum;

    public boolean guessCorrect;
    public void guessNum() {
        Scanner in = new Scanner(System.in);
        totalCorrectCount = 0;
        num = NumRandom(num);
        while(true) {
            if (totalCorrectCount >= 5) {
            System.out.println("你的猜谜次数已经用完了，下次再来吧");
            }
            guessnum = in.nextInt();
            if (guessnum == -1) {
                System.out.println("再见！");
                break;
            }
            else if (guessCorrect != true) {
                guessCorrect = NumComparsion(guessCorrect);
            } else
                break;
        }
    }

    private int NumRandom(int num) {
        int mod = rangeEnd - rangeStart;
        double randNum = Math.random();
        num = ((int) (randNum * rangeEnd * 100)) % mod;
        num += rangeStart;
        if (num <= rangeStart) {
            num = rangeStart + 1;
        }
        if (num >= rangeEnd) {
            num = rangeEnd - 1;
        }
        return num;
    }

    private boolean NumComparsion(boolean guessCorrect) {
        totalCorrectCount++;
        if (guessnum == num) {
            guessCorrect = true;
            System.out.println("恭喜你猜对了！这次的数字就是" + num +
                    "。本次你共猜了" + totalCorrectCount + "次。");

        } else if (guessnum > num) {
            guessCorrect = false;
            System.out.println("猜测的数字比目标数字大。");
        } else {
            guessCorrect = false;
            System.out.println("猜测的数字比目标数字小。");
        }
        return guessCorrect;
    }
}


