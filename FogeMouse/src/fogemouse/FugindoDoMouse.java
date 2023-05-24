/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fogemouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FugindoDoMouse extends JFrame implements MouseListener {
    private JButton button;

    public FugindoDoMouse() {
        setTitle("Clique-me se for capaz!");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        button = new JButton("Clique-me!");
        button.addMouseListener(this);

        setLayout(new FlowLayout());
        add(button);
    }

    public void mouseClicked(MouseEvent e) {
        int newX = (int) (Math.random() * (getWidth() - button.getWidth()));
        int newY = (int) (Math.random() * (getHeight() - button.getHeight()));
        button.setLocation(newX, newY);
    }

    // Métodos do MouseListener não utilizados, mas necessários para implementar a interface
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FugindoDoMouse frame = new FugindoDoMouse();
                frame.setVisible(true);
            }
        });
    }
}