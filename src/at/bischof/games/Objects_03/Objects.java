package at.bischof.games.Objects_03;

import org.newdawn.slick.*;

public class Objects extends BasicGame {
    // Rectangle
    private float xRec;
    private float yRec;
    private float speedRec;

    // Oval
    private float xOval;
    private float speedOval;
    private boolean isOvalReturning;

    // Circle
    private float yCircle;
    private float speedCircle;
    private boolean isCircleReturning;

    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // Rectangle
        this.xRec = 100;
        this.yRec = 100;
        this.speedRec = 10;

        // Oval
        this.xOval = 100;
        this.speedOval = 2;

        // Circle
        this.yCircle = 100;
        this.speedCircle = 4;


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // Rectangle
        this.xRec += (float) delta / this.speedRec;


        // Oval
        if (!isOvalReturning) {
            this.xOval += (float) delta / this.speedOval;
        } else {
            this.xOval -= (float) delta / this.speedOval;
        }


        if (this.xOval >= 700) {
            this.isOvalReturning = true;
        }
        if (this.xOval <= 100) {
            this.isOvalReturning = false;
        }


        // Circle



    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRec, this.yRec, 100, 100);
        graphics.drawOval(this.xOval, 0, 100, 50);
        graphics.drawOval(0, this.yCircle, 50, 50);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Moving Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
