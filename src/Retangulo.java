import java.awt.*;

public class Retangulo extends Figura {
    protected int lado1;
    protected int lado2;

    public Retangulo(int x, int y, int lado1, int lado2, Color cor) {
        this.x = x;
        this.y = y;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    public int getLado1() {
        return this.lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return this.lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double area() {
        return this.lado1 * this.lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", cor=" + cor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillRect(this.x - this.lado1 / 2, this.y - this.lado2 / 2, this.lado1, this.lado2);
    }
}
