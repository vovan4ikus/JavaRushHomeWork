package com.javarush.test.level25.lesson16.big01;

/**
 * Created by User on 30.12.16.
 */
public class BaseObject {
    private double x;
    private double y;
    private double radius;
    boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        isAlive = true;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isAlive() {

        return isAlive;
    }
}
