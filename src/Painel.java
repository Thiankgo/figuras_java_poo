import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Painel extends JPanel {
    private ArrayList<Figura> figuras;

    public Painel(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Figura figura : figuras) {
            figura.desenhar(g);
        }
    }
}
