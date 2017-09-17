import java.util.*;
import java.io.*;



public class minScalar {
	 static IntSummaryStatistics stat1, stat2;
	
	public static void main(String[] args){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    
	    for (int i = 1; i <= t; ++i) {
	      long sum = 0;
	      int l = in.nextInt();
	      
	      List<Long> v1 = new ArrayList<Long>(l);
	      List<Long> v2 = new ArrayList<Long>(l);
	      
	      for(int e = 0; e < l; e++){
	    	  v1.add(in.nextLong());
	      }

	      for(int e = 0; e < l; e++){
	    	  v2.add(in.nextLong());
	      }
	      
	      Collections.sort(v1); Collections.sort(v2);
	      Collections.min(v1);
	      
	      for(;!v1.isEmpty();){
	    	  int minIndex, maxIndex;
	    	  minIndex = v1.indexOf(Collections.min(v1));
	    	  maxIndex = v2.indexOf(Collections.max(v2));
	    	  
	    	  sum += (Collections.min(v1)*Collections.max(v2));
	    	  
	    	  v1.remove(minIndex);
	    	  v2.remove(maxIndex);
	      }
	      
	      //Arrays.sort(v1); Arrays.sort(v2);
	      //stat1 = Arrays.stream(v1).summaryStatistics();
	      //stat2 = Arrays.stream(v2).summaryStatistics();
	      
	      
	      
	      System.out.println("Case #" + i + ": " + sum);
	    }
	}
}
