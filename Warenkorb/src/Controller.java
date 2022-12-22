import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

//Test
public class Controller
{
	DateiHandler dh;
	GUI gui;
	DefaultListModel<Ware> warenDefaultListModel;
	DefaultListModel<Ware> warenKorbDefaultListModel;

	public Controller(GUI gui)
	{
		this.gui = gui;
		warenDefaultListModel = new DefaultListModel<>();
		warenKorbDefaultListModel = new DefaultListModel<>();
		dh = new DateiHandler(new File("F:\\java\\Java\\Warenkorb\\src\\Artikeldatei.csv"));
		lesenDatei();
		gui.setActionListener(new ActionListenerBtnNachLinks(), new ActionListenerBtnNachRechts());
		gui.setList(warenDefaultListModel, warenKorbDefaultListModel);
	}

	private void lesenDatei()
	{
		ArrayList<String> dateiStrings = dh.lesen();
		String zuVerarbeiten;
		for (int i = 0; i < dateiStrings.size(); i++)
		{
			zuVerarbeiten = dateiStrings.get(i);
			warenDefaultListModel.addElement(new Ware(zuVerarbeiten.split(";")[1],
					Integer.valueOf(zuVerarbeiten.split(";")[0]), zuVerarbeiten.split(";")[2]));
		}

	}

	private ArrayList<String> umwandeln(DefaultListModel<Ware> waren)
	{
		ArrayList<String> stringList = new ArrayList<>();
		for (int i = 0; i < waren.getSize(); i++)
		{
			stringList.add(waren.get(i).toStringForFile());
		}
		return stringList;
	}

	class ActionListenerBestellen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			dh = new DateiHandler(new File(gui.getTextKundenName().getText() + ".csv"));
			dh.schreiben(umwandeln(warenKorbDefaultListModel));
		}
	}

	class ActionListenerBtnNachLinks implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Ware zuVerschiebenWare = (Ware) gui.getListWarenkorb().getSelectedValue();
			warenDefaultListModel.addElement(zuVerschiebenWare);
			warenKorbDefaultListModel.removeElement(zuVerschiebenWare);
		}
	}

	class ActionListenerBtnNachRechts implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Ware zuVerschiebenWare = (Ware) gui.getListWare().getSelectedValue();
			warenDefaultListModel.removeElement(zuVerschiebenWare);
			warenKorbDefaultListModel.addElement(zuVerschiebenWare);
		}
	}
}
