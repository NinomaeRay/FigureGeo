public class Rettangolo {
    private double _base;
    private double _altezza;

    public Rettangolo(double base, double altezza) {
        this._base = base;
        this._altezza = altezza;
    }

    public double getBase() {
        return _base;
    }

    public void setBase(double base) {
        this._base = base;
    }

    public double getAltezza() {
        return _altezza;
    }

    public void setAltezza(double altezza) {
        this._altezza = altezza;
    }

    public double getArea() {
        return getBase() * getAltezza();
    }

    public double getPerimetro() {
        return 2 * (getBase() + getAltezza());
    }
}
