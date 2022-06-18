import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Merge {

    public static void main(String[] args) {


        //Create 3 linked list with data
        List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,4,5,6));
        List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,3,4,5,8,9));
        List<Integer> list3= new LinkedList<Integer>(Arrays.asList(2,6,7,7,9,10));


        List<Integer>[] lists = new LinkedList[3];

        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;


        //New linked list to take in all data from above linked lists
        List<Integer> mergedList = new LinkedList<>();

        for(List<Integer> list : lists)
            for(Integer number : list)
                mergedList.add(number);

        //Use the sort() to sort the list
        Collections.sort(mergedList);

        //Output
        System.out.println(mergedList);



    }


}

