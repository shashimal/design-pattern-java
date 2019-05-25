package com.duleendra.designpattern.decorator.christmastree;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return christmasTree.decorate()+" "+this.decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return " with Bubble Lights";
    }
}
