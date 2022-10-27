package pizzalieferservice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.WindowConstants;

import pizzalieferservice.klassen.Warenkorb;

public class PizzaGUI
{

	/**
	 * Create the application.
	 */
	public PizzaGUI(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	// uierhowieu
	private JButton btnAdd;
	private JButton btnOrder;
	private JButton btnRemove;
	private JComboBox comboBoxExtras;
	private JComboBox comboBoxGroesse;
	private JComboBox comboBoxPizza;
	private Controller controller;
	private JFrame frame;
	private JLabel lblExtras;
	private JLabel lblFehler;
	private JLabel lblGroesse;
	private JLabel lblPizza;
	private JLabel lblPreis;
	private JLabel lblPreisAnzeigen;
	private JLabel lblPreisGesamt;
	private JLabel lblPreisGesamtAnzeigen;

	private JList list;

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

	protected JButton getBtnOrder()
	{
		if (btnOrder == null)
		{
			btnOrder = new JButton("Bestellen");
			btnOrder.setBounds(335, 172, 89, 51);
		}
		return btnOrder;
	}

	protected JButton getBtnRemove()
	{
		if (btnRemove == null)
		{
			btnRemove = new JButton("Entfernen");
			btnRemove.setBounds(335, 128, 89, 23);
		}
		return btnRemove;
	}

	protected JComboBox getComboBoxExtras()
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

	protected JComboBox getComboBoxGroesse()
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

	protected JComboBox getComboBoxPizza()
	{
		if (comboBoxPizza == null)
		{
			comboBoxPizza = new JComboBox();
			comboBoxPizza.setBounds(66, 7, 143, 22);
		}
		return comboBoxPizza;
	}

	protected JLabel getLblExtras()
	{
		if (lblExtras == null)
		{
			lblExtras = new JLabel("Extras:");
			lblExtras.setBounds(10, 44, 46, 14);
		}
		return lblExtras;
	}

	protected JLabel getLblFehler()
	{
		if (lblFehler == null)
		{
			lblFehler = new JLabel("Hier werden Fehler angezeigt");
			lblFehler.setBounds(10, 69, 315, 14);
		}
		return lblFehler;
	}

	protected JLabel getLblGroesse()
	{
		if (lblGroesse == null)
		{
			lblGroesse = new JLabel("Größe:");
			lblGroesse.setBounds(259, 11, 46, 14);
		}
		return lblGroesse;
	}

	protected JLabel getLblPizza()
	{
		if (lblPizza == null)
		{
			lblPizza = new JLabel("Pizza:");
			lblPizza.setBounds(10, 11, 46, 14);
		}
		return lblPizza;
	}

	protected JLabel getLblPreis()
	{
		if (lblPreis == null)
		{
			lblPreis = new JLabel("Preis:");
			lblPreis.setBounds(259, 44, 46, 14);
		}
		return lblPreis;
	}

	protected JLabel getLblPreisAnzeigen()
	{
		if (lblPreisAnzeigen == null)
		{
			lblPreisAnzeigen = new JLabel(" 0.0 €");
			lblPreisAnzeigen.setBounds(332, 44, 46, 14);
		}
		return lblPreisAnzeigen;
	}

	protected JLabel getLblPreisGesamt()
	{
		if (lblPreisGesamt == null)
		{
			lblPreisGesamt = new JLabel("Gesamtpreis:");
			lblPreisGesamt.setBounds(10, 225, 134, 14);
		}
		return lblPreisGesamt;
	}

	protected JLabel getLblPreisGesamtAnzeigen()
	{
		if (lblPreisGesamtAnzeigen == null)
		{
			lblPreisGesamtAnzeigen = new JLabel("0.0 €");
			lblPreisGesamtAnzeigen.setBounds(259, 225, 46, 14);
		}
		return lblPreisGesamtAnzeigen;
	}

	protected JList getList()
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
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblPizza());
		frame.getContentPane().add(getLblGroesse());
		frame.getContentPane().add(getLblExtras());
		frame.getContentPane().add(getLblPreisAnzeigen());
		frame.getContentPane().add(getLblPreis());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnRemove());
		frame.getContentPane().add(getBtnOrder());
		frame.getContentPane().add(getLblPreisGesamtAnzeigen());
		frame.getContentPane().add(getLblPreisGesamt());
		frame.getContentPane().add(getComboBoxPizza());
		frame.getContentPane().add(getComboBoxExtras());
		frame.getContentPane().add(getComboBoxGroesse());
		frame.getContentPane().add(getList());
		frame.getContentPane().add(getLblFehler());
		frame.setVisible(true);
	}

	public void setzeModels(DefaultListModel<Warenkorb> warenkorbDefaultListModel)
	{
		getList().setModel(warenkorbDefaultListModel);
	}
}
