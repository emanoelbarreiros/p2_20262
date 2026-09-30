package br.upe.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class MeuPaintMotionListener extends MouseMotionAdapter {

    private JPanel panel;

    public MeuPaintMotionListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        ((Graphics2D) panel.getGraphics()).setPaint(Color.BLACK);
        panel.getGraphics().fillOval(e.getX(), e.getY(), 10, 10);
    }
}
