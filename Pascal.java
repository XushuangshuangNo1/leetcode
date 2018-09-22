package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pascal{
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
//		解题思路以及注意事项
//		使用两个list来完成，last用来存储上一层的数据
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
//	解题思路以及注意事项
//	不断地在第一个数上面添加1，然后把
	public static List<Integer> getRow2(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
	    if (rowIndex < 0)
	        return list;

	    for (int i = 0; i < rowIndex + 1; i++) {
	        list.add(0, 1);//在list的0的位置添加1
	        for (int j = 1; j < list.size() - 1; j++) {
	            list.set(j, list.get(j) + list.get(j + 1));
	        }
	    }
	    return list;
	}

	
}
