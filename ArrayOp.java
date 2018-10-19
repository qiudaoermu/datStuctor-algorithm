import java.util.ArrayList;
import java.util.*;
public class ArrayOp {
  public static void main(String[] args){
  	System.out.println("ArrayOp");
    int size = 3;
    double[] myList = new double[size];
    myList[0] = 5.6;
    myList[1] = 4.5;
    myList[2] = 3;
  	double total = 0;
    for(int i = 0; i<size;i++){
  	  total += myList[i];
  	}
  	System.out.println("总和为" + total);
    // ArrayList<User> users = new ArrayList(10000);
    // 	for (int i=0; i<10000; ++i){
    // 		users.add(i);
  	// 
    Set hs = new HashSet();
    hs.add("世界军事");
    hs.add("兵器知识");
    hs.add("汉和防务");
    boolean isExits = false;
    String newStr = "汉和防务";
    Iterator iterator = hs.iterator();
    while(iterator.hasNext()) {
      String oldStr = String.valueOf(iterator.next());
      if(newStr.equals(oldStr)) {
        isExits = true;
      }
    };
    System.out.println(isExits);
    System.out.println(hs.size());

    ArrayList objArray = new ArrayList();
    objArray.add(0,"common1");
    objArray.add(1,"common2");
    System.out.println("array1的元素"+objArray);

    ArrayList<String> name = new ArrayList<String>();
    name.add("icon");
    System.out.println(name);

    int sum = Sum(100);
    System.out.println(sum);

  }
  public static int Sum (int n) {
    int sum = 0;
    int i = 1;
    for(;i <= n; ++i){
      sum = sum +i;
    } 
    return sum;
  }

}
