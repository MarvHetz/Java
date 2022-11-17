import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

public class Controller
{
	GUI gui;
	DefaultListModel<Ware> warenDefaultListModel;
	DefaultListModel<Ware> warenKorbDefaultListModel;

	public Controller(GUI gui)
	{
		this.gui = gui;
		warenDefaultListModel = new DefaultListModel<>();
		warenKorbDefaultListModel = new DefaultListModel<>();
		gui.setActionListener(new ActionListenerBtnNachLinks(), new ActionListenerBtnNachRechts());
		gui.setList(warenDefaultListModel, warenKorbDefaultListModel);
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
