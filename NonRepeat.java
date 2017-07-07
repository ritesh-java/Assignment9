
package packageone;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeat{
	public static void main(String args[]){
		String str = "amsamkamdamyumnumr";
		char arr[] = str.toLowerCase().toCharArray();
		int flag=0;
		System.out.println("Characters in string:Ramsamkamdamyumnum are :");
		
		for(int i =0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
        int totalcount=0;
        char saveval='\0';
        char initval = '\0';
		for(int i=0;i<arr.length-1;i++){
			initval=arr[i];
			for(int j=0;j<arr.length;j++){
				if(arr[j]==initval){
					totalcount++;
				}
			}
			
			if(totalcount==1){
				System.out.println("First non-repeated letter is: "+initval+" with count "+totalcount);
				flag = 1;
			}
			if(flag==1)
				break;
			
			totalcount=0;
		}
		
	}
}