package com.geekbang.guessnumber;
import java.util.Scanner;

public class GuessNumberMainControl {
    public static void main(String[] args) {
        GuessNumber guessnumber = new GuessNumber();
        System.out.println("=================== 猜 数 字 ===================");
        System.out.println("目标数已经生成，数字在" + guessnumber.rangeStart + "到" + guessnumber.rangeEnd + "之间，" +
                "不包括这两个数。共有" + guessnumber.guessTotal + "次猜测的机会。输入-1随时结束游戏。");
        guessnumber.guessNum();
    }
}


