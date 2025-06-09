import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
	
		String str = "success";
		
		findMostRepeatedIndex(str);
	}

	private static void findMostRepeatedIndex(String str) {
		
		
		char[] arr =str.toCharArray();
		
	  char	mostRepeated =arr[0];
	  int maxCount=0;
	  boolean[] visited = new boolean[arr.length];
	  
	  for(int i=0;i<arr.length;i++) {
		  if(visited[i]) {
			  continue;
		  }
		  
		  int count=1;
		  
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]==arr[j]) {
				 count++;
				  visited[j]=true;
				  
			  }
		  }
		  
		  
		  if(count>maxCount) {
			  maxCount=count;
			  mostRepeated=arr[i];
		  }
	  }
	  
	  
	  
	 List<Integer> indices = new ArrayList<>();
		
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==mostRepeated) {
			 indices.add(i);
		 }
	 }
	 System.out.println("Most repeated char is " + mostRepeated + ": ( occured " + maxCount + " times )");

	 System.out.print("At Index : ");
	 
	 for(int index:indices) {
		 System.out.print(index+" ");
	 }
	 
	}

}
