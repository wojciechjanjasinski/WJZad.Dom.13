package PositivNumbersSum;

import java.util.ArrayList;
import java.util.List;

public class LoopForUserPositiveNumber {
    WhenMinus whenMinus = new WhenMinus();
    List<Double> integerListLoopForUserPositiveNumber = new ArrayList<>();
    public void fromUserLoop() {
        double number = 0;
        do {
            number = ScannerImputFromUser.scannerFromUser();
            ScannerImputFromUser.scannerFromUser();

            integerListLoopForUserPositiveNumber.add(number);

        } while (number > 0);

        whenMinus.whenUserInputIsMinus();
    }

}


