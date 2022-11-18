import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Controller
{
	GUI gui;
	DefaultListModel<Ware> warenDefaultListModel;
	DefaultListModel<Ware> warenKorbDefaultListModel;
	DateiHandler dh;

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
		for(int i = 0; i < dateiStrings.size(); i++)
		{
			zuVerarbeiten = dateiStrings.get(i);
			warenDefaultListModel.addElement(new Ware((String) zuVerarbeiten.split(";")[1],Integer.valueOf((String) zuVerarbeiten.split(";")[0]),Integer.valueOf(zuVerarbeiten.split(";")[2])));
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
