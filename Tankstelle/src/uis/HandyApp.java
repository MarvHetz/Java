package uis;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import tankstelle.Controller;
import tankstelle.Sprit;

public class HandyApp
{

	private Controller controller;
	private JFrame frame;
	private JList list;

	/**
	 * Create the application.
	 */
	public HandyApp(Controller controller)
	{
		controller = new Controller();
		initialize();
	}

	private JList getList()
	{
		if (list == null)
		{
			list = new JList();
			list.setBounds(84, 41, 302, 193);
		}
		return list;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getList());
		frame.setBounds(100, 100, 495, 334);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

	public void setzeModel(DefaultListModel<Sprit> spritpreis)
	{
		getList().setModel(spritpreis);
	}
}
