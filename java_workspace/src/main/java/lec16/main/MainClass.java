package lec16.main;

import lec16.dailyJournal.DailyJournal;
import lec16.employee.Employee;
import lec16.employeeBank.EmployeeBank;
import lec16.pay.Payment;
import lec16.pay.fullTime.FullTime;
import lec16.pay.partTime.PartTime;
import lec16.util.Util;
import lec16.welfare.Welfare;

public class MainClass {

    public static void main(String[] args) {

        DailyJournal dailyJournal = new DailyJournal();
        Employee employee = new Employee();
        Payment payment = new Payment();
        FullTime fullTime = new FullTime();
        PartTime partTime = new PartTime();
        Util util = new Util();
        Welfare welfare = new Welfare();

        System.out.println();

        EmployeeBank simBank = new EmployeeBank("YS");
        simBank.saveMoney(100);

        EmployeeBank youngBank = new EmployeeBank("Supreme");
        youngBank.saveMoney(300);

        EmployeeBank seokBank = new EmployeeBank("Supreme-YS");
        seokBank.saveMoney(500);

        simBank.spendMoney(50);
        youngBank.spendMoney(100);
        seokBank.spendMoney(200);

        simBank.getBankInfo();
        youngBank.getBankInfo();
        seokBank.getBankInfo();
    }

}
