public class SalaryCalculate {
    private double baseSalary;
    public SalaryCalculate(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double finishSalary(){
        double tax = baseSalary * 0.25;
        return baseSalary - tax;
    }
}
