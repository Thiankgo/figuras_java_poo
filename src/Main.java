import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    static private ArrayList<Figura> figuras;
    static private JComboBox<String> listaFiguras;

    static private String currentFigure;
    static private JSlider sliderR, sliderG, sliderB, sliderSize;
    static private JTextField coordX, coordY;
    static private Painel painel;
    public static int width;
    public static int height;

    public static void main(String[] args) {
        figuras = new ArrayList<>();
        painel = new Painel(figuras);

        width = 1300;
        height = 1000;

        JFrame frame = new JFrame("Figuras");
        frame.setSize(width, height);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(painel);

        //figuras.add(new Retangulo(500, 500, 950, 600, new Color(0, 156, 59)));
        //figuras.add(new Losango(500, 500, 750, 500, new Color(255, 223, 0)));
        //figuras.add(new Circulo(500, 500, 170, new Color(0, 39, 118)));
        //figuras.add(new Estrela(550, 400, 15, new Color(255, 255, 255)));
        //figuras.add(new Estrela(500, 600, 6, new Color(255, 255, 255)));
        //figuras.add(new Estrela(390, 550, 7, new Color(255, 255, 255)));
        //figuras.add(new Estrela(590, 570, 5, new Color(255, 255, 255)));

        listaFiguras = new JComboBox<>(new String[]{"Retângulo", "Quadrado", "Triângulo", "Círculo", "Losango", "Estrela"});
        listaFiguras.setBounds(10, 10, 120, 25);
        listaFiguras.addActionListener(e -> updateFigura((String) listaFiguras.getSelectedItem()));
        updateFigura("Retângulo");
        painel.add(listaFiguras);

        sliderR = criarSlider("R", 10, 300, 0, 255);
        sliderG = criarSlider("G", 10, 350, 0, 255);
        sliderB = criarSlider("B", 10, 400, 0, 255);

        sliderSize = criarSlider("Tamanho", 10, 350, 0, 800);

        JLabel lblCoordX = new JLabel("X:");
        lblCoordX.setBounds(20, 300, 20, 30);
        painel.add(lblCoordX);

        coordX = new JTextField(String.valueOf(width/2));
        coordX.setBounds(40, 300, 50, 30);
        painel.add(coordX);

        JLabel lblCoordY = new JLabel("Y:");
        lblCoordY.setBounds(100, 300, 20, 30);
        painel.add(lblCoordY);

        coordY = new JTextField(String.valueOf(height/2));
        coordY.setBounds(120, 300, 50, 30);
        painel.add(coordY);

        JButton botaoCriar = new JButton("Criar Figura");
        botaoCriar.setBounds(150, 300, 100, 30);
        botaoCriar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                criarFigura();
            }
        });
        painel.add(botaoCriar);

        frame.setVisible(true);
    }

    static private JSlider criarSlider(String label, int x, int y, int min, int max) {
        JLabel rotulo = new JLabel(label);
        rotulo.setBounds(x, y, 30, 25);
        painel.add(rotulo);

        JSlider slider = new JSlider(min, max, (min + max) / 2);
        slider.setBounds(x + 40, y, 200, 25);
        painel.add(slider);

        return slider;
    }

    static private void updateFigura(String tipoFigura) {
        currentFigure = tipoFigura;
    }

    static private void criarFigura() {
        painel.repaint();

        Figura figura = getFigura(currentFigure);
        figuras.add(figura);
        painel.revalidate();
        painel.repaint();
    }

    private static Figura getFigura(String tipoFigura) {
        Figura figura;

        Color corFigura = new Color(sliderR.getValue(), sliderG.getValue(), sliderB.getValue());
        int tamanho = sliderSize.getValue();
        int newX = Integer.parseInt(coordX.getText());
        int newY = Integer.parseInt(coordY.getText());

        figura = switch (tipoFigura) {
            case "Retângulo" -> new Retangulo(newX, newY, tamanho * 3 / 2, tamanho, corFigura);
            case "Quadrado" -> new Quadrado(newX, newY, tamanho, corFigura);
            case "Círculo" -> new Circulo(newX, newY, tamanho / 2, corFigura);
            case "Losango" -> new Losango(newX, newY, tamanho * 3 / 2, tamanho, corFigura);
            case "Estrela" -> new Estrela(newX, newY, tamanho / 2, corFigura);
            default -> new Triangulo(newX, newY, tamanho, tamanho, corFigura);
        };
        return figura;
    }
}