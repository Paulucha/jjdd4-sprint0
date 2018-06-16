package com.infoshareacademy;

import java.util.LinkedList;
import java.util.List;

public class CompareList {
    List a;
    List b;

    public List getA() {
        return a;
    }

    public void setA(List a) {
        this.a = a;
    }

    public List getB() {
        return b;
    }

    public void setB(List b) {
        this.b = b;
    }


    public List<Integer> returnSameDiv(List a, List b) {
        List<Integer> sameDiv = new LinkedList<>();

        if (a.size() < b.size()) {
            for (int i = 0; i < a.size(); i++) {

                if (b.contains(a.get(i))) {
                    sameDiv.add((Integer) a.get(i));
                }
            }
        } else

            for (int i = 0; i < b.size(); i++) {
                if (a.contains(b.get(i))) {
                    sameDiv.add((Integer) b.get(i));
                }
            }
        return sameDiv;
    }
}
