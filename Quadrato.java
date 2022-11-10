public class Quadrato {
    private double _lato;

    public Quadrato(double lato) {
        this._lato = lato;
    }

    public double getLato() {
        return _lato;
    }

    public void setLato(double lato) {
        this._lato = lato;
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

    public void enlarge(double factor) {
        setLato(getLato() * factor);
    }

    public void iLoveSquares() {
        System.out.println("I love squares!");
    }
}
    