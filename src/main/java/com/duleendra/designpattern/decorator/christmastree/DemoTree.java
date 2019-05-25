package com.duleendra.designpattern.decorator.christmastree;

public class DemoTree {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new BubbleLights(new PlanChristmasTree());
        System.out.println(christmasTree.decorate());

        ChristmasTree christmasTree1 = new BubbleLights(new TreeTopper(new PlanChristmasTree()));
        System.out.println(christmasTree1.decorate());
    }
}
