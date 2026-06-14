import java.util.Scanner;
import java.util.HashMap;


public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < names.length; i++) {
			
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge(HashMap<String, Integer> map, String name) {
		
		int increaseAge = map.get(name);
		
		increaseAge = increaseAge + 1;
		
		map.replace(name, increaseAge);
	}

	public static void replaceName(HashMap<String, Integer> map, String word1, String word2) {
		
		int replace1 = map.get(word1);
		
		map.remove(word1);
		
		map.put(word2, replace1);
	}
}

