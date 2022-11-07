package uis;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import tankstelle.Controller;

public class TestDriver
{

	private JButton btnAdminGUI;
	private JButton btnAnzeige;
	private JButton btnHandyApp;
	private JButton btnZapfsaeule;
	private Controller controller;
	private JFrame frame;

	/**
	 * Create the application.
	 */
	public TestDriver()
	{
		this.controller = new Controller();
		initialize();
	}

	private JButton getBtnAdminGUI()
	{
		if (btnAdminGUI == null)
		{
			btnAdminGUI = new JButton("AdminGUI");
			btnAdminGUI.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					new AdminGUI(controller);
				}
			});
			btnAdminGUI.setBounds(50, 50, 100, 100);
		}
		return btnAdminGUI;
	}

	private JButton getBtnAnzeige()
	{
		if (btnAnzeige == null)
		{
			btnAnzeige = new JButton("Anzeige");
			btnAnzeige.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					new Anzeige(controller);
				}
			});
			btnAnzeige.setBounds(50, 180, 100, 100);
		}
		return btnAnzeige;
	}

	private JButton getBtnHandyApp()
	{
		if (btnHandyApp == null)
		{
			btnHandyApp = new JButton("HandyApp");
			btnHandyApp.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					new HandyApp(controller);
				}
			});
			btnHandyApp.setBounds(238, 50, 100, 100);
		}
		return btnHandyApp;
	}

	private JButton getBtnZapfsaeule()
	{
		if (btnZapfsaeule == null)
		{
			btnZapfsaeule = new JButton("Zapfsäule");
			btnZapfsaeule.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					new Zapfsaeule(controller);
				}
			});
			btnZapfsaeule.setBounds(238, 180, 100, 100);
		}
		return btnZapfsaeule;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 403, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getBtnAdminGUI());
		frame.getContentPane().add(getBtnAnzeige());
		frame.getContentPane().add(getBtnHandyApp());
		frame.getContentPane().add(getBtnZapfsaeule());
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					TestDriver window = new TestDriver();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
