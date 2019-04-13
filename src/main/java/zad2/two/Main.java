package zad2.two;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //dwa wzorce projektowe.

    //budowniczy
    //pylek

    //krecila nosem ale przyjela na 1/1 pkt xd

    public static void main(String[] args) {

        List<Integer> solution = new ArrayList<>();
        solution.add(1);
        solution.add(2);
        solution.add(3);

        List<Integer> domain = new ArrayList<>();
        domain.add(1);
        domain.add(2);
        domain.add(3);
        domain.add(4);

        SolutionBuilder builder = new SolutionBuilder();

        Solution sol = builder
                .setSolution(solution)
                .setDomain(domain)
                .setColor(Colors.getGreenColor())
                .createSolution();

        System.out.println(sol);

    }
}
