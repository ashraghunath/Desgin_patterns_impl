package com.company.bridgedesignpattern;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing green circle, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}