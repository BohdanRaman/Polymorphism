package glyph_with_rectangular_glyph;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");             // created method draw()
    }

    public Glyph() {                                    //created constructor. The base-class constructor is called first.
        System.out.println("Glyph() before draw()");    //print message
        draw();                                         //calling dynamically-bound method inside constructor. It is not initialized.
        System.out.println("Glyph() after draw()");     //print message
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;                           //initialize variable radius

    public RoundGlyph(int r) {                       //create constructor RoundGlyph, but constructor Glyph called first.
        this.radius = r;                             //our constructor to refers on concrete the variable
        System.out.println(("RoundGlyph.RoundGlyph(), radius = " + radius));    /* print message with the variable.
                                                                                 The body of the derived-class (RoundGlyph) constructor is called. */
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);  //override method draw()
    }
}

class RectangularGlyph extends Glyph {
    private int diameter;
    public String glyphName;

    public RectangularGlyph(int diameter, String glyphName) {
        this.diameter = diameter;
        this.glyphName = glyphName;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getGlyphName() {
        return glyphName;
    }

    public void setGlyphName(String glyphName) {
        this.glyphName = glyphName;
    }

    void draw() {
        System.out.println("RectangularGlyph()" + getDiameter() + ", " + getGlyphName());
    }

    @Override
    public String toString() {
        return "RectangularGlyph{" +
                "diameter=" + getDiameter() +
                ", glyphName='" + getGlyphName() + '\'' +
                '}';
    }
}

public class PolyConstructorsRectangular {
    public static void main(String[] args) {
        new RoundGlyph(5);                  //create instance
        RectangularGlyph r = new RectangularGlyph(10, "A");
        System.out.println(r);

    }
}

/*
Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
 */
