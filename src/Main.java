import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Retangulo(950, 600, new Color(7, 82, 0)));
        figuras.add(new Losango(750, 500, new Color(255, 218, 0)));
        figuras.add(new Circulo(170, new Color(0, 24, 173)));
        figuras.add(new Estrela(20, new Color(255, 255, 255)));

        JFrame frame = new JFrame("Figuras");
        frame.setSize(1000, 1000);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new Painel(figuras));
        frame.setVisible(true);
    }
}