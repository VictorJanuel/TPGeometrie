import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HelloWorld {

  public static void main(String[] args) {
    JFrame window = new JFrame("Première appli");
    window.add(new JLabel("Hello world!"));
    window.setSize(300,100);
    window.setLocation(100, 100);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}