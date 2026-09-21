# RESUFF25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Gym Eligibility

This program takes a user's details and determines their eligibility for gym entry based on their  **age, membership status**, and whether they are  **accompanied by a member**. The program uses an  **if-else statement**  to check these conditions.

 **Input:** 

- age (an integer)
- hasMembershipCard (a boolean)
- isAccompaniedByMember (a boolean)
- isBanned (a boolean).

 **Condition:** 

- If the user is banned, print: "Not eligible for gym entry due to ban."
- If the user is 18 or older and has a membership card, print: "Eligible for gym entry with a membership card."
- If the user is 18 or older and is accompanied by a member, print: "Eligible for gym entry when accompanied by a member."
- If none of the conditions are met, print: "Not eligible for gym entry."
### Sample 1:
Input
Output

```
20
false
true 
true
```

```
Not eligible for gym entry due to ban.
```

### Sample 2:
Input
Output

```
20
true
true 
false
```

```
Eligible for gym entry with a membership card.
```

### Sample 3:
Input
Output

```
20
false
true 
false
```

```
Eligible for gym entry when accompanied by a member.
```

### Sample 4:
Input
Output

```
16
false
true 
false
```

```
Not eligible for gym entry.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T16:11:02.817Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF25)