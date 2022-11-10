public class Cerchio {
    private double Ray;
    public Cerchio(double Ray) {
        this.Ray = Ray;
    }
    public double getRaggio() {
        return Ray;
    }
    public void setRaggio(double Ray) {
        this.Ray = Ray;
    }
    public double getArea() {
        return Math.PI * Ray * Ray;
    }
    public double getPerimetro() {
        return 2 * Math.PI * Ray;
    }
}