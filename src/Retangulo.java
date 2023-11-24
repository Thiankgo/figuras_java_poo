public class Retangulo extends Figura {
    protected double lado1;
    protected double lado2;

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area() {
        return this.lado1 * this.lado2;
    }

    public String toString() {
        String texto = "";

        for (int i = 0; i < this.lado1; i++) {
            for (int j = 0; j < this.lado2; j++) {
                texto += '*';
            }
            texto += '\n';
        }
        return texto;
    }
}
