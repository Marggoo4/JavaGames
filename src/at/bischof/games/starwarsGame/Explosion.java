package at.bischof.games.starwarsGame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Explosion implements Actor {

    private Image explosionImage;
    private float x, y;
    private boolean active;

    public Explosion(float x, float y) throws SlickException {
        this.explosionImage = new Image("testdata/myImages/Explosion_Image.jpg").getScaledCopy(200, 200);
        this.x = x;
        this.y = y;
        this.active = false;
    }

    public void trigger(float x, float y) {
        this.x = x;
        this.y = y;
        this.active = true;
    }

    @Override
    public void render(Graphics graphics) {
        if (active) {
            explosionImage.draw(x, y);
        }
    }

    @Override
    public void update(int delta) {
        // Explosion nach kurzer Zeit ausblenden (z. B. nach 2 Sekunden)
        if (active) {
            active = false; // Setze auf false, wenn die Explosion nicht dauerhaft sichtbar sein soll
        }
    }
}
