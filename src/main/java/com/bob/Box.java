package com.bob;

public abstract class Box {
    protected float length;
    protected float width;
    protected float height;

    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    protected abstract boolean validate(float length, float width, float height);

    protected abstract void printResult();
}
