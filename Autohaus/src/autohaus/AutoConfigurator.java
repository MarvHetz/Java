package autohaus;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class AutoConfigurator
{

	private JButton btnBestatigen;

	private JButton btnBestellen;
	private JComboBox comboBoxExtra;
	private JComboBox comboBoxFarbe;
	private JComboBox comboBoxModell;
	private JComboBox comboBoxPs;
	private JFrame frame;
	private JLabel lblAngabeBrutto;
	private JLabel lblAngabeMWSt;
	private JLabel lblAnzeigeAuswahl;
	private JLabel lblAnzeigeNetto;
	private JLabel lblBrutto;
	private JLabel lblExtras;
	private JLabel lblFarbe;
	private JLabel lblModell;
	private JLabel lblMWSt;
	private JLabel lblNetto;
	private JLabel lblPS;
	private JList listAuswahl;
	private JPanel panelBild;

	/**
	 * Create the application.
	 */
	public AutoConfigurator()
	{
		initialize();
	}

	public void setzeComboBoxModels(DefaultComboBoxModel<Auto> autos)
	{
		comboBoxModell.setModel(autos);
		comboBoxFarbe.setModel(autos.getElementAt(0).getFarben());
		comboBoxPs.setModel(autos.getElementAt(0).getPs());
	}

	private void BildLaden()
	{
		try
		{
			BufferedImage pic = ImageIO.read(new File("Autohaus.png"));
			JLabel picLabel = new JLabel(new ImageIcon(pic));
			getPanelBild().add(picLabel);
		}
		catch (Exception e)
		{
			System.out.println("Fehler: " + e.getMessage());
		}
	}

	private JButton getBtnBestatigen()
	{
		if (btnBestatigen == null)
		{
			btnBestatigen = new JButton("Auswahl bestätigen");
			btnBestatigen.setBounds(10, 227, 173, 23);
		}
		return btnBestatigen;
	}

	private JButton getBtnBestellen()
	{
		if (btnBestellen == null)
		{
			btnBestellen = new JButton("Auto bestellen");
			btnBestellen.setBounds(209, 227, 200, 23);
		}
		return btnBestellen;
	}

	private JComboBox getComboBoxExtra()
	{
		if (comboBoxExtra == null)
		{
			comboBoxExtra = new JComboBox();
			comboBoxExtra.setBounds(76, 202, 107, 22);
		}
		return comboBoxExtra;
	}

	private JComboBox getComboBoxFarbe()
	{
		if (comboBoxFarbe == null)
		{
			comboBoxFarbe = new JComboBox();
			comboBoxFarbe.setBounds(76, 144, 107, 22);
		}
		return comboBoxFarbe;
	}

	private JComboBox getComboBoxModell()
	{
		if (comboBoxModell == null)
		{
			comboBoxModell = new JComboBox();
			comboBoxModell.setBounds(76, 115, 107, 22);
		}
		return comboBoxModell;
	}

	private JComboBox getComboBoxPs()
	{
		if (comboBoxPs == null)
		{
			comboBoxPs = new JComboBox();
			comboBoxPs.setBounds(76, 173, 107, 22);
		}
		return comboBoxPs;
	}

	private JLabel getLblAngabeBrutto()
	{
		if (lblAngabeBrutto == null)
		{
			lblAngabeBrutto = new JLabel("Bruttopreis");
			lblAngabeBrutto.setBounds(209, 202, 106, 14);
		}
		return lblAngabeBrutto;
	}

	private JLabel getLblAngabeMWSt()
	{
		if (lblAngabeMWSt == null)
		{
			lblAngabeMWSt = new JLabel("19 % MWSt");
			lblAngabeMWSt.setBounds(209, 173, 106, 14);
		}
		return lblAngabeMWSt;
	}

	private JLabel getLblAnzeigeAuswahl()
	{
		if (lblAnzeigeAuswahl == null)
		{
			lblAnzeigeAuswahl = new JLabel("Ihre Auswahl:");
			lblAnzeigeAuswahl.setBounds(209, 11, 200, 14);
		}
		return lblAnzeigeAuswahl;
	}

	private JLabel getLblAnzeigeNetto()
	{
		if (lblAnzeigeNetto == null)
		{
			lblAnzeigeNetto = new JLabel("Gesamtpreis netto:");
			lblAnzeigeNetto.setBounds(209, 144, 106, 14);
		}
		return lblAnzeigeNetto;
	}

	private JLabel getLblBrutto()
	{
		if (lblBrutto == null)
		{
			lblBrutto = new JLabel("");
			lblBrutto.setBounds(346, 202, 63, 14);
		}
		return lblBrutto;
	}

	private JLabel getLblExtras()
	{
		if (lblExtras == null)
		{
			lblExtras = new JLabel("Extras:");
			lblExtras.setBounds(10, 202, 46, 14);
		}
		return lblExtras;
	}

	private JLabel getLblFarbe()
	{
		if (lblFarbe == null)
		{
			lblFarbe = new JLabel("Farbe:");
			lblFarbe.setBounds(10, 144, 46, 14);
		}
		return lblFarbe;
	}

	private JLabel getLblModell()
	{
		if (lblModell == null)
		{
			lblModell = new JLabel("Modell:");
			lblModell.setBounds(10, 115, 46, 14);
		}
		return lblModell;
	}

	private JLabel getLblMWSt()
	{
		if (lblMWSt == null)
		{
			lblMWSt = new JLabel("");
			lblMWSt.setBounds(346, 173, 63, 14);
		}
		return lblMWSt;
	}

	private JLabel getLblNetto()
	{
		if (lblNetto == null)
		{
			lblNetto = new JLabel("");
			lblNetto.setBounds(346, 144, 63, 14);
		}
		return lblNetto;
	}

	private JLabel getLblPS()
	{
		if (lblPS == null)
		{
			lblPS = new JLabel("PS:");
			lblPS.setBounds(10, 173, 46, 14);
		}
		return lblPS;
	}

	private JList getListAuswahl()
	{
		if (listAuswahl == null)
		{
			listAuswahl = new JList();
			listAuswahl.setBounds(209, 30, 200, 99);
		}
		return listAuswahl;
	}

	private JPanel getPanelBild()
	{
		if (panelBild == null)
		{
			panelBild = new JPanel();
			panelBild.setBounds(10, 11, 173, 86);
			BildLaden();
		}
		return panelBild;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblModell());
		frame.getContentPane().add(getLblFarbe());
		frame.getContentPane().add(getLblPS());
		frame.getContentPane().add(getLblExtras());
		frame.getContentPane().add(getBtnBestatigen());
		frame.getContentPane().add(getComboBoxModell());
		frame.getContentPane().add(getComboBoxFarbe());
		frame.getContentPane().add(getComboBoxPs());
		frame.getContentPane().add(getComboBoxExtra());
		frame.getContentPane().add(getListAuswahl());
		frame.getContentPane().add(getLblAnzeigeAuswahl());
		frame.getContentPane().add(getLblAnzeigeNetto());
		frame.getContentPane().add(getLblAngabeMWSt());
		frame.getContentPane().add(getLblAngabeBrutto());
		frame.getContentPane().add(getLblNetto());
		frame.getContentPane().add(getLblMWSt());
		frame.getContentPane().add(getLblBrutto());
		frame.getContentPane().add(getBtnBestellen());
		frame.getContentPane().add(getPanelBild());
		frame.setVisible(true);
	}
}