package glyph_hand_made;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");             // create method
    }

    public Glyph() {                                    //create constructor
        System.out.println("Glyph() before draw()");    //print message
        draw();                                         //calling dynamically-bound method inside constructor
        System.out.println("Glyph() after draw()");     //print message
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;                           //initialize variable radius

    public RoundGlyph(int r) {                       //create constructor
        this.radius = r;                             //our constructor to refers on concrete the variable
        System.out.println(("RoundGlyph.RoundGlyph(), radius = " + radius));    //print message with the variable
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);  //override method draw()
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);                  //create instance
    }
}

/*
1. The base-class constructors are called first.
2. draw( ) method in base-class constructors is not initialized, because кфвшгы
Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
 */
