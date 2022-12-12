package filmdatenbank;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class GUI
{

	private JButton btnAbsteigend;

	private JButton btnAufsteigend;
	private JButton btnSuche;
	private JButton btnZuruck;
	private JComboBox comboBoxGenre;
	private JFrame frame;
	private JList listFilm;
	private JTextField textFieldSuchen;
	Controller controller;

	/**
	 * Create the application.
	 * 
	 * @param controller
	 */
	public GUI()
	{
		initialize();
	}

	public JButton getBtnAbsteigend()
	{
		if (btnAbsteigend == null)
		{
			btnAbsteigend = new JButton("Absteigend");
			btnAbsteigend.setBounds(217, 44, 130, 23);
		}
		return btnAbsteigend;
	}

	public JButton getBtnAufsteigend()
	{
		if (btnAufsteigend == null)
		{
			btnAufsteigend = new JButton("Aufsteigend");
			btnAufsteigend.setBounds(217, 10, 130, 23);
		}
		return btnAufsteigend;
	}

	public JButton getBtnSuche()
	{
		if (btnSuche == null)
		{
			btnSuche = new JButton("Suchen");
			btnSuche.setBounds(220, 193, 127, 23);
		}
		return btnSuche;
	}

	public JButton getBtnZuruck()
	{
		if (btnZuruck == null)
		{
			btnZuruck = new JButton("Zurück");
			btnZuruck.setBounds(220, 227, 127, 23);
		}
		return btnZuruck;
	}

	public JComboBox getComboBoxGenre()
	{
		if (comboBoxGenre == null)
		{
			comboBoxGenre = new JComboBox();
			comboBoxGenre.setBounds(220, 78, 127, 22);
		}
		return comboBoxGenre;
	}

	public JList getListFilm()
	{
		if (listFilm == null)
		{
			listFilm = new JList();
			listFilm.setBounds(10, 10, 200, 310);
		}
		return listFilm;
	}

	public JTextField getTextFieldSuchen()
	{
		if (textFieldSuchen == null)
		{
			textFieldSuchen = new JTextField();
			textFieldSuchen.setBounds(220, 111, 127, 20);
			textFieldSuchen.setColumns(10);
		}
		return textFieldSuchen;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTextFieldSuchen());
		frame.getContentPane().add(getListFilm());
		frame.getContentPane().add(getBtnAufsteigend());
		frame.getContentPane().add(getBtnAbsteigend());
		frame.getContentPane().add(getComboBoxGenre());
		frame.getContentPane().add(getBtnSuche());
		frame.getContentPane().add(getBtnZuruck());

		frame.setVisible(true);
	}
}
