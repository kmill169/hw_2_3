package edu.msud.cs.cs1.ch_3_2;

public class ChemicalElement {
    // In every temperature scale, -1000.0 is way "under" absolute zero, so it's nonsensical.
    public static final double MISSING_TEMP = -1000.0;
    // Negative density is nonsensical.
    public static final int MISSING_DENSITY = -1;

    //member variables
    private String element;
    private byte atomicNumber;
    private String symbol;
    private double atomicWeight;

    // other variables
    private double boilD;
    private double meltD;
    private int densityI;
    private double vaporD;
    private double fusionD;

    public ChemicalElement(String element,
                           byte number,
                           String symbol,
                           double weight,
                           double boil,
                           double melt,
                           int density,
                           double vapor,
                           double fusion) {
        this.element = element;
        this.atomicNumber = number;
        this.symbol = symbol;
        this.atomicWeight = weight;
        this.boilD = boil;
        this.meltD = melt;
        this.densityI = density;
        this.vaporD = vapor;
        this.fusionD = fusion;
    }

    public ChemicalElement() {
        this.element = "";
        this.atomicNumber = 0;
        this.symbol = "";
        this.atomicWeight = 0.0;
        this.boilD = MISSING_TEMP;
        this.meltD = MISSING_TEMP;
        this.densityI = MISSING_DENSITY;
        this.vaporD = MISSING_TEMP;
        this.fusionD = MISSING_TEMP;
    }

    // getters & setters
    public String getElementS() {
        return element;
    }

    public void setElementS(String elementS) {
        this.element = elementS;
    }

    public byte getNumberB() {
        return atomicNumber;
    }

    public void setNumberB(byte numberB) {
        this.atomicNumber = numberB;
    }

    public String getSymbolS() {
        return symbol;
    }

    public void setSymbolS(String symbolS) {
        this.symbol = symbolS;
    }

    public double getWeightD() {
        return atomicWeight;
    }

    public void setWeightD(double weightD) {
        this.atomicWeight = weightD;
    }

    public double getBoilD() {
        return boilD;
    }

    public void setBoilD(double boilD) {
        this.boilD = boilD;
    }

    public double getMeltD() {
        return meltD;
    }

    public void setMeltD(double meltD) {
        this.meltD = meltD;
    }

    public int getDensityI() {
        return densityI;
    }

    public void setDensityI(int densityI) {
        this.densityI = densityI;
    }

    public double getVaporD() {
        return vaporD;
    }

    public void setVaporD(double vaporD) {
        this.vaporD = vaporD;
    }

    public double getFusionD() {
        return fusionD;
    }

    public void setFusionD(double fusionD) {
        this.fusionD = fusionD;
    }

    @Override
    public String toString() {
        // TODO report missing values with 'unknown' or 'n/a' instead of the nonsensical defaults
        StringBuffer returnValue = new StringBuffer();


        returnValue.append("Chemical element: ");
        returnValue.append(element);
        returnValue.append(" [").append(atomicNumber).append(" | ");
        returnValue.append(symbol);
        returnValue.append("]\n");

        returnValue.append(" Weight: ");
        returnValue.append(atomicWeight);
        returnValue.append('\n');

        returnValue.append(" Density: ");
        returnValue.append(densityI);
        returnValue.append('\n');

        returnValue.append(" Temp (b|m|v|f): ");
        returnValue.append(boilD);
        returnValue.append(", ");
        returnValue.append(meltD);
        returnValue.append(", ");
        returnValue.append(vaporD);
        returnValue.append(", ");
        returnValue.append(fusionD);

        return returnValue.toString();
    }
}