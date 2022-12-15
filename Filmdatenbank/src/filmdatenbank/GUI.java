package filmdatenbank;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI
{

	private JButton btnAbsteigend;

	private JButton btnAufsteigend;
	private JButton btnSuche;
	private JButton btnZuruck;
	private JComboBox comboBoxFilters;
	private JFrame frame;
	private JList listFilm;
	private JPanel panelBild;
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
			btnAbsteigend.setBounds(255, 47, 130, 23);
		}
		return btnAbsteigend;
	}

	public JButton getBtnAufsteigend()
	{
		if (btnAufsteigend == null)
		{
			btnAufsteigend = new JButton("Aufsteigend");
			btnAufsteigend.setBounds(258, 7, 130, 23);
		}
		return btnAufsteigend;
	}

	public JButton getBtnSuche()
	{
		if (btnSuche == null)
		{
			btnSuche = new JButton("Suchen");
			btnSuche.setBounds(258, 196, 127, 23);
		}
		return btnSuche;
	}

	public JButton getBtnZuruck()
	{
		if (btnZuruck == null)
		{
			btnZuruck = new JButton("Zurück");
			btnZuruck.setBounds(258, 230, 127, 23);
		}
		return btnZuruck;
	}

	public JComboBox getComboBoxFilters()
	{
		if (comboBoxFilters == null)
		{
			comboBoxFilters = new JComboBox();
			comboBoxFilters.setBounds(258, 81, 127, 22);
		}
		return comboBoxFilters;
	}

	public JList getListFilm()
	{
		if (listFilm == null)
		{
			listFilm = new JList();
			listFilm.setBounds(10, 10, 238, 310);
		}
		return listFilm;
	}

	public JPanel getPanelBild()
	{
		if (panelBild == null)
		{
			panelBild = new JPanel();
			panelBild.setBounds(425, 10, 338, 310);
			panelBild.setLayout(new BorderLayout(0, 0));
		}
		return panelBild;
	}

	public JTextField getTextFieldSuchen()
	{
		if (textFieldSuchen == null)
		{
			textFieldSuchen = new JTextField();
			textFieldSuchen.setBounds(258, 114, 127, 20);
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
		frame.setBounds(100, 100, 793, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTextFieldSuchen());
		frame.getContentPane().add(getListFilm());
		frame.getContentPane().add(getBtnAufsteigend());
		frame.getContentPane().add(getBtnAbsteigend());
		frame.getContentPane().add(getComboBoxFilters());
		frame.getContentPane().add(getBtnSuche());
		frame.getContentPane().add(getBtnZuruck());
		frame.getContentPane().add(getPanelBild());

		frame.setVisible(true);
	}
}
