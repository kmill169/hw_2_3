package edu.msud.cs.cs1.ch_3_2;

public class UnknownChemicalElementException extends Exception {
    UnknownChemicalElementException(String symbol) {
        super("Unknown chemical element symbol \'" + symbol + "\'");
    }
}