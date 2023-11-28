import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Retangulo(500, 500, 950, 600, new Color(0, 156, 59)));
        figuras.add(new Losango(500, 500, 750, 500, new Color(255, 223, 0)));
        figuras.add(new Circulo(500, 500, 170, new Color(0, 39, 118)));
        figuras.add(new Estrela(550, 400, 15, new Color(255, 255, 255)));

        // Não vo fazer todas estrelas >:(
        figuras.add(new Estrela(500, 600, 6, new Color(255, 255, 255)));
        figuras.add(new Estrela(390, 550, 7, new Color(255, 255, 255)));
        figuras.add(new Estrela(590, 570, 5, new Color(255, 255, 255)));

        JFrame frame = new JFrame("Figuras");
        frame.setSize(1000, 1000);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new Painel(figuras));
        frame.setVisible(true);
    }
}