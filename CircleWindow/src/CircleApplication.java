import javax.swing.JFrame;

public class CircleApplication {
	public static void main(String[] arguments) {
		JFrame window = new JFrame("Circles"); 
		CirclePanel panel = new CirclePanel();
		window.setContentPane(panel);
		panel.addMouseListener(new CircleClickListener(panel));
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setVisible(true);
	}
}
