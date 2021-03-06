import java.awt.AWTException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Tela {

	private JFrame frame;
	private JTextField txtDfdf;
	private int mouseX;
	private int mouseY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela.class.getResource("/imagens/icons8_scene_builder_50px_1.png")));
		frame.setBounds(100, 100, 1002, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1002, 624);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getX() + e.getX() - mouseX, frame.getY() + e.getY() - mouseY);
			}
        });
		
		panel_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				
				mouseX = e.getX();
				mouseY = e.getY();
				
			}

			
		});
		
		panel_1.setBackground(new Color(0, 153, 255));
		panel_1.setBounds(0, 0, 1002, 205);
		panel.add(panel_1);
		
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Controle Escolar");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(82, 11, 174, 55);
		panel_1.add(lblNewLabel);
		
		JLabel lblX = new JLabel("  X  ");
		lblX.setBackground(new Color(124, 252, 0));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblX.setBounds(929, 0, 57, 47);
		panel_1.add(lblX);
		
		txtDfdf = new JTextField("Search here");
		txtDfdf.setToolTipText("Pesquise por alunos");
		txtDfdf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDfdf.setBackground(new Color(0, 153, 255));
		txtDfdf.setForeground(Color.WHITE);
		txtDfdf.setBorder(null);
		txtDfdf.setBounds(281, 118, 417, 39);
		panel_1.add(txtDfdf);
		txtDfdf.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(281, 162, 389, 9);
		panel_1.add(separator);
		separator.setForeground(Color.WHITE);
		
		JLabel lblImg1_1 = new JLabel("");
		lblImg1_1.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_search_50px_3.png")));
		lblImg1_1.setBounds(225, 115, 52, 56);
		panel_1.add(lblImg1_1);
		
		JLabel lblImg1_2 = new JLabel("");
		lblImg1_2.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_scene_builder_50px_1.png")));
		lblImg1_2.setBounds(23, 11, 52, 56);
		panel_1.add(lblImg1_2);
		
		JLabel lblX_1 = new JLabel("  -  ");
		lblX_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				try {
					Robot robo = new Robot();
					robo.keyPress(KeyEvent.VK_WINDOWS);
					robo.keyPress(KeyEvent.VK_DOWN);
					
					robo.keyRelease(KeyEvent.VK_DOWN);
					robo.keyRelease(KeyEvent.VK_WINDOWS);
					
					
				} catch (AWTException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		lblX_1.setForeground(Color.WHITE);
		lblX_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblX_1.setBackground(new Color(124, 252, 0));
		lblX_1.setBounds(869, 0, 57, 47);
		panel_1.add(lblX_1);
		
		
		JPanel panel_Home = new JPanel();
		panel_Home.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel_Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
				panel_Home.setBackground(new Color(169,169,169));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				panel_Home.setBackground(SystemColor.controlHighlight);
				panel_Home.setBounds(220, 232, 162, 136);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				panel_Home.setBounds(223, 235, 154, 128);
					
			}
			
		});
		
		panel_Home.setBackground(SystemColor.controlHighlight);
		panel_Home.setBounds(220, 232, 162, 136);
		panel.add(panel_Home);
		panel_Home.setLayout(null);
		
		JLabel lblImg1 = new JLabel("");
		lblImg1.setBounds(55, 27, 52, 56);
		lblImg1.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_add_50px_2.png")));
		panel_Home.add(lblImg1);
		
		JLabel lblHome = new JLabel("Matr\u00EDcula");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHome.setForeground(new Color(0, 102, 255));
		lblHome.setBounds(40, 84, 82, 26);
		panel_Home.add(lblHome);
		
		//------------------------------------------------------------------------------------
		
		JPanel panel_Estudantes = new JPanel();
		panel_Estudantes.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel_Estudantes.setCursor(new Cursor(Cursor.HAND_CURSOR));
				panel_Estudantes.setBackground(new Color(169,169,169));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				panel_Estudantes.setBackground(SystemColor.controlHighlight);
				panel_Estudantes.setBounds(416, 232, 162, 136);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				panel_Estudantes.setBounds(419, 235, 154, 128);
					
			}
			
		});
		panel_Estudantes.setBackground(SystemColor.controlHighlight);
		panel_Estudantes.setLayout(null);
		panel_Estudantes.setBounds(416, 232, 162, 136);
		panel.add(panel_Estudantes);
		
		JLabel lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_users_50px.png")));
		lblImg2.setBounds(55, 27, 52, 56);
		panel_Estudantes.add(lblImg2);
		
		JLabel lblEstudantes = new JLabel("Alunos");
		lblEstudantes.setForeground(new Color(0, 102, 255));
		lblEstudantes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstudantes.setBounds(53, 84, 63, 28);
		panel_Estudantes.add(lblEstudantes);
		
		//---------------------------------------------------------------------------------------
		
		JPanel panel_Calendario = new JPanel();
		panel_Calendario.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel_Calendario.setCursor(new Cursor(Cursor.HAND_CURSOR));
				panel_Calendario.setBackground(new Color(169,169,169));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				panel_Calendario.setBackground(SystemColor.controlHighlight);
				panel_Calendario.setBounds(614, 232, 162, 136);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				panel_Calendario.setBounds(617, 235, 154, 128);
					
			}
			
		});
		panel_Calendario.setBackground(SystemColor.controlHighlight);
		panel_Calendario.setLayout(null);
		panel_Calendario.setBounds(614, 232, 162, 136);
		panel.add(panel_Calendario);
		
		JLabel lblImg2_1 = new JLabel("");
		lblImg2_1.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_calendar_50px_2.png")));
		lblImg2_1.setBounds(55, 29, 52, 56);
		panel_Calendario.add(lblImg2_1);
		
		JLabel lblCalendario = new JLabel("Calend\u00E1rio");
		lblCalendario.setForeground(new Color(0, 102, 255));
		lblCalendario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCalendario.setBounds(34, 86, 97, 28);
		panel_Calendario.add(lblCalendario);
		
		//---------------------------------------------------------------------------------------
		
		JPanel panel_Downloads = new JPanel();
		panel_Downloads.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel_Downloads.setCursor(new Cursor(Cursor.HAND_CURSOR));
				panel_Downloads.setBackground(new Color(169,169,169));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				panel_Downloads.setBackground(SystemColor.controlHighlight);
				panel_Downloads.setBounds(614, 402, 162, 136);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				panel_Downloads.setBounds(617, 405, 154, 128);
					
			}
			
		});
		panel_Downloads.setBackground(SystemColor.controlHighlight);
		panel_Downloads.setLayout(null);
		panel_Downloads.setBounds(614, 402, 162, 136);
		panel.add(panel_Downloads);
		
		JLabel lblImg2_1_1_1 = new JLabel("");
		lblImg2_1_1_1.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_download_50px.png")));
		lblImg2_1_1_1.setBounds(55, 27, 52, 56);
		panel_Downloads.add(lblImg2_1_1_1);
		
		JLabel lblEstudantes_1_1_1 = new JLabel("Downloads");
		lblEstudantes_1_1_1.setForeground(new Color(0, 102, 255));
		lblEstudantes_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstudantes_1_1_1.setBounds(37, 82, 97, 28);
		panel_Downloads.add(lblEstudantes_1_1_1);
		
		//---------------------------------------------------------------------------------------
		
		JPanel panel_Configura = new JPanel();
		panel_Configura.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel_Configura.setCursor(new Cursor(Cursor.HAND_CURSOR));
				panel_Configura.setBackground(new Color(169,169,169));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				panel_Configura.setBackground(SystemColor.controlHighlight);
				panel_Configura.setBounds(220, 402, 162, 136);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				panel_Configura.setBounds(223, 405, 154, 128);
					
			}
			
		});
		panel_Configura.setBackground(SystemColor.controlHighlight);
		panel_Configura.setLayout(null);
		panel_Configura.setBounds(220, 402, 162, 136);
		panel.add(panel_Configura);
		
		JLabel lblImg2_1_1 = new JLabel("");
		lblImg2_1_1.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_settings_50px_2.png")));
		lblImg2_1_1.setBounds(55, 27, 52, 56);
		panel_Configura.add(lblImg2_1_1);
		
		JLabel lblEstudantes_1_1 = new JLabel("Configura\u00E7\u00F5es");
		lblEstudantes_1_1.setForeground(new Color(0, 102, 255));
		lblEstudantes_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstudantes_1_1.setBounds(22, 82, 132, 28);
		panel_Configura.add(lblEstudantes_1_1);
		
		
		//---------------------------------------------------------------------------------------
		
		JPanel panel_Classes = new JPanel();
		panel_Classes.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel_Classes.setCursor(new Cursor(Cursor.HAND_CURSOR));
				panel_Classes.setBackground(new Color(169,169,169));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				panel_Classes.setBackground(SystemColor.controlHighlight);
				panel_Classes.setBounds(416, 402, 162, 136);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				panel_Classes.setBounds(419, 405, 154, 128);
					
			}
			
		});
		panel_Classes.setLayout(null);
		panel_Classes.setBackground(SystemColor.controlHighlight);
		panel_Classes.setBounds(416, 402, 162, 136);
		panel.add(panel_Classes);
		
		JLabel lblImg2_1_1_2 = new JLabel("");
		lblImg2_1_1_2.setIcon(new ImageIcon(Tela.class.getResource("/imagens/icons8_list_50px_1.png")));
		lblImg2_1_1_2.setBounds(55, 27, 52, 56);
		panel_Classes.add(lblImg2_1_1_2);
		
		JLabel lblEstudantes_1_1_2 = new JLabel("Classes");
		lblEstudantes_1_1_2.setForeground(new Color(0, 102, 255));
		lblEstudantes_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstudantes_1_1_2.setBounds(50, 84, 65, 28);
		panel_Classes.add(lblEstudantes_1_1_2);
	}
}

