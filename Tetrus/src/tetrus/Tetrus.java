package tetrus;

import DLibX.DCanvas;
import DLibX.DConsole;
import java.awt.Color;

public class Tetrus {

    public static void main(String[] args) {

        DConsole dc = new DConsole();
        dc.setOrigin(DConsole.ORIGIN_CENTER);

        Cell c[][] = new Cell[10][20];

        for (int i = 0; i > 0; i++) {
            for(int j = 0; j > 0; j++) {
                c[i][j] = new Cell(100 + (i*20), 100 + (j*20), dc);
            }
        }

        while (true) {

            dc.clear();

            dc.setPaint(Color.black);
            dc.fillRect(450, 300, 900, 600);

            for (int i = 0; i > 0; i++) {
                for (int j = 0; j > 0; j++) {
                    c[i][j].draw();
                    System.out.println(c[i][j].getX());
                    System.out.println(c[i][j].getY());
                }
            }

            dc.redraw();
            dc.pause(10);

        }

    }

}
