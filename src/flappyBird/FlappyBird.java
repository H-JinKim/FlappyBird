package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener{
	
	public static FlappyBird flappyBird;
	
	public final int WIDTH = 800, HEIGHT =800;
	
	public Renderer renderer;
	
	public Rectangle bird;
	
	public FlappyBird() {
		JFrame jFrame = new JFrame();
		Timer timer = new Timer(20, this);		//implements ActionListener
		
		
		
		Renderer renderer = new Renderer();
		jFrame.add(renderer);
		jFrame.setSize(WIDTH, HEIGHT);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		
		
		bird = new Rectangle(WIDTH/2-10,HEIGHT/2-10,20,20);		//x,y, size	
		
		
		}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		renderer.repaint();
		
	}
	public void repaint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.red);
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
	}
	
	
	
	public static void main(String[] args) {
		flappyBird = new FlappyBird(); 
		
		
		
		
	}



	

}
