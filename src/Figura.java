import javax.swing.*;
import java.awt.*;

abstract public class Figura extends JFrame  {
    protected Color cor;
    protected int x;
    protected int y;

    public void setCor(int r, int g, int b) {
        this.cor = new Color(r, g, b);
    }

    public Color getCor() {
        return this.cor;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void desenhar(Graphics g);
}
