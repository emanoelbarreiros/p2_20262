package br.upe.gui;

import javax.swing.*;
import java.awt.*;

public class PainterFrame {
    public static void main(String[] args) {
        MeuPanel painter = new MeuPanel();
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(painter);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
