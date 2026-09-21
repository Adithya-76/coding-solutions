import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt(); // User's age
        boolean hasMembershipCard = sc.nextBoolean(); 
        boolean isAccompaniedByMember = sc.nextBoolean(); 
        boolean isBanned = sc.nextBoolean(); 

        // Check if the user has been banned
        if(isBanned == true){
            System.out.println("Not eligible for gym entry due to ban.");
        }



       // Check if the user is at least 18 years old and has a membership card
       else if(age>=18 && hasMembershipCard == true){
           System.out.println("Eligible for gym entry with a membership card.");
       }



        // Check if the user is at least 18 years old and accompanied by a member
        else if(age>=18 && isAccompaniedByMember == true){
            System.out.println("Eligible for gym entry when accompanied by a member.");
        }



       // If the user does not meet any eligibility criteria
        else {
            System.out.println("Not eligible for gym entry.");
        }
    }
}
