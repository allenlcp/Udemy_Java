package com.github.allendecodemtl.L_03_Scope;

public class Main {
    public static void main(String[] args) {
        String varFour = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.userInner();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree);

//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//        scopeInstance.timesTwo();
//        System.out.println("==============");
//        ScopeCheck.InnerClass inner = scopeInstance.new InnerClass();
//        inner.timesTwo();
    }
}