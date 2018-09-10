import java.util.*;


/**
 * Created by rex on 2018/9/10.
 * 语法 功能性测试
 */
public class Test {
    public static void main(String[] args)
    {
        String tmp1;
        StringBuffer tmp2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        TreeSet<Integer> setTree = new TreeSet<Integer>();


        System.out.println("done");
    }
}


//        TreeSet<Integer> setTree = new TreeSet<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -o1.compareTo(o2);
//            }
//        });

//        setTree.add(1);
//        setTree.add(23);
//        setTree.add(4);
//        for(Integer i1: setTree)
//        {
//            System.out.println(i1);
//        }