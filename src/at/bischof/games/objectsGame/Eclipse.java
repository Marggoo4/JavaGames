package at.bischof.games.objectsGame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Eclipse {

    private float x;
    private float y;
    private float speed;
    private int width;
    private int height;

    public Eclipse() {

        Random random = new Random();
        this.x = random.nextInt(1000);
        this.y = random.nextInt(800);
        this.speed = random.nextInt(30) + 10;
        this.width = random.nextInt(40) + 10;
        this.height = random.nextInt(30) + 10;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.width, this.height);
    }

    public void update(int delta) {

        this.y += (float) delta / this.speed;

        if (this.y > 800) {
            this.y = 0;
        }

    }


}
