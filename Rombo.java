public class Rombo {
    private double _diagonaleMaggiore;
    private double _diagonaleMinore;

    public Rombo(double diagonaleMaggiore, double diagonaleMinore) {
        this._diagonaleMaggiore = diagonaleMaggiore;
        this._diagonaleMinore = diagonaleMinore;
    }

    public double getDiagonaleMaggiore() {
        return _diagonaleMaggiore;
    }

    public void setDiagonaleMaggiore(double diagonaleMaggiore) {
        this._diagonaleMaggiore = diagonaleMaggiore;
    }

    public double getDiagonaleMinore() {
        return _diagonaleMinore;
    }

    public void setDiagonaleMinore(double diagonaleMinore) {
        this._diagonaleMinore = diagonaleMinore;
    }

    public double getArea() {
        return getDiagonaleMaggiore() * getDiagonaleMinore() / 2;
    }

    public double getPerimetro() {
        return 4 * Math.sqrt(getDiagonaleMaggiore() * getDiagonaleMaggiore() + getDiagonaleMinore() * getDiagonaleMinore()) / 2;
    }

    public void stampa() {
        System.out.println("Rombo di diagonali " + getDiagonaleMaggiore() + " e " + getDiagonaleMinore());
    }

    public void piuGrandee(){
        System.out.println("La diagonale maggiore è più grande della diagonale minore");
    }

    public void enlarge(){
        setDiagonaleMaggiore(getDiagonaleMaggiore() * 2);
        setDiagonaleMinore(getDiagonaleMinore() * 2);
    }
}
