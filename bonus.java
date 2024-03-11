public class bonus extends employee1 {
    double bonus;
    public employee(double bonus)
    {
        this.bonus=bonus;
    }
    public double getbonus()
    {
        return bonus;
    }
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    public double calculatesalary(){
        return salary + bonus;
    }
    public static void main(String[] args) {
        employee emp=new employee();
        System.out.println("total salaray" +emp.calculatesalary);
    }
}
