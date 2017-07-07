
package packageone;

import java.util.Map;
import java.util.TreeMap;

public class VowelConsonent{
	public static void main(String args[]){
		String str = "Ramsamkamdamyumnum";
		char arr[] = str.toLowerCase().toCharArray();
		TreeMap<Character, Integer> tree= new TreeMap<Character, Integer>();
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
			
			if(totalcount>0){
				tree.put(initval,totalcount);
			}
			
			totalcount=0;
		}
		int vowelcount = 0;
		int consonentcount = 0;
		for(Map.Entry<Character, Integer> val: tree.entrySet()){
			System.out.println("Character "+val.getKey()+" appears "+val.getValue()+" times.");
			
			if(val.getKey() == 'a' || val.getKey() == 'e' ||val.getKey() == 'i' ||val.getKey() == 'o' ||val.getKey() == 'u'){
				vowelcount = vowelcount + val.getValue();
			}
			else{
				consonentcount = consonentcount + val.getValue();
			}
		}
		
		System.out.println("Total vowels: "+vowelcount+" and total consonents are "+consonentcount);
		
	}
}