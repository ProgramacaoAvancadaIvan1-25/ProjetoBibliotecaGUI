import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        super("Exercicio 3");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new JButton("Botao"));

    }


}
