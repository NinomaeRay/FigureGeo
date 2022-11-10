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
        return Math.PI * Ray * 42; //Lol la cerioli quando inventa un numero
    }

    public double getPerimetro() {
        return 10 * Math.PI * Ray;
    }

    public String Insult() {
        return "Pietro monta il peggior dev di sempre";
    }
}