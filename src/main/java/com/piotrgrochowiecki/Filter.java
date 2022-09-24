package com.piotrgrochowiecki;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Object> filterList(List<Object> list) {
        List<Object> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof String)) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
