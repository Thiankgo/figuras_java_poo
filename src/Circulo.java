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

        for (double i = -this.raio; i < this.raio; i++) {
            for (double j = -this.raio; j < this.raio; j++) {
                if ((this.raio * this.raio) > ((i * i) + (j * j))) {
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
