public class Cerchio {

    private double _raggio;

    public Cerchio(double raggio) {
        this._raggio = raggio;
    }

    public double getRaggio() {
        return _raggio;
    }

    public void setRaggio(double raggio) {
        this._raggio = raggio;
    }

    public double getArea() {
        return Math.PI * getRaggio() * getRaggio();
    }

    public double getPerimetro() {
        return 2 * Math.PI * getRaggio();
    }
}