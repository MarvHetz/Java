package pizzalieferservice;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.WindowConstants;

public class PizzaGUI
{

	// uierhowieu
	private JButton btnAdd;
	private JButton btnOrder;
	private JButton btnRemove;
	private JComboBox comboBoxExtras;
	private JComboBox comboBoxGroesse;
	private JComboBox comboBoxPizza;
	private JFrame frame;
	private JLabel lblFehler;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblPreis;
	private JLabel lblPreisGesamt;
	private JList list;

	/**
	 * Create the application.
	 */
	public PizzaGUI()
	{
		initialize();

	}

	private JButton getBtnAdd()
	{
		if (btnAdd == null)
		{
			btnAdd = new JButton("Hinzufügen");

			btnAdd.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{

				}

			});
			btnAdd.setBounds(335, 81, 89, 23);
		}
		return btnAdd;
	}

	private JButton getBtnOrder()
	{
		if (btnOrder == null)
		{
			btnOrder = new JButton("Bestellen");
			btnOrder.setBounds(335, 172, 89, 51);
		}
		return btnOrder;
	}

	private JButton getBtnRemove()
	{
		if (btnRemove == null)
		{
			btnRemove = new JButton("Entfernen");
			btnRemove.setBounds(335, 128, 89, 23);
		}
		return btnRemove;
	}

	private JComboBox getComboBoxExtras()
	{
		if (comboBoxExtras == null)
		{
			comboBoxExtras = new JComboBox();
			comboBoxExtras.addItemListener(new ItemListener()
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{

				}
			});
			comboBoxExtras.setBounds(66, 40, 143, 22);
		}
		return comboBoxExtras;
	}

	private JComboBox getComboBoxGroesse()
	{
		if (comboBoxGroesse == null)
		{
			comboBoxGroesse = new JComboBox();
			comboBoxGroesse.addItemListener(new ItemListener()
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{

				}
			});
			comboBoxGroesse.setBounds(322, 7, 102, 22);
		}
		return comboBoxGroesse;
	}

	private JComboBox getComboBoxPizza()
	{
		if (comboBoxPizza == null)
		{
			comboBoxPizza = new JComboBox();
			comboBoxPizza.setBounds(66, 7, 143, 22);
		}
		return comboBoxPizza;
	}

	private JLabel getLblFehler()
	{
		if (lblFehler == null)
		{
			lblFehler = new JLabel("New label");
			lblFehler.setBounds(10, 69, 315, 14);
		}
		return lblFehler;
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
		{
			lblNewLabel = new JLabel("Pizza:");
			lblNewLabel.setBounds(10, 11, 46, 14);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1()
	{
		if (lblNewLabel_1 == null)
		{
			lblNewLabel_1 = new JLabel("Extras:");
			lblNewLabel_1.setBounds(10, 44, 46, 14);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2()
	{
		if (lblNewLabel_2 == null)
		{
			lblNewLabel_2 = new JLabel("Größe:");
			lblNewLabel_2.setBounds(259, 11, 46, 14);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3()
	{
		if (lblNewLabel_3 == null)
		{
			lblNewLabel_3 = new JLabel("Preis:");
			lblNewLabel_3.setBounds(259, 44, 46, 14);
		}
		return lblNewLabel_3;
	}

	private JLabel getLblNewLabel_5()
	{
		if (lblNewLabel_5 == null)
		{
			lblNewLabel_5 = new JLabel("Gesamtpreis:");
			lblNewLabel_5.setBounds(10, 225, 134, 14);
		}
		return lblNewLabel_5;
	}

	private JLabel getLblPreis()
	{
		if (lblPreis == null)
		{
			lblPreis = new JLabel(" 0.0 €");
			lblPreis.setBounds(332, 44, 46, 14);
		}
		return lblPreis;
	}

	private JLabel getLblPreisGesamt()
	{
		if (lblPreisGesamt == null)
		{
			lblPreisGesamt = new JLabel("New label");
			lblPreisGesamt.setBounds(259, 225, 46, 14);
		}
		return lblPreisGesamt;
	}

	private JList getList()
	{
		if (list == null)
		{
			list = new JList();
			list.setBounds(10, 84, 315, 125);

		}
		return list;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblPreis());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnRemove());
		frame.getContentPane().add(getBtnOrder());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getLblPreisGesamt());
		frame.getContentPane().add(getComboBoxPizza());
		frame.getContentPane().add(getComboBoxExtras());
		frame.getContentPane().add(getComboBoxGroesse());
		frame.getContentPane().add(getList());
		frame.getContentPane().add(getLblFehler());
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
					PizzaGUI window = new PizzaGUI();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
