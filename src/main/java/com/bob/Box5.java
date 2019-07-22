package com.bob;

public class Box5 extends Box {
    public Box5() {
        super(39.5f, 27.5f, 23f);
    }

    @Override
    protected boolean validate(float length, float width, float height) {
        return (this.length > length) && (this.width > width) && (this.height > height);
    }

    @Override
    protected void printResult() {
        System.out.println("Box5");

    }
}
