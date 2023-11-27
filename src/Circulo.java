import java.awt.*;
import java.lang.Math;

public class Circulo extends Figura {
    protected int raio;

    public Circulo(int x, int y, int raio, Color cor) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.cor = cor;
    }

    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double area() {
        return this.raio * this.raio * Math.PI;
    }

    public int getDiametro() {
        return this.raio * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor=" + cor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillOval(this.x - getDiametro() / 2, this.y - getDiametro() / 2, getDiametro(), getDiametro());
    }
}
