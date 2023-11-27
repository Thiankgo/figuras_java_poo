import java.awt.*;

public class Quadrado extends Retangulo {
    public Quadrado(int x, int y, int lado, Color cor) {
        super(x, y, lado, lado, cor);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", cor=" + cor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
