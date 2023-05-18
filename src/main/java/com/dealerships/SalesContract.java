package com.dealerships;

public class SalesContract extends Contract{
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean financing;
    private double monthlyPlan;

    public SalesContract(String contractDate, String customerName, String customerEmail, boolean vehicleSold, double totalPrice, double monthlyPayment, double salesTax, double recordingFee, double processingFee, boolean financing, double monthlyPlan) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financing = financing;
        this.monthlyPlan = monthlyPlan;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinancing() {
        return financing;
    }

    public void setFinancing(boolean financing) {
        this.financing = financing;
    }

    public double getMonthlyPlan() {
        return monthlyPlan;
    }

    public void setMonthlyPlan(double monthlyPlan) {
        this.monthlyPlan = monthlyPlan;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
