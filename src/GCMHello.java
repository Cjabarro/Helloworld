import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class GCMHello extends GraphicsProgram {

    public void run(){
        GImage img = new GImage("Rizz.jpg");
        add(img, 0,0 );

        GLabel Rizz = new GLabel("Rizz Emoji");
        Rizz.setFont("Comic Sans MS-Bold-100");
        Rizz.setColor(Color.MAGENTA);
        add(Rizz, 800, 200);

        GLabel bonk = new GLabel("love on me");
        bonk.setFont("Comic Sans MS-Bold-100");
        bonk.setColor(Color.CYAN);
        add(bonk, 1400, 300);

        GLine feet = new GLine(1900,330, 1400,330);
        feet.setColor(Color.RED);
        add(feet);



        for (int count = 200; count < 350; count += 10) {
            GTurtle turtle = new GTurtle();
            add(turtle, count, count);

       GOval oval = new GOval(500,400,700,300);
       oval.setColor(Color.YELLOW);
       add(oval,1300,100);

       GRect rekt = new GRect(1000,100);
       rekt.setColor(Color.GREEN);
       add(rekt,1300,210);


        }
    }

    public static void main(String[] args){
        (new GCMHello()).start(args);

    }
}