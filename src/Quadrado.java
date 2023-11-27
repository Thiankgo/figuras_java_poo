import java.awt.*;

public class Quadrado extends Retangulo {
    public Quadrado(int x, int y, int lado, Color cor) {
        super(x, y, lado, lado, cor);
    }

    public String toString() {
        return "Quadrado de lado " + String.valueOf(lado1);
    }
}
