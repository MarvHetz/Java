package uis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import tankstelle.Controller;

public class Zapfsaeule
{

	private JButton btnTanken;
	private Controller controller;
	private JFrame frame;
	private JLabel lblName;
	private JLabel lblPreis;
	private JList listSpritte;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public Zapfsaeule(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	private JButton getBtnTanken()
	{
		if (btnTanken == null)
		{
			btnTanken = new JButton("Tanken");
			btnTanken.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
				}
			});
			btnTanken.setBounds(324, 152, 135, 101);
		}
		return btnTanken;
	}

	private JLabel getLblName()
	{
		if (lblName == null)
		{
			lblName = new JLabel("Name:");
			lblName.setBounds(142, 28, 46, 14);
		}
		return lblName;
	}

	private JLabel getLblPreis()
	{
		if (lblPreis == null)
		{
			lblPreis = new JLabel("Preis:");
			lblPreis.setBounds(142, 63, 46, 14);
		}
		return lblPreis;
	}

	private JList getListSpritte()
	{
		if (listSpritte == null)
		{
			listSpritte = new JList();
			listSpritte.setBounds(38, 102, 245, 189);
		}
		return listSpritte;
	}

	private JTextField getTextField()
	{
		if (textField == null)
		{
			textField = new JTextField();
			textField.setBounds(212, 22, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JTextField getTextField_1()
	{
		if (textField_1 == null)
		{
			textField_1 = new JTextField();
			textField_1.setBounds(212, 57, 86, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 504, 341);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getListSpritte());
		frame.getContentPane().add(getBtnTanken());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getTextField_1());
		frame.getContentPane().add(getLblName());
		frame.getContentPane().add(getLblPreis());
		frame.setVisible(true);
	}
}
