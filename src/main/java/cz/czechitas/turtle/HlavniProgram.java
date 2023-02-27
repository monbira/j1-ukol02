package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setPenColor(Color.black);
        zofka.setPenWidth(5);

        zofka.setLocation(150, 100);
        nakreslikolecko(10);
        zofka.setLocation(145,120);
        zofka.turnLeft(90);
        nakreslitrojuhelnik(108);

        zofka.setLocation(250,70);
        nakreslikolecko(7);
        zofka.setLocation(250,150);
        nakreslikolecko(10);
        zofka.setLocation(250,265);
        nakreslikolecko(14);
        zofka.setLocation(330,175);
        nakreslikolecko(3);
        zofka.setLocation(180,175);
        nakreslikolecko(3);



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
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
        zofka.turnLeft(10);
        zofka.move(r);
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
