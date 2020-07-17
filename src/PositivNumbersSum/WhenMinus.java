package PositivNumbersSum;

import java.util.Arrays;
import java.util.Collections;

public class WhenMinus {
    public void whenUserInputIsMinus() {
        System.out.println("Podałeś liczbę nie dodatnią");
        System.out.println(Arrays.toString(ListOfPositiveNumbers.integerList.toArray()));
        System.out.println("Wyświetlam tablicę w odwrotnej kolejności: ");
        Collections.reverse(ListOfPositiveNumbers.integerList);
        System.out.println(Arrays.toString(ListOfPositiveNumbers.integerList.toArray()));
        double sum = ListOfPositiveNumbers.integerList.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Podane przez Ciebie liczby to: " + Arrays.toString(ListOfPositiveNumbers.integerList.toArray()) + "suma podanych przez Ciebie liczb wynosi" + sum);
        System.out.println(Collections.max(ListOfPositiveNumbers.integerList));
        System.out.println(Collections.min(ListOfPositiveNumbers.integerList));
    }
}
