package com.company.facadedesignpattern;

public class FacadeShapeMaker {

    private Shape circle;
    private Shape rectangle;

    public FacadeShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
}
