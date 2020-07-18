package PositivNumbersSum;

import java.util.List;

public class LoopForUserPositiveNumber {
    Summary summary = new Summary();

    public void fromUserLoop(List<Double> listOfPositiveNumbers) {
        double number;
        do {
            number = ScannerImputFromUser.scannerFromUser();
            if (number > 0) {
                listOfPositiveNumbers.add(number);
            }
        } while (number > 0);

        summary.displaySummaryI(listOfPositiveNumbers);
    }

}


