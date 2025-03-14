package at.bischof.games.objectsGame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{

    private float x;
    private float y;
    private float speed;
    private int diameter;
    private int counter = 0;

    public Circle() {

        Random random = new Random();
        this.x = random.nextInt(1000);
        this.y = random.nextInt(800);
        this.speed = random.nextInt(30) + 10;
        this.diameter = random.nextInt(40) + 10;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(int delta) {
        counter++;
        if (counter>100){
            diameter++;
            counter = 0;
        }

        if (diameter > 100) {
            diameter = 10;
        }

        this.y += (float) delta / this.speed;

        if (this.y > 800) {
            this.y = 0;
        }

    }

}
