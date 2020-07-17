package PositivNumbersSum;

public class LoopForUserPositiveNumber {
    WhenMinus whenMinus = new WhenMinus();

    public void fromUserLoop() {
        if (ScannerImputFromUser.scannerFromUser() > 0) {
            do {
                ScannerImputFromUser.scannerFromUser();
                ListOfPositiveNumbers.integerList.add(ScannerImputFromUser.scannerFromUser());

            } while (ScannerImputFromUser.scannerFromUser() > 0);
        } else {
            whenMinus.whenUserInputIsMinus();
        }

    }
}


