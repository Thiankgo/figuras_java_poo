import java.awt.*;

public class Losango extends Figura {
    protected int base;
    protected int altura;

    public Losango(int base, int altura, Color cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura / 2.;
    }

    public String toString() {
        return "Losango de base " + String.valueOf(altura) + " e altura " + String.valueOf(base);
    }

    public void desenhar(Graphics g) {
        int x = 500;
        int y = 500;

        int[] xPoints = {
                x - base / 2,
                x,
                x + base / 2,
                x
        };

        int[] yPoints = {
                y,
                y - altura / 2,
                y,
                y + altura / 2
        };

        Polygon poligono = new Polygon(xPoints, yPoints, 4);

        g.setColor(cor);
        g.fillPolygon(poligono);  // Use fillPolygon to draw a filled triangle
    }
}
