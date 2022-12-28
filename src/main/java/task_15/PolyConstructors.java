package task_15;

/**
 * Exercise 15: Add a RectangularGlyph to PolyConstructors.java and
 * demonstrate the problem described in this section.
 */
class Glyph {
    void draw() {
        System.out.println(("Glyph.draw()"));
    }

    public Glyph() {
        System.out.println(("Glyph() before draw()"));
        draw();
        System.out.println(("Glyph() after draw()"));
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println(("RoundGlyph.RoundGlyph(), radius = " + radius));
    }

    void draw() {
        System.out.println(("RoundGlyph.draw(), radius = " + radius));
    }
}

class RectangularGlyph extends RoundGlyph{
    public RectangularGlyph() {
        super(111);

        System.out.println("RectangularGlyph(), new (before) finalDraw");
        finalDraw();
        System.out.println("RectangularGlyph(), new (after) finalDraw");
    }

    final void finalDraw() {
        int i = 100;
        System.out.println("Glyph.finalDraw()" + i);
    }
}

public class PolyConstructors extends RectangularGlyph {

    public static void main(String[] args) {
        new RoundGlyph(5);
        System.out.println("----------------------------------------------");
        new RectangularGlyph();
    }
}