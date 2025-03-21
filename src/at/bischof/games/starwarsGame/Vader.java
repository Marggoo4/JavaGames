package at.bischof.games.starwarsGame;


import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Vader implements Actor {

    private Image vaderImage;
    private float x;
    private float y;
    private float speed;



    public Vader () throws SlickException {
        Image tmp = new Image("testdata/myImages/Vader.jpeg");
        this.vaderImage = tmp.getScaledCopy(150,150);
        this.x = 100;
        this.y = 100;
        this.speed = 4;

    }


    @Override
    public void render(Graphics graphics) {
        vaderImage.draw(this.x,this.y);


    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;

        if (this.x > 500) {
            this.x = 100;
        }

    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

}
