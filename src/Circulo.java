import java.lang.Math;

public class Circulo extends Figura {
    protected double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return this.raio * this.raio * Math.PI;
    }

    public String toString() {
        String texto = "";
        double raio = this.raio * 10;
        for (double i = -raio; i < raio; i++) {
            for (double j = -raio; j < raio; j++) {
                if ((raio * raio) > ((i * i) + (j * j))) {
                    texto += '*';
                } else {
                    texto += ' ';
                }
            }
            texto += '\n';
        }
        return texto;
    }
}
