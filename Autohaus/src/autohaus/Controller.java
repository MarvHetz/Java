package autohaus;

import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class Controller
{
	DefaultComboBoxModel<Auto> autoDefaultComboBoxModel;
	ArrayList<Auto> autos;
	DateiHandler dh;
	AutoConfigurator guiAutoConfigurator;

	public Controller()
	{
		guiAutoConfigurator = new AutoConfigurator();
		autos = new ArrayList<>();
		autoDefaultComboBoxModel = new DefaultComboBoxModel<>();
		dh = new DateiHandler(new File("Autos.csv"));
		dateiLesen();
		guiAutoConfigurator.setzeComboBoxModels(autoDefaultComboBoxModel);
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
				autos.add(new Auto(aktuellesModell));
				j++;
			}
			autos.get(j).getFarben().add(new Farbe(stringList.get(i).split(";")[1]));
			autos.get(j).getPs().add(new PS(Integer.valueOf(stringList.get(i).split(";")[2]),
					Double.valueOf(stringList.get(i).split(";")[3])));
		}

		ArrayList<Farbe> farbenArrayList;
		for (Auto auto : autos)
		{
			farbenArrayList = auto.getFarben();
			// farbenArrayList.sort();
		}

		autoDefaultComboBoxModel = getNewDefaultComboBoxModel(autos);
	}

	// http://www.java2s.com/example/java-utility-method/jcombobox-model/getnewdefaultcomboboxmodel-arraylist-class-itemstostream-0df86.html
	// Umwandlung von einer ArrayList in ein DefaultComboBoxModel
	public static DefaultComboBoxModel getNewDefaultComboBoxModel(ArrayList<Auto> autos2)
	{
		DefaultComboBoxModel newModel = new DefaultComboBoxModel();

		autos2.stream().forEach((c) -> {
			newModel.addElement(c);
		});

		return newModel;
	}

}
