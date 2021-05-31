package Map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. this has never happend before .";
		
		Map<Character, Integer> occur = new HashMap<>();
		
		char[] character = str.toCharArray();
		for(char characters:character)
		{
			Integer integer = occur.get(characters);
			if(integer==null)
			{
				occur.put(characters,1);
			}else
			{
				occur.put(characters, integer+1);
			}
				
		}
		System.out.println(occur);
		Map<String,Integer> stroccur = new HashMap<>();
		String[] words =str.split(" ");
		for(String word: words)
		{
			Integer integer = stroccur.get(word);
			if(integer==null)
			{
				stroccur.put(word, 1);		
			}else
			{
				stroccur.put(word, integer+1);
			}
		}
		System.out.println(stroccur);
	}

}
