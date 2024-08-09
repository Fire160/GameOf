import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Parser 
	{
    private static final List<String> VERBS = Arrays.asList("attack", "breakdance", "dig","drop", "eat","enter","equip","exit", "go", "help", "inventory", "map","move", "search", "status", "unequip", "use" ,"walk");
    private static final List<String> OBJECTS = Arrays.asList("lamp", "key", "door", "book");
    private static final List<String> PREPOSITIONS = Arrays.asList("about","above","across","after","against","along","among","amoung","around","as","at", "before","behind","below","beneath","beside","between","beyond","by", "despite","down","during", "except", "for","from", "in","inside","into", "like", "near", "of","on","onto","opposite","out","outside","over", "past", "round", "since", "than","through","to","toward","towards", "under","underneath","unlike","until","up","upon", "via", "with", "within", "without");
    public static Command parseCommand(String input)
    	{
        String[] words = input.split("\\s+"); // Split the input into words
        System.out.println(Arrays.toString(words));
        String verb = findVerb(words);
        String directObject = null;
        String indirectObject = null;
        String preposition = null;
        int prePos = -1;
        
        for(int i = 0; i < words.length; i++)
        	{
        	if(PREPOSITIONS.contains(words[i]))
        		{
        		preposition = words[i];
        		prePos = i;
        		i = words.length;
        		}
        	}
        for(int i = 0; i < words.length; i++)
        	{
        	if(OBJECTS.contains(words[i]))
        		{
        		if(prePos > -1 && prePos < i)
        			{
        			indirectObject = words[i];
        			i = words.length;
        			}
        		else
        			{
        			directObject = words[i];
        			}
        		}
        	}

        return new Command(verb, directObject, indirectObject, preposition);
    	}
    private static String findVerb(String[] words) 
    	{
    	for(int i = 0; i < words.length; i++)
        	{
        	if(VERBS.contains(words[i].toLowerCase()))
        		{
        		return words[i];
        		}
        	}
    	return null;
    	}
//    private static String findDirectObject(String word) 
//    	{
//        return null;
//    	}
//parsing testing method
    public static void main(String[] args) 
    	{
    	Scanner things = new Scanner(System.in);
    	boolean test = true;
    	while(test)
    		{
    		String input = things.nextLine();
    		Command command = parseCommand(input);
    		if(input.contains("exit"))
    			{
    			test = false;
    			}
    		System.out.println(command);
    		}
        things.close();
    	}
	}
