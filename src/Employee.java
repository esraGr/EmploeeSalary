public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYears;



    public Employee(String name, int salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public int tax() {
        int tax=0;
        if (salary >= 1000){
       tax= (int) (this.salary-(salary* 0.03));
            } else
                tax= this.salary;
    return tax;
    }

    public int bonus(){
        int bonus=0;
        if (workHours>40){
            bonus= (int) (this.workHours-40)*30;
        }

        return bonus;
    }

    public double lastSalary() {
        return salary + bonus() + (tax() - salary);
    }

    public int raiseSalary(){
       int  raiseSalary=0;
        if (hireYears>=2012){
            raiseSalary= (int)(lastSalary()*0.05);
        }
        else if (hireYears>=2002){
            raiseSalary= (int) (lastSalary()*0.10);
        }
        else if (hireYears<2002)
        {
            raiseSalary= (int) (lastSalary()*0.15);
        }
        return raiseSalary;
   }

    public double ToplammaasHesapla() {
        return lastSalary()+raiseSalary();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYears=" + hireYears +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYears() {
        return hireYears;
    }

    public void setHireYears(int hireYears) {
        this.hireYears = hireYears;
    }

}



