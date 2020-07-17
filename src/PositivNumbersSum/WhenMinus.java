package PositivNumbersSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhenMinus {
    public void whenUserInputIsMinus(List<Double> listOfPositiveNumbers) {
        System.out.println("Podałeś liczbę nie dodatnią");
        System.out.println(Arrays.toString(listOfPositiveNumbers.toArray()));
        System.out.println("Wyświetlam tablicę w odwrotnej kolejności: ");
        Collections.reverse(listOfPositiveNumbers);
        System.out.println(Arrays.toString(listOfPositiveNumbers.toArray()));
        double sum = listOfPositiveNumbers.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Podane przez Ciebie liczby to: " + Arrays.toString(listOfPositiveNumbers.toArray()) + "suma podanych przez Ciebie liczb wynosi" + sum);
        System.out.println(Collections.max(listOfPositiveNumbers));
        System.out.println(Collections.min(listOfPositiveNumbers));
    }
}
