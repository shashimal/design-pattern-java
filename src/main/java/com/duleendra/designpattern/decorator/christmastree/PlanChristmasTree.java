package com.duleendra.designpattern.decorator.christmastree;

public class PlanChristmasTree implements ChristmasTree {
    @Override
    public String decorate() {
        return "Plain Christmas Tree";
    }
}
