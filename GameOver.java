package mineShift;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameOver extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void EndScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOver frame = new GameOver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameOver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setBounds(86, 181, 125, 23);
		contentPane.add(btnPlayAgain);
		
		JLabel lblGameOver = new JLabel("Game Over!");
		lblGameOver.setForeground(Color.CYAN);
		lblGameOver.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 30));
		lblGameOver.setBounds(76, 92, 330, 78);
		contentPane.add(lblGameOver);
		
		JButton btnExit = new JButton("Quit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(251, 181, 125, 23);
		contentPane.add(btnExit);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("X:\\My Drive\\ComputerScience\\JavaProgrammingSchool\\MineShift\\res\\space.jpg"));
		lblBackground.setHorizontalTextPosition(SwingConstants.LEFT);
		lblBackground.setBounds(0, 0, 434, 261);
		contentPane.add(lblBackground);
		
		
	}
}
