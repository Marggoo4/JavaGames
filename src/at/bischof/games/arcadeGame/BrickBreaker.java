package at.bischof.games.arcadeGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class BrickBreaker extends BasicGame {

    private List<Actor> actors;
    private boolean gameStarted = false;

    private boolean countdownActive = false;
    private int countdown = 3;
    private int countdownTimer = 3000;

    public BrickBreaker(String title) {
        super(title);
    }



    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        // Puncher
        Puncher puncher = new Puncher();
        this.actors.add(puncher);

        // Ball
        Ball ball = new Ball();
        this.actors.add(ball);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (gameStarted) {
            for (Actor actor : this.actors) {
                actor.update(gameContainer, delta);
            }

        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        if (!gameStarted) {
            graphics.drawString("Drücke Leertaste, um zu starten", 350, 350);
        } else {

            for (Actor actor : this.actors) {
                actor.render(graphics);
            }
        }



    }


    @Override
    public void keyPressed(int key, char c) {

        if (key == Input.KEY_SPACE) {
            gameStarted = true;
        }
        super.keyPressed(key, c);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new BrickBreaker("Brick Breaker"));
            container.setDisplayMode(1000, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
