import java.util.Scanner;
public class RideBillCalculator {
	public static void main(String[] args) {
        int total=0;
        System.out.print("Enter the height in cm: ");
		Scanner sc =new Scanner(System.in);
        int height = sc.nextInt();

        if(height<120) {
			System.out.println("Can't Ride");
		}
        
        else{
            System.out.println("Can ride");
            System.out.print("Enter your age in yrs: ");
            int age=sc.nextInt();

            if(age<12){
                total=5;
            }
            else if(age>=12 && age<18){
                total=7;
            }
            else if(age>=18 && age<45){
                total=12;
            }
            else if(age>=45 && age<=55){
                total=0;
            }
            else{
                System.out.println("INVALID INPUT");
				System.exit(0);
            }
			

            System.out.print("Want Photos?");
            String yesOrNo=sc.next();
            if(yesOrNo.equalsIgnoreCase("yes")){
                total=total+3;
                System.out.println("The total bill is : $"+total);
            }
            else if(yesOrNo.equalsIgnoreCase("no")){
                System.out.println("The total bill is : $"+total);
            }
            else{
                System.out.println("INVALID INPUT");
            }
        }   
    }
}