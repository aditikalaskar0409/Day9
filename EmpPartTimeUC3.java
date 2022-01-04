public class EmpPartTimeUC3 {
     
    public static void main(String[] args) {

        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int empRatePerHr = 20;
        int empHrs ; 
       
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if ( empCheck == IS_FULL_TIME ){
             empHrs = 16;
        }
        else if ( empCheck == IS_PART_TIME ){
             empHrs = 8;
        }
        else {
             empHrs = 0;
        }
        System.out.println("empHrs is" +empHrs);
     
    }
}