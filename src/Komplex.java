public class Komplex {

    double re = 1;
    double im = 1;

    public Komplex(double a, double b){
        re = a;
        im = b;
    }

    public Komplex add(Komplex x){
        double re3 = re + x.re;
        double im3 = im + x.im;
        Komplex a = new Komplex(re3, im3);
        return a;
    }

    @Override
    public String toString() {
        return "Komplex{ " + re + " + " + im + "i }";
    }
}
