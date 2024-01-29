package entitis;

public class OutsourcedEmployee extends Employee {
    private Double additonalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additonalCharge) {
        super(name, hours, valuePerHours);
        this.additonalCharge = additonalCharge;
    }


    public Double getAdditonalCharge() {
        return additonalCharge;
    }

    public void setAdditonalCharge(Double additonalCharge) {
        this.additonalCharge = additonalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additonalCharge * 1.1;
    }


}
