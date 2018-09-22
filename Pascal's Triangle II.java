package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {
	public static void main(String[] args)
	{
//		int[] number = null;
		List<Integer> ret=null;
		Scanner x=new Scanner(System.in);
		int m=x.nextInt();
	    ret=getRow(m);
	    for(int j=0;j<ret.size();j++) {
	    	 System.out.println(ret.get(j));
	     }
	}
	public static List<Integer> getRow(int rowIndex) {
        //优化算法只有o(k)
//         List<Integer> list=new ArrayList<Integer>();//每次都new一个新的值
//        if(rowIndex==0)
//        {  
//            list.add(1);
//            return list;
//        }
//        List<Integer> temp =new ArrayList<Integer>();
//        temp.add(1);
//        list.add(1);
//        for(int i=2;i<rowIndex;i--)
//        {
//            for(int j=1; j<=i;j++)
//            {
//                list.set(j,temp.get(j-1)+temp.get(j)); //temp去存储相邻的值
//                temp=(List<Integer>) ((ArrayList<Integer>) list).clone();
//            }
//            
//        }
//        temp.add(1);
//        list.add(1);
//        return list;
		   List<Integer> last = new ArrayList<Integer>();
	        last.add(1);
	        for (int i = 1; i < rowIndex+1; i++) {
	            List<Integer> newList = new ArrayList<Integer>();
	            newList.add(1);
	            for (int j = 1; j < i; j++) {
	                newList.add(last.get(j-1) + last.get(j));
	            }
	            newList.add(1);
	            last = newList;
	        }
	        return last;

        
        
    }
}
