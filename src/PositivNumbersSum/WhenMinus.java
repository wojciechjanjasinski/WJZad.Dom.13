package PositivNumbersSum;

import java.util.Arrays;
import java.util.Collections;

public class WhenMinus {
    LoopForUserPositiveNumber loopForUserPositiveNumber = new LoopForUserPositiveNumber();
    public void whenUserInputIsMinus() {
        System.out.println("Podałeś liczbę nie dodatnią");
        System.out.println(Arrays.toString(loopForUserPositiveNumber.integerListLoopForUserPositiveNumber.toArray()));
        System.out.println("Wyświetlam tablicę w odwrotnej kolejności: ");
        Collections.reverse(loopForUserPositiveNumber.integerListLoopForUserPositiveNumber);
        System.out.println(Arrays.toString(loopForUserPositiveNumber.integerListLoopForUserPositiveNumber.toArray()));
        double sum = loopForUserPositiveNumber.integerListLoopForUserPositiveNumber.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Podane przez Ciebie liczby to: " + Arrays.toString(loopForUserPositiveNumber.integerListLoopForUserPositiveNumber.toArray()) + "suma podanych przez Ciebie liczb wynosi" + sum);
        System.out.println(Collections.max(loopForUserPositiveNumber.integerListLoopForUserPositiveNumber));
        System.out.println(Collections.min(loopForUserPositiveNumber.integerListLoopForUserPositiveNumber));
    }
}
