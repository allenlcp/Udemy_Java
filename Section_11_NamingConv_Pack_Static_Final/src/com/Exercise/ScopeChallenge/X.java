package com.Exercise.ScopeChallenge;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Enter integer:");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x<13; x++){
            System.out.println(x + " times " + this.x + " equals " + (x*this.x));
        }
    }
}