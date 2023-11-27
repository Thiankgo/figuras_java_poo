import java.awt.*;
import java.lang.Math;

public class Circulo extends Figura {
    protected int raio;

    public Circulo(int raio, Color cor) {
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

    public String toString() {
        return "Círculo de raio " + String.valueOf(raio);
    }

    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillOval(500 - getDiametro() / 2, 500 - getDiametro() / 2, getDiametro(), getDiametro());
    }
}
