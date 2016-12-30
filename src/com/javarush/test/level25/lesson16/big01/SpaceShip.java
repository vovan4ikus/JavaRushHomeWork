package com.javarush.test.level25.lesson16.big01;

/**
 * Created by User on 30.12.16.
 */
public class SpaceShip extends BaseObject {
    private double dx;
    public SpaceShip(int x, int y)
    {
        super(x, y, 3);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public void move() {
        x = x + dx;

        checkBorders(radius, Space.game.getWidth() - radius + 1, 1, Space.game.getHeight() + 1);
    }

    public void moveLeft(){
        this.dx = -1;
    }

    public void moveRight(){
        this.dx = 1;
    }
    public void fire(){
        Space.game.getRockets().add(new Rocket(x - 2, y));
        Space.game.getRockets().add(new Rocket(x + 2, y));
    }
}
