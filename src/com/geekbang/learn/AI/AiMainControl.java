package com.geekbang.learn.AI;
import java.util.Scanner;

public class AiMainControl {
         public static void main(String[] args) {
            AI ai = new AI();
            Scanner in = new Scanner(System.in);
            while (true) {
                String input = in.next();
                if ("exit".equals(input)) {
                    System.out.println("再见！");
                    break;
                }
                String answer = ai.answer(input);
                System.out.println(answer);
            }
        }
}
