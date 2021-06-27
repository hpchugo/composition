package com.github.hpchugo.composition;

public class FunctionalComposition {
    public static void main(String[] args) {
        Function<Square, Integer> fun1 = s -> s.getArea();
        Function<Integer, Double> fun2 = area -> Math.sqrt(area);

        var getSide = fun2.compose(fun1);

        var square = new Square();
        square.setArea(100);

        var side = getSide.apply(square);
        System.out.println(side);
    }
}
