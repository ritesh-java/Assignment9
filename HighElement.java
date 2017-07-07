
package packageone;

public class HighElement{
	public static void main(String args[]){
	  int[] arr = {3,6,1,5,6,8,6,3,5,6,9,6,8,4,6,7,6,2,3,6,6,7,6,3,6,4,6,5,6,8,6,6};
	  int init = arr[0];
	  int totalcount=1;
	  int saveval=0;
	  int savecount=0;
	  for(int i=0;i<arr.length-1;i++){
		  init = arr[i];
		  for(int j =i+1;j<arr.length;j++){
			  if(arr[j]==init){
				  totalcount=totalcount+1;
			  } 
		  }

		if(totalcount>savecount){
			  savecount=totalcount;
			  saveval = init;
		  }
		  totalcount = 1;
	  }
	  
	  System.out.println("Array: ");
	  for(int id =0; id<arr.length;id++){
		  System.out.print(arr[id]+"  ");
	  }
	  System.out.println();System.out.println();
	  System.out.println("Element which appears most is "+saveval+" and it appears "+savecount+" times");
	  
	
	}
}