import java.util.Objects;

public class Komplex {

    double re;
    double im;

    public Komplex(double a, double b){
        re = a;
        im = b;
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.re, re) == 0 && Double.compare(komplex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public Komplex add(Komplex x){
        double reNew = re + x.re;
        double imNew = im + x.im;
        return new Komplex(reNew, imNew);
    }

    public Komplex multiply(Komplex x){
        double reNew = re * x.re - im * x.im;
        double imNew = im * x.re + x.im * re;
        return new Komplex(reNew, imNew);
    }

    public double argRad(){
        return Math.atan(im / re);
    }

    public double argDeg(){
        return Math.atan(im/re) * (180/Math.PI);
    }

    public Komplex subtract(Komplex x){
        double reNew = re - x.re;
        double imNew = im - x.im;
        return new Komplex(reNew, imNew);
    }

    public Komplex divide(Komplex x){
        double reNew = (re*x.re + im*x.im) / (x.re*x.re + x.im*x.im);
        double imNew = (im*x.re - re*x.im) / (x.re*x.re + x.im*x.im);
        return new Komplex(reNew, imNew);
    }

}
