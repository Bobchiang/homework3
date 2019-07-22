package com.bob;

public class Box3 extends Box {
    public Box3() {
        super(23f, 14f, 13f);
    }

    @Override
    protected boolean validate(float length, float width, float height) {
        return (this.length > length) && (this.width > width) && (this.height > height);
    }

    @Override
    protected void printResult() {
        System.out.println("Box3");
    }
}
