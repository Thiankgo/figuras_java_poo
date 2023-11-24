public class Triangulo extends Figura {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return this.altura * this.base / 2;
    }

    public String toString() {
        String texto = "";

        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i/this.altura > j/this.base) {
                    texto += '*';
                }
            }
            texto += '\n';
        }

        return texto;
    }
}
