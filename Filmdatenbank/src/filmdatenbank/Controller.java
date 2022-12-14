package filmdatenbank;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;

public class Controller
{
	private boolean arrayListReversed;
	private DateiHandler dHandler;
	private ArrayList<Film> filmeArrayList;
	private ComboBoxModel<String> filters;

	private GUI gui;

	public Controller()
	{
		arrayListReversed = false;
		dHandler = new DateiHandler(new File("FilmListe2.txt"));
		filmeArrayList = new ArrayList<>();
		lesenDatei();
		filmeArrayList.sort((f1, f2) -> Integer.compare(f1.getId(), f2.getId()));
		gui = new GUI();
		erstelleDefaultListModel(filmeArrayList);
		setzeActionListener();

	}

	private void absteigendSotieren()
	{
		if (arrayListReversed)
		{
			Collections.reverse(filmeArrayList);
			arrayListReversed = false;
		}
		erstelleDefaultListModel(filmeArrayList);
	}

	private void aufsteigendSotieren()
	{
		if (!arrayListReversed)
		{
			Collections.reverse(filmeArrayList);
			arrayListReversed = true;
		}
		erstelleDefaultListModel(filmeArrayList);
	}

	private void erstelleDefaultListModel(ArrayList<Film> toDefaultListModel)
	{
		DefaultListModel<Film> filmeDefaultListModel = new DefaultListModel<>();
		for (Film film : toDefaultListModel)
		{
			filmeDefaultListModel.addElement(film);
		}

		gui.getListFilm().setModel(filmeDefaultListModel);
	}

	private void filtern()
	{
		ArrayList<Film> filterdArrayList = new ArrayList<>();
		for (Film film : filmeArrayList)
		{
			if (film.getName().contains(gui.getTextFieldSuchen().getText()))
			{
				filterdArrayList.add(film);
			}
		}
		erstelleDefaultListModel(filterdArrayList);
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
				filmeArrayList.add(new Film(Integer.valueOf(filmGesplitet[0]), filmGesplitet[1], filmGesplitet[2],
						Integer.valueOf(filmGesplitet[3])));
			}

		}
	}

	private void setzeActionListener()
	{
		gui.getBtnAbsteigend().addActionListener(e -> absteigendSotieren());
		gui.getBtnAufsteigend().addActionListener(e -> aufsteigendSotieren());
		gui.getBtnSuche().addActionListener(e -> filtern());
		gui.getBtnZuruck().addActionListener(e -> {
			erstelleDefaultListModel(filmeArrayList);
			gui.getTextFieldSuchen().setText(null);
		});
	}

	private boolean vergleichenFilme(Film zuVergleichen)
	{

		for (Film film : filmeArrayList)
		{
			if (zuVergleichen.equals(film) && (zuVergleichen.hashCode() == film.hashCode()))
			{
				return false;
			}
		}
		return true;
	}
}
