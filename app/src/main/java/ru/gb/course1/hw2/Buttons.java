package ru.gb.course1.hw2;

public class Buttons {
    String stringInputTextView = "";
    String symbolOperation = "";
    double valueFirst;
    double valueSecond;
    double temp;

    public boolean divideButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "/";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public boolean multiplyButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "*";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public boolean subtractButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "-";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public boolean foldButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "+";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public boolean buttonComma() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat(".");
            return true;
        }
        return false;
    }

    public boolean buttonNull() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("0");
            return true;
        }
        return false;
    }

    public boolean buttonOne() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("1");
            return true;
        }
        return false;
    }

    public boolean buttonTwo() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("2");
            return true;
        }
        return false;
    }

    public boolean buttonThree() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("3");
            return true;
        }
        return false;
    }

    public boolean buttonFour() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("4");
            return true;
        }
        return false;
    }

    public boolean buttonFive() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("5");
            return true;
        }
        return false;
    }

    public boolean buttonSix() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("5");
            return true;
        }
        return false;
    }

    public boolean buttonSeven() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("7");
            return true;
        }
        return false;
    }

    public boolean buttonEight() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("8");
            return true;
        }
        return false;
    }

    public boolean buttonNine() {
        if (stringInputTextView.length() <= 12 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("9");
            return true;
        }
        return false;
    }

    public void clearTextView() {
        stringInputTextView = "";
    }

    public void clearAllCount() {
        stringInputTextView = "";
        symbolOperation = "";
        double valueFirst = 0.0f;
        double valueSecond = 0.0f;
        double temp = 0.0f;
    }

    public void equalsCount() {
        valueSecond = Double.parseDouble(stringInputTextView);
        if (symbolOperation.equals("/")) {
            temp = valueFirst / valueSecond;
        }
        if (symbolOperation.equals("*")) {
            temp = valueFirst * valueSecond;
        }
        if (symbolOperation.equals("-")) {
            temp = valueFirst - valueSecond;
        }
        if (symbolOperation.equals("+")) {
            temp = valueFirst + valueSecond;
        }
    }
}
