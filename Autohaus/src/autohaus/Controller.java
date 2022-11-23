package autohaus;

import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class Controller
{
	DefaultComboBoxModel<Auto> autos;
	DateiHandler dh;
	AutoConfigurator guiAutoConfigurator;

	public Controller()
	{
		guiAutoConfigurator = new AutoConfigurator();
		autos = new DefaultComboBoxModel<>();
		dh = new DateiHandler(new File("Autos.csv"));
		dateiLesen();
		guiAutoConfigurator.setzeComboBoxModels(autos);
	}

	private void dateiLesen()
	{
		ArrayList<String> stringList = dh.lesen();
		String aktuellesModell;
		int j = -1;
		aktuellesModell = stringList.get(0).split(";")[0];
		for (int i = 0; i < stringList.size(); i++)
		{
			if (aktuellesModell.equals(stringList.get(i).split(";")[0]) == false || i == 0)
			{
				aktuellesModell = stringList.get(i).split(";")[0];
				autos.addElement(new Auto(aktuellesModell));
				j++;
			}
			autos.getElementAt(j).getFarben().addElement(new Farbe(stringList.get(i).split(";")[1]));
			autos.getElementAt(j).getPs().addElement(new PS(Integer.valueOf(stringList.get(i).split(";")[2]),
					Double.valueOf(stringList.get(i).split(";")[3])));
		}
	}

}
