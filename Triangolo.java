public class Triangolo {
    private double _base;
    private double _altezza;

    public Triangolo(double base, double altezza) {
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
        return getBase() * getAltezza() / 2;
    }

    public double getPerimetro() {
        return Math.sqrt(getBase() * getBase() + getAltezza() * getAltezza()) + getBase() + getAltezza();
    }
}
