import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class GUI
{

	private JButton buttonBestellen;
	private JButton buttonNachLinks;
	private JButton buttonNachRechts;
	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblWare;
	private JLabel lblWarenkorb;
	private JList listWare;
	private JList listWarenkorb;
	private JTextArea textKundenName;

	public GUI()
	{
		initialize();
	}

	private JButton getButtonBestellen()
	{
		if (buttonBestellen == null)
		{
			buttonBestellen = new JButton("Bestellen");
			buttonBestellen.setBounds(503, 431, 152, 42);
		}
		return buttonBestellen;
	}

	private JButton getButtonNachLinks()
	{
		if (buttonNachLinks == null)
		{
			buttonNachLinks = new JButton("<");
			buttonNachLinks.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonNachLinks.setBounds(347, 160, 67, 37);
		}
		return buttonNachLinks;
	}

	private JButton getButtonNachRechts()
	{
		if (buttonNachRechts == null)
		{
			buttonNachRechts = new JButton(">");
			buttonNachRechts.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonNachRechts.setBounds(347, 101, 67, 44);
		}
		return buttonNachRechts;
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
		{
			lblNewLabel = new JLabel("Kundenname:");
			lblNewLabel.setBounds(27, 441, 86, 29);
		}
		return lblNewLabel;
	}

	private JLabel getLblWare()
	{
		if (lblWare == null)
		{
			lblWare = new JLabel("Ware");
			lblWare.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblWare.setBounds(138, 11, 152, 44);
		}
		return lblWare;
	}

	private JLabel getLblWarenkorb()
	{
		if (lblWarenkorb == null)
		{
			lblWarenkorb = new JLabel("Warenkorb");
			lblWarenkorb.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblWarenkorb.setBounds(491, 11, 152, 44);
		}
		return lblWarenkorb;
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblWarenkorb());
		frame.getContentPane().add(getListWare());
		frame.getContentPane().add(getListWarenkorb());
		frame.getContentPane().add(getButtonNachRechts());
		frame.getContentPane().add(getButtonNachLinks());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTextKundenName());
		frame.getContentPane().add(getButtonBestellen());
		frame.getContentPane().add(getLblWare());

		frame.setVisible(true);
	}

	protected JList getListWare()
	{
		if (listWare == null)
		{
			listWare = new JList();
			listWare.setFont(new Font("Tahoma", Font.PLAIN, 14));
			listWare.setBounds(35, 84, 291, 281);
		}
		return listWare;
	}

	protected JList getListWarenkorb()
	{
		if (listWarenkorb == null)
		{
			listWarenkorb = new JList();
			listWarenkorb.setFont(new Font("Tahoma", Font.PLAIN, 14));
			listWarenkorb.setBounds(430, 83, 291, 282);
		}
		return listWarenkorb;
	}

	protected JTextArea getTextKundenName()
	{
		if (textKundenName == null)
		{
			textKundenName = new JTextArea();
			textKundenName.setBounds(112, 443, 110, 22);
		}
		return textKundenName;
	}

	protected void setActionListener(ActionListener links, ActionListener rechts, ActionListener bestellen)
	{
		getButtonNachLinks().addActionListener(links);
		getButtonNachRechts().addActionListener(rechts);
		getButtonBestellen().addActionListener(bestellen);
	}

	protected void setList(DefaultListModel<Ware> listeWare, DefaultListModel<Ware> listeWarenkorb)
	{
		getListWare().setModel(listeWare);
		getListWarenkorb().setModel(listeWarenkorb);
	}
}