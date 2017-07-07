
package packageone;

public class MaxProfit{
	public static void main(String args[]){
		int[] arr= {10,05,04,12,32,04,35,24,34,9,45};
		int len = arr.length;
		int savei=0,savej=0;
		int newdiff=0;
		int initdiff= arr[1]-arr[0];
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				newdiff = arr[j] - arr[i];
				if(newdiff>=initdiff){
					initdiff = newdiff;
					savei=i;
					savej=j;
				}
			}
		}
		System.out.println("Daily stock representation for the past few days is as shown below: ");
		for(int i =0;i<len;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Buying at "+savei+" index and selling at "+savej+" index will lead to max profit of "+(arr[savej] - arr[savei]));
	}
}