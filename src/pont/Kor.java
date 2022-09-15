package pont;

public class Kor {
    private double sugar;
    private int x;
    private int y;

    public Kor(double sugar){
        this.sugar = sugar;
        x = 0;
        y = 0;
    }

    public Kor(double sugar, int x, int y){
        this.sugar = sugar;
        this.x = x;
        this.y = y;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return String.format("(%f, %d, %d)",this.sugar, this.x, this.y);
    }
}
