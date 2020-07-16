package PositivNumbersSum;

import java.util.Arrays;
import java.util.Collections;

public class ListThree {
    public void loopOne(){
        if (ListTwo.scannerFromUser() > 0){
        do {
            ListTwo.scannerFromUser();
            ListOne.integerList.add(ListTwo.scannerFromUser());

        }while (ListTwo.scannerFromUser() > 0);}
        else {
            ListTwo.scannerFromUser();
            System.out.println("Podałeś liczbę nie dodatnią");
            System.out.println(Arrays.toString(ListOne.integerList.toArray()));
            System.out.println("Wyświetlam tablicę w odwrotnej kolejności: ");
            Collections.reverse(ListOne.integerList);
            System.out.println(Arrays.toString(ListOne.integerList.toArray()));
            double sum = ListOne.integerList.stream().mapToDouble(Double::doubleValue).sum();
            System.out.println("Podane przez Ciebie liczby to: " + Arrays.toString(ListOne.integerList.toArray()) + "suma podanych przez Ciebie liczb wynosi" + sum);
            System.out.println(Collections.max(ListOne.integerList));
            System.out.println(Collections.min(ListOne.integerList));
        }
        {

            }
        }
    }


