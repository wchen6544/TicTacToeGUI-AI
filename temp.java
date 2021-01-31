import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class temp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JOptionPane.showMessageDialog(null, new DrawPanel());
            }
        });
    }

    private static class DrawPanel extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private boolean draw = false;
        int x1, y1, x2, y2;
        JFrame frame;
        public DrawPanel() {
            JButton button = new JButton("Draw");
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    x1 = 50; y1 = 50; x1 = 200; y2 = 300;
                    draw = true;
                    repaint();
                
                }
            });
            add(button);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillRect(0, 0, getWidth(), getHeight());
            if (draw) {
                g.setColor(Color.GREEN);
                g.drawLine(x1, y1, x2, y2);
            }  
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 300);
        }
    }
}