package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(100,100);
        nakreslitrojuhelnik(50);
        zofka.setLocation(200,200);
        nakreslictverec(40);

    }

    public void nakreslitrojuhelnik (double velikoststrany) {
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(120);
    }

    public void nakreslictverec (double velikoststrany) {
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);

    }

    public void nakresliobdelnik (double velikoststrany) {

    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
