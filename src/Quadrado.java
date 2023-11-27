import java.awt.*;

public class Quadrado extends Retangulo {
    public Quadrado(int lado, Color cor) {
        super(lado, lado, cor);
    }

    public String toString() {
        return "Quadrado de lado " + String.valueOf(lado1);
    }
}
