package com.javarush.test.level25.lesson16.big01;

/**
 * Created by User on 30.12.16.
 */
public class Bomb extends BaseObject {
    public Bomb(double x, double y)
    {
        super(x, y, 1);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x,y,'B');
    }

    @Override
    public void move() {
        y++;
    }
}
