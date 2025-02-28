package at.bischof.games.Objects_03;

import org.newdawn.slick.*;

public class Objects extends BasicGame {
    // Rectangle
    private float xRec;
    private float yRec;
    private float speedRec;
    private boolean movingRecRight = true;
    private boolean movingRecDown = false;
    private boolean movingRecLeft = false;
    private boolean movingRecUp = false;

    // Oval
    private float xOval;
    private float speedOval;
    private boolean isOvalReturning;

    // Circle
    private float yCircle;
    private float speedCircle;
    private boolean movingCircle;

    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // Rectangle
        this.xRec = 100;
        this.yRec = 100;
        this.speedRec = 2.5f;

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
        if (movingRecRight) {
            this.xRec += (float) delta / this.speedRec;

            if (this.xRec >= 600) {
                movingRecRight = false;
                movingRecDown = true;
            }
        }

        if (movingRecDown) {
            this.yRec += (float) delta / this.speedRec;

            if (this.yRec >= 400) {
                movingRecDown = false;
                movingRecLeft = true;
            }
        }

        if (movingRecLeft) {
            this.xRec -= (float) delta / this.speedRec;

            if (this.xRec <= 100) {
                movingRecLeft = false;
                movingRecUp = true;
            }
        }

        if (movingRecUp) {
            this.yRec -= (float) delta / this.speedRec;

            if (this.yRec <= 100) {
                movingRecUp = false;
                movingRecRight = true;
            }
        }




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
        if (movingCircle) {
            this.yCircle += (float) delta / this.speedCircle;

            if (this.yCircle > 500) {
                movingCircle = false;
            }
        } else {
            this.yCircle -= (float) delta / this.speedCircle;

            if (this.yCircle < 100) {
                movingCircle = true;
            }
        }


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
