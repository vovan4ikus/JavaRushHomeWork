package com.javarush.test.level24.lesson14.big01;

/**
 * Created by User on 18.12.16.
 */
public class Stand extends BaseObject {
    private double speed;
    private double direction;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public Stand(double x, double y)
    {
        super(x,y,3);
        speed = 1;
        direction = 0;

    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        if (this.direction > 0) this.x +=speed;
        if (this.direction < 0) this.x -=speed;
    }
    public void moveLeft(){
        direction = -1;
    }
    public void moveRight(){
        direction = 1;
    }

}
