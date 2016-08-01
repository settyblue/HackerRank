import java.util.HashMap;
import java.util.TreeMap;
/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String[] names = {"Albert II","Polo IV","Alexander V","Elizabeth XXV",
						  "Albert XL","Polo XLVI","William IX","Edward XXXIX",
						  "Elizabeth XIX"};

		String[] sortedNames = sort(names);
		print(sortedNames);
	}

	private static String[] sort(String[] names) {
		TreeMap<String,TreeMap<Integer,Integer>> map = new TreeMap<>();
		for(int i=0; i<names.length; i++){
			String name = names[i].split(" ")[0];
			String number = names[i].split(" ")[1];
			int num = convertToRomanNumber(number);
			if(map.containsKey(name)){
				map.get(name).put(num, i);
			}else{
				TreeMap<Integer, Integer> temp = new TreeMap<>();
				temp.put(num, i);
				map.put(name, temp);
			}
		}
		String[] answer = new String[names.length];
		int count = 0;
		for(String name:map.keySet()){
			for(Integer number:map.get(name).keySet()){
				answer[count] = names[map.get(name).get(number)];
				count++;
			}
		}
		return answer;
	}

	private static int convertToRomanNumber(String number) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);map.put('V', 5);map.put('X', 10);map.put('L', 50);map.put('C', 100);
		int sum = 0;
		int prevDigit = 0;
		int nowDigit = 0;
		for(int i=number.length()-1;i>=0;i--){
			nowDigit = map.get(number.charAt(i));
			if(nowDigit >= prevDigit){
				sum += nowDigit;
			}else{
				sum -= nowDigit;
			}
			prevDigit = nowDigit;
		}
		return sum;
	}

	private static void print(String[] sortedNames) {
		for(int i=0; i<sortedNames.length; i++){
			System.out.println(sortedNames[i]);
		}
	}
}
