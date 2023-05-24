package arrastabotao;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ArrastarBotao {
    private Point offset;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Arrastar Botão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JButton button = new JButton("Arraste-me!");
        button.setBounds(100, 100, 100, 50);
        ArrastarBotao example = new ArrastarBotao();

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                example.offset = e.getPoint();
                button.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        button.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = button.getLocation().x + e.getX() - example.offset.x;
                int y = button.getLocation().y + e.getY() - example.offset.y;
                button.setLocation(x, y);
            }
        });

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
