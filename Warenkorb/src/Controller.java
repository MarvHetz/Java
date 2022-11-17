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
	}

	class ActionListenerBtnNachRechts implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{

		}
	}
}
