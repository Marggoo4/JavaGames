package at.bischof.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private float x;
    private float y;
    private float speed1;
    private float speed2;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.speed1 = 10;
        this.speed2 = 20;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.x += (float)delta/this.speed1;
        this.y += (float)delta/this.speed2;

        if (this.x>800) {
            this.x = 100;
            this.y = 100;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawString("Gang shi no Lame shi", 40,40);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
