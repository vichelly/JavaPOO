import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ArrastarImagem {
    private Point offset;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Arrastar Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        // Carregar a imagem, só consegui passando este caminho.. provavelmente não vai funcionar então fiz o arrasta botão
        // n consegui passar o caminho para a imagem da FEI nesta pagina
        ImageIcon imagemIcone = new ImageIcon("C:\\Users\\vluca\\OneDrive\\Imagens\\02.jpg");
        JLabel label = new JLabel(imagemIcone);
        label.setBounds(100, 100, imagemIcone.getIconWidth(), imagemIcone.getIconHeight());
        ArrastarImagem example = new ArrastarImagem();
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                example.offset = e.getPoint();
                label.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        
        label.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = label.getLocation().x + e.getX() - example.offset.x;
                int y = label.getLocation().y + e.getY() - example.offset.y;
                label.setLocation(x, y);
            }
        });

        
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}