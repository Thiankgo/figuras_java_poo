import java.awt.*;

public class Triangulo extends Figura {
    protected int base;
    protected int altura;

    public Triangulo(int x, int y, int base, int altura, Color cor) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area() {
        return this.altura * this.base / 2;
    }

    public String toString() {
        return "Triângulo de base " + String.valueOf(base) + " e altura " + String.valueOf(altura);
    }

    public void desenhar(Graphics g) {
        int[] xPoints = {
                x,
                x - base / 2,
                x + base / 2
        };

        int[] yPoints = {
                y - altura / 2,
                y + altura / 2,
                y + altura / 2
        };

        Polygon triangulo = new Polygon(xPoints, yPoints, 3);

        g.setColor(cor);
        g.fillPolygon(triangulo);  // Use fillPolygon to draw a filled triangle
    }
}
