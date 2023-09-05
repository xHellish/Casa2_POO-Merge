package gui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
	private JTextArea textArea;
	private JButton button2;
	
	public GUI() {
		setTitle("Patio Casa 2");
        setSize(500, 600); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        JLabel label = new JLabel("Patio");
        label.setFont(new Font("Arial", Font.BOLD, 18)); // Set font and size
        label.setForeground(Color.red); // Set text color
        label.setBounds(150, 10, 100, 40);

        // Add label to the frame's content pane
        getContentPane().setLayout(null);
        getContentPane().add(label);
        
        textArea = new JTextArea();
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        Rectangle textAreaBounds = new Rectangle(50, 60, 380, 450);
        textArea.setBounds(textAreaBounds);
        textArea.setEditable(false);
        
        // Add text area to the frame's content pane
        getContentPane().add(textArea);    
        
        // Set null layout
        getContentPane().setLayout(null);
    }
	
	public void crearVentana() {
		SwingUtilities.invokeLater(() -> {
			GUI frame = new GUI();
	        frame.setVisible(true);
	    });
	}
	
	public void decirAccion(String hora, String accion) {
		textArea.append("\n" + hora + " " + accion);
	}
	
}