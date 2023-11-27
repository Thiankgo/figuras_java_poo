import java.awt.*;

public class Estrela extends Figura {
    protected int raio;

    public Estrela(int raio, Color cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double area() {
        return 10 * ((Math.tan(Math.PI / 10)) / (3 - Math.pow(Math.tan(Math.PI / 10), 2))) * (raio * raio);
    }

    public void desenhar(Graphics g) {
        int x = 500;
        int y = 500;

        int[] xPoints = new int[10];
        int[] yPoints = new int[10];

        for (double i = 0; i < 10; i++) {
            double r = 1;

            if (i % 2 == 1) {
                r = 0.382;
            }

            xPoints[(int) i] = x + (int) (Math.cos(Math.PI * i / 5. - Math.PI / 10.) * raio * r);
            yPoints[(int) i] = y + (int) (Math.sin(Math.PI * i / 5. - Math.PI / 10.) * raio * r);

            System.out.printf("%d %d\n", xPoints[(int) i], yPoints[(int) i]);
        }

        Polygon poligono = new Polygon(xPoints, yPoints, 10);

        g.setColor(cor);
        g.fillPolygon(poligono);
    }
}
