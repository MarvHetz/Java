package uis;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import tankstelle.Controller;
import tankstelle.Sprit;

public class AdminGUI extends GUI
{

	private JButton btnAendern;
	private JButton btnHinzufuegen;
	private JButton btnLoeschen;
	private Controller controller;
	private JFrame frame;
	private JLabel lblName;
	private JLabel lblPreis;
	private JList listSpritte;
	private JTextField textFieldName;
	private JTextField textFieldPreis;

	/**
	 * Create the application.
	 */
	public AdminGUI(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	public JList getListSpritte()
	{
		if (listSpritte == null)
		{
			listSpritte = new JList();
			listSpritte.setBounds(38, 102, 245, 189);
		}
		return listSpritte;
	}

	@Override
	public double getPreis()
	{
		return Double.valueOf(getTextFieldPreis().getText());
	}

	@Override
	public Sprit getSprit()
	{
		return (Sprit) getListSpritte().getSelectedValue();
	}

	@Override
	public String getSpritName()
	{
		return getTextFieldName().getText();
	}

	public JTextField getTextFieldName()
	{
		if (textFieldName == null)
		{
			textFieldName = new JTextField();
			textFieldName.setBounds(212, 22, 86, 20);
			textFieldName.setColumns(10);
		}
		return textFieldName;
	}

	public JTextField getTextFieldPreis()
	{
		if (textFieldPreis == null)
		{
			textFieldPreis = new JTextField();
			textFieldPreis.setBounds(212, 57, 86, 20);
			textFieldPreis.setColumns(10);
		}
		return textFieldPreis;
	}

	public void setzeActionListener(ActionListener aendernActionListener, ActionListener hinzufuegenActionListener,
			ActionListener loeschenActionListener)
	{
		getBtnAendern().addActionListener(aendernActionListener);
		getBtnHinzufuegen().addActionListener(hinzufuegenActionListener);
		getBtnLoeschen().addActionListener(loeschenActionListener);
	}

	public void setzeModel(DefaultListModel<Sprit> sprittpreise)
	{
		getListSpritte().setModel(sprittpreise);
	}

	private JButton getBtnAendern()
	{
		if (btnAendern == null)
		{
			btnAendern = new JButton("Ändern");
			btnAendern.setBounds(331, 167, 89, 57);
		}
		return btnAendern;
	}

	private JButton getBtnHinzufuegen()
	{
		if (btnHinzufuegen == null)
		{
			btnHinzufuegen = new JButton("Hinzufügen");
			btnHinzufuegen.setBounds(331, 99, 89, 57);
		}
		return btnHinzufuegen;
	}

	private JButton getBtnLoeschen()
	{
		if (btnLoeschen == null)
		{
			btnLoeschen = new JButton("Löschen");
			btnLoeschen.setBounds(331, 234, 89, 57);
		}
		return btnLoeschen;
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
		frame.getContentPane().add(getBtnHinzufuegen());
		frame.getContentPane().add(getBtnAendern());
		frame.getContentPane().add(getBtnLoeschen());
		frame.getContentPane().add(getTextFieldName());
		frame.getContentPane().add(getTextFieldPreis());
		frame.getContentPane().add(getLblName());
		frame.getContentPane().add(getLblPreis());
		frame.setVisible(true);
	}
}
