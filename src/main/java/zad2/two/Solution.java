package zad2.two;

import java.awt.*;
import java.util.List;

class Solution {

    private List<Integer> domain;
    private List<Integer> solution;

    private Color color;

    Solution(List<Integer> domain, List<Integer> solution, Color color) {
        this.domain = domain;
        this.solution = solution;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "domain=" + domain +
                ", solution=" + solution +
                ", color=" + color +
                '}';
    }
}
