package zad2.two;

import java.awt.*;
import java.util.List;

class SolutionBuilder {
    private List<Integer> domain;
    private List<Integer> solution;
    private Color color;

    SolutionBuilder setDomain(List<Integer> domain) {
        this.domain = domain;
        return this;
    }

    SolutionBuilder setSolution(List<Integer> solution) {
        this.solution = solution;
        return this;
    }

    SolutionBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    Solution createSolution() {
        return new Solution(domain, solution, color);
    }
}
