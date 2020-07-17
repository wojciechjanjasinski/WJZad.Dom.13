package PositivNumbersSum;

import java.util.List;

public class LoopForUserPositiveNumber {
    WhenMinus whenMinus = new WhenMinus();
    public void fromUserLoop(List<Double> listOfPositiveNumbers) {
        double number;
        do {
            number = ScannerImputFromUser.scannerFromUser();
            ScannerImputFromUser.scannerFromUser();

            listOfPositiveNumbers.add(number);

        } while (number > 0);

        whenMinus.whenUserInputIsMinus(listOfPositiveNumbers);
    }

}


