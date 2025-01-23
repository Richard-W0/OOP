package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String pinCode) {
        this.pinCode = pinCode;
        this.safeFolder = new ArrayList<>();
    }

    public void changePin(String pinCode) {
        this.pinCode = pinCode;
    }

    public void addToList(String newElement) {
        this.safeFolder.add(newElement);
    }

    private boolean comparePins(String attemptPin) {
        if (this.pinCode.equals(attemptPin)) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getContent(String attemptPin) {
        if (comparePins(attemptPin)) {
            return this.safeFolder;
        }
        throw new IllegalArgumentException("Bruh");
    }
}
