package at.bischof.games.starwarsGame;

import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.List;

public class ImageGame extends BasicGame {

    private List<Actor> actors;

    // Instanzvariablen für Vader, Explosion und Tarkin
    private Explosion explosion;
    private Vader vader;
    private Tarkin tarkin;

    public ImageGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        // Die Instanzvariablen werden hier korrekt initialisiert
        this.vader = new Vader();
        this.actors.add(vader);

        this.tarkin = new Tarkin();
        this.actors.add(tarkin);

        this.explosion = new Explosion(500, 100);  // Explosion mit Initialposition
        this.actors.add(explosion);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // Alle Schauspieler aktualisieren
        for (Actor actor : this.actors) {
            actor.update(delta);
        }

        // Kollisionsprüfung zwischen Vader und Tarkin
        if (Math.abs(vader.getX() - tarkin.getX()) < 50) {
            // Explosion auslösen, wenn Vader und Tarkin nah beieinander sind
            explosion.trigger((vader.getX() + tarkin.getX()) / 2, vader.getY());
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // Alle Schauspieler rendern
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ImageGame("Vader thought he was better"));
            container.setDisplayMode(1000, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
