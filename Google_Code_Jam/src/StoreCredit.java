import java.util.*;
import java.io.*;

public class StoreCredit {
	
	public static void main(String[] args){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int c, l;
		List<Integer> items;
		
		for(int i = 1; i <= n; ++i){
			c = in.nextInt();
			l = in.nextInt();
			items = new ArrayList<Integer>(l);
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int number = 0, index = 0;
			boolean enter = true;
			
			for(int e = 1; e <= l; ++e){
				number = in.nextInt();
				items.add(number);
				map.put(number, e);
			}
			
			for(int e = 0; e < items.size() && enter ; e++){
				
				if(map.containsKey(c-items.get(e)) && map.get(c-items.get(e)) != (e+1)){
					enter = false;
					number = e+1;
					index = map.get(c-items.get(e));
				}
			}
			
			if(number > index){
				int temp = index;
				index = number;
				number = temp;
			}
			
			System.out.println("Case #"+i+": "+number+" "+index/*+" Numbers: "+items.get(number-1)+" "+items.get(index-1)*/);
		}
		
	}

}
