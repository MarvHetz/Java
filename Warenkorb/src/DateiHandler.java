import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DateiHandler
{
	BufferedReader reader;
	BufferedWriter writer;

	public DateiHandler(File f)
	{
		try
		{
			reader = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public DateiHandler(Path p)
	{
		try
		{
			reader = Files.newBufferedReader(p);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
