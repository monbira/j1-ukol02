package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(200,200);
        nakreslitrojuhelnik(300);
        zofka.setLocation(200,200);
        nakreslictverec(40);
        zofka.setLocation(300,300);
        nakreslikolecko(300);

    }

    public void nakreslitrojuhelnik (double velikoststrany) {
        zofka.move(velikoststrany);
        zofka.turnLeft(120);
        zofka.move(velikoststrany);
        zofka.turnLeft(120);
        zofka.move (velikoststrany);
        zofka.turnLeft(120);
    }

    public void nakreslictverec (double velikoststrany) {
        zofka.move(velikoststrany);
        zofka.turnLeft(90);
        zofka.move(velikoststrany);
        zofka.turnLeft(90);
        zofka.move(velikoststrany);
        zofka.turnLeft(90);
        zofka.move(velikoststrany);
        zofka.turnLeft(90);
    }

    public void nakresliobdelnik (double a, double b) {
        zofka.move(a);
        zofka.turnLeft(90);
        zofka.move(b);
        zofka.turnLeft(90);
        zofka.move(a);
        zofka.turnLeft(90);
        zofka.move(b);
        zofka.turnLeft(90);
    }



    public void nakreslikolecko (double r) {
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnLeft(10);
        zofka.move(5);
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
