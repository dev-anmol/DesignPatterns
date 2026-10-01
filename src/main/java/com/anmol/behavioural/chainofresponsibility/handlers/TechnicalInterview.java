package com.anmol.behavioural.chainofresponsibility.handlers;

import java.util.Scanner;

public class TechnicalInterview extends InterviewHandler {

    @Override
    public void hire(String candidate) {
        System.out.println("Technical Round for " + candidate);
        int score = new Scanner(System.in).nextInt();

        if (score >= 70) {
            System.out.println(candidate + " passed in " + this.getClass().getSimpleName());
            System.out.println();
            callNext(candidate);
            return;
        }

        System.out.println(candidate + " failed in " + this.getClass().getSimpleName());
    }


}
