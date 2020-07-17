package PositivNumbersSum;

public class ListThree {
    WhenMinus whenMinus = new WhenMinus();

    public void loopOne() {
        if (ListTwo.scannerFromUser() > 0) {
            do {
                ListTwo.scannerFromUser();
                ListOne.integerList.add(ListTwo.scannerFromUser());

            } while (ListTwo.scannerFromUser() > 0);
        } else {
            whenMinus.whenUserInputIsMinus();
        }

    }
}


