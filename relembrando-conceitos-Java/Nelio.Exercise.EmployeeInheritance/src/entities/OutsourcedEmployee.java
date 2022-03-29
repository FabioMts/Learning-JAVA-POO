package entities;

public class OutsourcedEmployee extends Employee{

    private Double aditionalCharge;

    public OutsourcedEmployee() {

    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
        super(name, hours, valuePerHour);
        this.aditionalCharge = aditionalCharge;
    }

    public Double getAditionalCharge() {
        return aditionalCharge;
    }

    public void setAditionalCharge(Double aditionalCharge) {
        this.aditionalCharge = aditionalCharge;
    }

    public double payment() {
        return super.payment() + aditionalCharge * 1.1;
    }

}
