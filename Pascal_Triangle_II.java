package practice;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list = getRow(4);
		for(int i : list){
			System.out.print(i);
		}
	}
     public static List<Integer> getRow(int rowIndex) {
    	 List<Integer> mylist = new ArrayList<Integer>();
    	 int temp=1;
    	 int temp1=0;
    	 mylist.add(1);
    	 while(rowIndex >0){
    		 for (int i =1;i<mylist.size();i++){
    			 temp1 = mylist.get(i);
    			 mylist.set(i, temp+temp1);
    			 temp=temp1;
    		 } 
    		 mylist.add(1);
    		 rowIndex--;
    	 } 
    	 return mylist;
    }

}
