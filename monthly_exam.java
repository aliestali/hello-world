public class monthly_exam
{
    int id = 67;
    String name = "Aliah Kiana C. Aguilar";
    int age = 19;
    String course = "BSCS 1B";

    public static void main(String[] args) 
    {
        monthly_exam obj = new monthly_exam();

        obj.displayInfo();

        computeFeePerTerm(16000, 8000);
    }


    public void displayInfo() 
    {
        System.out.println("Student ID: " + id );
        System.out.println("Student Name: " + name );
        System.out.println("Student Age: " + age );
        System.out.println("Student Course: " + course );
    }

    public static void computeFeePerTerm(double totalTutionFee, double downPayment) 
    {
        double feePerTerm = totalTutionFee/2;
        double credits = totalTutionFee - downPayment;

        System.out.println("Fees per Term: " + feePerTerm);
        System.out.println("Remaining Balance: " + credits);
    }
}
