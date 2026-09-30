package br.upe.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painter {

    private JPanel panel;
    private JButton limparButton;

    public Painter() {
        panel.addMouseMotionListener(new MeuPaintMotionListener(panel));
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.getGraphics().setColor();
                ((Graphics2D) panel.getGraphics()).setPaint(Color.WHITE);
                panel.getGraphics().fillRect(0,0,panel.getWidth(), panel.getHeight());
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
