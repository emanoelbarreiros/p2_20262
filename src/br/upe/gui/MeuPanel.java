package br.upe.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class MeuPanel extends JPanel {

    ArrayList<Forma> formas = new ArrayList<Forma>();
    JButton botao = new JButton("Limpar");

    public MeuPanel() {
        this.setPreferredSize(new Dimension(500,500));
        this.setLayout(new FlowLayout());
        this.add(botao);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formas.clear();
                repaint();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                formas.add(new Forma(e.getX(), e.getY(), 10, 10));
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (Forma f : formas) {
            g.fillOval(f.getX(), f.getY(), f.getAltura(), f.getLargura());
        }
    }
}
