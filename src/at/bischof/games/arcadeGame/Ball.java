package at.bischof.games.arcadeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ball implements Actor {

    private int x;
    private int y;

    public Ball() {
        this.x = 600;
        this.y = 400;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x,this.y,20,20);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
