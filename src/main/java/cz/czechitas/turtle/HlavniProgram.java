package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setPenColor(Color.black);
        //zmrzlina
        zofka.setLocation(100,100);
        nakresliKolecko(20);
        zofka.turnRight(90);
        nakresliTrojuhelnik(120);
        //snehulak
        zofka.setLocation(100,300);
        nakresliKolecko(5);
        zofka.setLocation(100,330);
        nakresliKolecko(10);
        zofka.setLocation(100,390);
        nakresliKolecko(15);
        zofka.setLocation(60,340);
        nakresliKolecko(5);
        zofka.setLocation(140,340);
        nakresliKolecko(5);
        //masinka








    }

    private void nakresliTrojuhelnik(int delkaTrojuhelniku) {
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaTrojuhelniku);
            zofka.turnRight(120);
        }
    }

    private void nakresliKolecko(int delkaStranyKolecka) {
        for (int i = 0; i < 20; i++) {
            zofka.move(delkaStranyKolecka);
            zofka.turnRight(18);
        }
    }

    private void nakresliObdelnik(int delkaObdelniku, int sirkaObdelniku) {
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaObdelniku);
            zofka.turnRight(90);
            zofka.move(sirkaObdelniku);
            zofka.turnRight(90);
        }
    }

        public static void main(String[] args) {
        new HlavniProgram().start();
    }
}
