import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class DateiHandler
{
	File file;
	Path path;
	BufferedReader reader;
	ArrayList<String> stringList;
	BufferedWriter writer;

	public DateiHandler(File f)
	{
		stringList = new ArrayList<>();
		this.file = f;
	}

	public DateiHandler(Path p)
	{
		stringList = new ArrayList<>();
		this.path = p;
	}

	public ArrayList<String> lesen()
	{
		if (path != null)
		{
			lesenPath();
		}
		else
		{
			lesenFile();
		}

		return stringList;
	}

	public void schreiben(ArrayList<String> stringList)
	{
		if (path != null)
		{
			schreibenPath(stringList);
		}
		else
		{
			schreibenFile(stringList);
		}

	}

	private void lesenDatei()
	{
		String zeileString;
		try
		{
			while ((zeileString = reader.readLine()) != null)
			{
				stringList.add(zeileString);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	private void lesenFile()
	{

		try
		{
			reader = new BufferedReader(new FileReader(file));
			lesenDatei();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private void lesenPath()
	{
		try
		{
			reader = Files.newBufferedReader(path);
			lesenDatei();

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	private void schreibenDatei(ArrayList<String> stringList)
	{
		try
		{

			for (int i = 0; i < stringList.size(); i++)
			{
				writer.write(stringList.get(i));
				System.out.println(stringList.get(i));
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private void schreibenFile(ArrayList<String> stringList)
	{
		try
		{
			writer = new BufferedWriter(new FileWriter(file));
			schreibenDatei(stringList);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void schreibenPath(ArrayList<String> stringList)
	{
		try
		{
			writer = Files.newBufferedWriter(path, null);
			schreibenDatei(stringList);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
