package at.bischof.games.arcadeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Puncher implements Actor {
    private static final int RIGHT_BORDER = 900;
    private static final int LEFT_BORDER = 0;
    private float x;
    private float y;
    private float speed = 10.0f;


    public Puncher() {
        this.y = 600;
        this.x = 450;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x, this.y, 100, 20);
        graphics.drawString("Speed:" + this.speed, 100,100);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        float move = delta/ speed;


        if (gameContainer.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)){
            this.speed -= 0.2f;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            if (x < RIGHT_BORDER) {
                this.x += move;
            }


        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            if (x > LEFT_BORDER) {
                this.x -= move;
            }

        }


    }
}
