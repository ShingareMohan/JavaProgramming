package CollectionPack;

import java.util.ArrayList;
import java.util.List;

public class collect2 {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.remove(2);
        System.out.println("number of elements in a list"+list.size());
        System.out.println("list after removing an elements"+list);
    }
}
