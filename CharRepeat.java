
package packageone;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CharRepeat{
	public static void main(String args[]){
		String str = "Ramsamkamdamyumnum";
		char arr[] = str.toLowerCase().toCharArray();
		TreeMap<Integer, Character> tree= new TreeMap<Integer, Character>();
		System.out.println("Characters in string:Ramsamkamdamyumnum are :");
		
		for(int i =0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
        int totalcount=0;
        char saveval='\0';
        char initval = '\0';
		for(int i =0;i<arr.length-1;i++){
			initval=arr[i];
			for(int j=0;j<arr.length;j++){
				if(arr[j]==initval){
					totalcount++;
				}
			}
			
			if(totalcount>1){
				tree.put(totalcount,initval);
			}
			
			totalcount=0;
		}
		
		for(Map.Entry<Integer, Character> val: tree.entrySet()){
			System.out.println("Character "+val.getValue()+" appears "+val.getKey()+" times.");
		}
		
	}
}