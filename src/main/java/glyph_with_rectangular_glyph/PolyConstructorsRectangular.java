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

class RectangularGlyph extends Glyph {                      //created new class
    private int diameter;                                   //created field
    private String glyphName;                               //created field

    public RectangularGlyph(int diameter, String glyphName) { //created constructor with arguments
        System.out.println("Rectangular Glyph constructor before override draw() method");
        this.diameter = diameter;
        this.glyphName = glyphName;
        draw();         /*overridden method in this constructor and this constructor called after base-class constructor Glyph.
         It is argument in method in base class not initialized, 0 and null.
         After then called RectangularGlyph constructor with overridden draw() method */
        System.out.println("Rectangular Glyph constructor after override draw() method");
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
        System.out.println("Rectangular Glyph(), " + "Diameter: " + getDiameter() + ", GlyphName: " + getGlyphName());
    } //override draw() method in RectangularGlyph class

}

public class PolyConstructorsRectangular {
    public static void main(String[] args) {
        new RoundGlyph(5);              //create instance RoundGlyph
        System.out.println("----------------------------------------------");
        new RectangularGlyph(10, "Rectangular Glyph"); //create instance RectangularGlyph
    }
}

/*
Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
----------------------------------------------
Glyph() before draw()
RectangularGlyph(), Diameter: 0, GlyphName:null
Glyph() after draw()
RectangularGlyph constructor before override draw() method
RectangularGlyph(), Diameter: 10, GlyphName:RectangularGlyph
RectangularGlyph constructor after override draw() method
 */
