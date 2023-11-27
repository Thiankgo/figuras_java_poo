import javax.swing.*;
import java.awt.*;

abstract public class Figura {
    protected Color cor;

    public void setCor(int r, int g, int b) {
        this.cor = new Color(r, g, b);
    }

    public Color getCor() {
        return this.cor;
    }

    public abstract void desenhar(Graphics g);
}
