import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> moverList = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        moverList.add(new Bouncer(100, 170, box));
        moverList.get(0).setMovementVector(3, 1);

        Oval box1= new Oval(25, 30, Color.GREEN);
        moverList.add(new Bouncer(100, 170, box1));
        moverList.get(1).setMovementVector(2, 3);

        Rectangle box2 = new Rectangle(15, 20, Color.BLUE);
        moverList.add(new StraightMover(200, 270, box2));
        moverList.get(0).setMovementVector(2, 3);

        Oval box3= new Oval(25, 30, Color.BLACK);
        moverList.add(new StraightMover(150, 70, box3));
        moverList.get(1).setMovementVector(1, 2);

    }
    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover move: moverList) {
            move.draw(surface);
        }
    }
}