package filmdatenbank;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.DefaultListModel;

public class Controller
{
	private DateiHandler dHandler;
	private DefaultListModel<Film> filmeDefaultListModel;
	private GUI gui;

	public Controller()
	{
		dHandler = new DateiHandler(new File("FilmListe2.txt"));
		filmeDefaultListModel = new DefaultListModel<>();
		lesenDatei();
		gui = new GUI();
		setzeModels();
	}

	private void lesenDatei()
	{
		ArrayList<String> dateiAusgelesen = dHandler.lesen();

		dateiAusgelesen.remove(0);

		String[] filmGesplitet;

		for (String film : dateiAusgelesen)
		{
			filmGesplitet = film.split(";");
			if (vergleichenFilme(new Film(Integer.valueOf(filmGesplitet[0]), filmGesplitet[1], filmGesplitet[2],
					Integer.valueOf(filmGesplitet[3]))))
			{
				filmeDefaultListModel.addElement(new Film(Integer.valueOf(filmGesplitet[0]), filmGesplitet[1],
						filmGesplitet[2], Integer.valueOf(filmGesplitet[3])));
			}

		}
	}

	private void setzeModels()
	{
		gui.getListFilm().setModel(filmeDefaultListModel);
	}

	private boolean vergleichenFilme(Film zuVergleichen)
	{

		Film[] filmeArray = Arrays.stream(filmeDefaultListModel.toArray()).toArray(Film[]::new);
		for (Film film : filmeArray)
		{
			if (zuVergleichen.equals(film))
			{
				return false;
			}
		}
		return true;
	}
}
