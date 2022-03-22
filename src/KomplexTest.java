import static java.lang.Math.*;

public class KomplexTest {

    public static void main(String[] args) {
        Komplex a = new Komplex(3.0,2.0);
        Komplex b = new Komplex(4.0,1.0);

        System.out.println("talet borde vara 3 + 2i:\n" + "talet är " + a);

        Komplex c = a.add(b);
        Komplex d = new Komplex(7,3);

        System.out.println("C: " + c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }

        c = a.multiply(b);
        d = new Komplex(10,11);

        System.out.println("C: " +c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till 3+2i är " + a.arg()+ " radianer");
        if (a.arg() == Math.atan(2.0/3.0)) {
            System.out.println("arg() funkar!!");
        }

        System.out.println("Argumentet till 3+2i är ungefär 33.69 grader");
        System.out.println("Argumentet är exakt " + a.argDeg() + " grader");

        c = a.subtract(b);
        d = new Komplex(-1,1);

        System.out.println("C: " + c);
        if (c.equals(d)) {
            System.out.println("subtract funkar!!");
        }

        c = a.divide(b);
        d = new Komplex(0.8235294118 , 0.2941176471);

        System.out.println("C: " + c);
        System.out.println("D: " + d);

    }
}