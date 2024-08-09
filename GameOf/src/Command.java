
public class Command
	{
	protected String verb;
	protected String directObject;
	protected String indirectObject;
	protected String preposition;
	public Command(String v, String d, String i, String p)
		{
		this.verb = v;
		this.directObject = d;
		this.indirectObject = i;
		this.preposition = p;
		}
	public String getVerb()
		{
		return verb;
		}
	public void setVerb(String verb)
		{
		this.verb = verb;
		}
	public String getDirectObject()
		{
		return directObject;
		}
	public void setDirectObject(String directObject)
		{
		this.directObject = directObject;
		}
	public String getIndirectObject()
		{
		return indirectObject;
		}
	public void setIndirectObject(String indirectObject)
		{
		this.indirectObject = indirectObject;
		}
	public String getPreposition()
		{
		return preposition;
		}
	public void setPreposition(String p)
		{
		this.preposition = p;
		}		
	public String toString() 
		{
		return "Verb: " + verb + ", Direct Object: " + directObject + ", Indirect Object: " + indirectObject + ", Preposition: " + preposition;
		}
	}
