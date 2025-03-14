package at.bischof.games.objectsGame;

import org.newdawn.slick.Graphics;

public interface Actor {
    public void render(Graphics graphics);
    public void update(int delta);

}