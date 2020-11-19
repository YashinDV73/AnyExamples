package collection;

import static collection.obj.Box.TypeBox.iron;
import static collection.obj.Box.TypeBox.paper;
import static collection.obj.Box.TypeBox.plastic;
import static collection.obj.Box.TypeBox.plastic_1;

import collection.obj.Box;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

    private static List<Box> list = new ArrayList<>();
    private static List<Box> list1 = new ArrayList<>();

    private static Box INSTRUMNET = new Box(1, "Instrument", plastic);
    private static Box SHOOT = new Box(2, "Shoot", paper);
    private static Box SHOOT_1 = new Box(2, "Shoot", paper);
    private static Box GLASSES = new Box(3, "Glasses", paper);
    private static Box PEN = new Box(4, "Pen", iron);

    public static void main(String[] args) {

        list.add(INSTRUMNET);
        list.add(SHOOT);
        list.add(GLASSES);

        list1.add(INSTRUMNET);
        list1.add(SHOOT_1);
        list1.stream().filter(Box::isPaper).forEach(box -> box.setTypeBox(plastic_1));
        list1.add(PEN);

        System.out.println(list);
        System.out.println(list1);

        System.out.println("\n------------- result -------------\n");

        System.out.println(CollectionUtils.union(list, list1));
        System.out.println(CollectionUtils.union(list, Collections.emptyList()));
        System.out.println(CollectionUtils.union(Collections.emptyList(), list1));

        System.out.println("\n--------------------------------------- \n");

        System.out.println(list);
        System.out.println(list1);

    }
}
