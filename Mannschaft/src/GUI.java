import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame
{

    private final JPanel contentPane;
    private JButton btnUebertragen;
    private JComboBox comboBoxMannschaftenLinks;
    private JComboBox comboBoxMannschaftenRechts;
    private JLabel lblHinzufuegen;
    private JLabel lblMannschaften;
    private JLabel lblSpieler;
    private JList listMannschaftenLinks;
    private JList listMannschaftenRechts;
    private JList listSpieler;

    public GUI()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 548, 421);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getListMannschaftenRechts());
        contentPane.add(getListSpieler());
        contentPane.add(getListMannschaftenLinks());
        contentPane.add(getLblMannschaften());
        contentPane.add(getLblHinzufuegen());
        contentPane.add(getLblSpieler());
        contentPane.add(getComboBoxMannschaftenLinks());
        contentPane.add(getComboBoxMannschaftenRechts());
        contentPane.add(getBtnUebertragen());
        this.setVisible(true);
    }

    private JButton getBtnUebertragen()
    {
        if (btnUebertragen == null)
        {
            btnUebertragen = new JButton("Uebertragen");
            btnUebertragen.setBounds(10, 348, 503, 23);
        }
        return btnUebertragen;
    }

    protected JComboBox getComboBoxMannschaftenLinks()
    {
        if (comboBoxMannschaftenLinks == null)
        {
            comboBoxMannschaftenLinks = new JComboBox();
            comboBoxMannschaftenLinks.setBounds(10, 11, 161, 22);
        }
        return comboBoxMannschaftenLinks;
    }

    protected JComboBox getComboBoxMannschaftenRechts()
    {
        if (comboBoxMannschaftenRechts == null)
        {
            comboBoxMannschaftenRechts = new JComboBox();
            comboBoxMannschaftenRechts.setBounds(352, 11, 161, 22);
        }
        return comboBoxMannschaftenRechts;
    }

    private JLabel getLblHinzufuegen()
    {
        if (lblHinzufuegen == null)
        {
            lblHinzufuegen = new JLabel("Hinzufuegen zu");
            lblHinzufuegen.setBounds(398, 71, 75, 14);
        }
        return lblHinzufuegen;
    }

    private JLabel getLblMannschaften()
    {
        if (lblMannschaften == null)
        {
            lblMannschaften = new JLabel("Mannschaften");
            lblMannschaften.setBounds(51, 71, 75, 14);
        }
        return lblMannschaften;
    }

    private JLabel getLblSpieler()
    {
        if (lblSpieler == null)
        {
            lblSpieler = new JLabel("Spieler");
            lblSpieler.setBounds(240, 71, 46, 14);
        }
        return lblSpieler;
    }

    private JList getListMannschaftenLinks()
    {
        if (listMannschaftenLinks == null)
        {
            listMannschaftenLinks = new JList();
            listMannschaftenLinks.setBounds(352, 96, 161, 242);
        }
        return listMannschaftenLinks;
    }

    private JList getListMannschaftenRechts()
    {
        if (listMannschaftenRechts == null)
        {
            listMannschaftenRechts = new JList();
            listMannschaftenRechts.setBounds(10, 96, 161, 242);
        }
        return listMannschaftenRechts;
    }

    private JList getListSpieler()
    {
        if (listSpieler == null)
        {
            listSpieler = new JList();
            listSpieler.setBounds(181, 96, 161, 242);
        }
        return listSpieler;
    }
}
