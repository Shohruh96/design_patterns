package test;

public class Test1 {
    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
//        doctor.rest();
//        doctor.operatsiya();
//        Employee employee = doctor;
//        doctor.rest();
//        doctor.operatsiya();
        Employee employee = new Ziravorlar() {
            @Override
            void rest() {
                super.rest();
            }
        };
        System.out.println("birinchi buyruq tugadi");
        employee = new Teacher(employee);
        System.out.println("ikkinchi buyruq tugadi");
        employee.rest();
    }
}

abstract class Employee{
    Employee(){
        System.out.println("obyekt Employee yaratildi");
    }
    void rest(){
        System.out.println("ishni dam oladi");
    }
    public int cost(){
        return 100;
    }
}
abstract class Ziravorlar extends Employee{
    Ziravorlar(){
        System.out.println("obyekt Ziravorlar yaratildi");
    }
}
class Teacher extends Ziravorlar{
    Employee employee;
    Teacher(Employee employee){
        System.out.println("obyekt Teacher yaratildi");
        this.employee = employee;
    }
    public int cost(){
        return 1000 + employee.cost();
    }
    void teaching(){
        System.out.println("oqituvchi dars beradi.");
    }
}
class Doctor extends Ziravorlar{
    Employee employee;
    Doctor(Employee employee){
        System.out.println("obyekt Doktor yaratiladi");
        this.employee = employee;
    }
    void operatsiya(){
        System.out.println("doktor operatsiya qiladi");
    }
    public int cost(){
        return 200 + employee.cost();
    }
}
