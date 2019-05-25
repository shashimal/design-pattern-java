package com.duleendra.designpattern.decorator.christmastree;

public class TreeTopper extends TreeDecorator {
    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " "+ decorateWithTreeTopper();
    }

    private String decorateWithTreeTopper() {
        return " with Tree Topper";
    }
}
