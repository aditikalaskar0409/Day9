public class EmpWageCalUC2 {
     
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int empRatePerHr = 20;
        int empHrs = 8;
        int s = empHrs * empRatePerHr;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println ("Salary is "+s);
        else
            System.out.println ("Salary is 0 ");
    }
}