package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem3 {
    public static List<Snack> Solution(List<Snack> snackList) {
        List<Snack> answer = Collections.emptyList();
        answer = snackList;

        Collections.sort(answer, new Comparator<Snack>() {
            @Override
            public int compare(Snack o1, Snack o2) {
                if(o1.price == o2.price){
                    return o1.name.compareTo(o2.name);
                }

                return o2.price-o1.price;
            }
        });

        return answer;
    }
}
