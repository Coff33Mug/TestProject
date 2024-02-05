import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleClickListener extends MouseAdapter {
	private CirclePanel panel;
	
	public CircleClickListener(CirclePanel panel) {
		super();
		this.panel = panel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + " , " + e.getY());
		panel.addCircle(new Circle(e.getX(), e.getY(), 24, Color.BLACK));
		
	}
	
	
}
