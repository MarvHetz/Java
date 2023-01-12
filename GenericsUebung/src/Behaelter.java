import java.util.ArrayList;

public class Behaelter<T>
{
	ArrayList<T> arrayList;

	public Behaelter()
	{
		leereBehaelter();
	}

	public void lasseFrei(T freizulassen)
	{
		arrayList.remove(freizulassen);
	}

	public void leereBehaelter()
	{
		arrayList = new ArrayList<>();
	}

	public void sperreEin(T einzusperren)
	{
		arrayList.add(einzusperren);
	}

}
