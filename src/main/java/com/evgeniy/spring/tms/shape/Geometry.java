package com.evgeniy.spring.tms.shape;

public class Geometry {
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void print(){
        shape.draw();
    }
}
