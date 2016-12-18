package com.javarush.test.level24.lesson14.big01;

/**
 * Created by User on 18.12.16.
 */
public abstract class BaseObject {
    double x;
    double y;
    double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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
    public boolean isIntersec(BaseObject o){
        double distance = Math.sqrt(Math.abs((x*x + y*y) - (o.x*o.x + o.y*o.y)));
        double d = (this.radius < o.radius) ? o.radius : this.radius;
        return distance < d ;
    }
    abstract void move();
    abstract void draw();
}
