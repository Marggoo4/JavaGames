package at.bischof.games.starwarsGame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tarkin implements Actor {

    private Image tarkinImage;
    private float x;
    private float y;
    private float speed;

    public Tarkin () throws SlickException {
        Image tmp = new Image("testdata/myImages/Tarkin.jpg");
        this.tarkinImage = tmp.getScaledCopy(150,150);
        this.x = 900;
        this.y = 100;
        this.speed = 4;
    }




    @Override
    public void render(Graphics graphics) {
        tarkinImage.draw(this.x,this.y);
    }

    @Override
    public void update(int delta) {
        this.x -= (float) delta / this.speed;

        if (this.x < 500) {
            this.x = 900;
        }
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

}
