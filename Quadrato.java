public class Quadrato extends Rettangolo {
    public Quadrato(double lato) {
        super(lato, lato);
    }

    public double getLato() {
        return getBase();
    }

    public void setLato(double lato) {
        setBase(lato);
        setAltezza(lato);
    }

    public double getArea() {
        return getLato() * getLato();
    }

    public double getPerimetro() {
        return 4 * getLato();
    }

    public String toString() {
        return "Quadrato di lato " + getLato();
    }

    public Rettangolo DoubleQuadrato(){
        return new Rettangolo(getLato()*2, getLato());
    }

    public void enlarge(double factor) {
        setLato(getLato() * factor);
    }

    public void iLoveSquares() {
        System.out.println("I love squares!");
    }
}

    