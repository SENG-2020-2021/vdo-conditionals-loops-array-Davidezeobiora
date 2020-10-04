class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
    byte[] daysofthemonthdebtordefaulted={10,15,18,24,28,};
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
    float amountdebtorpayPerDay= 100f;
   float amountDebtorPaid= 450f;
   // declare all the variables needed for your calculations
   float totalAmount=0f;
  byte amountOfDays=0;
  byte daysDebtorPaidFor=0;
  float temp= amountDebtorPaid;
  float amountleftToPay=0f;
  float extra=0f;
   // calculate and print total amount the debtor is to pay using for each loop
   for (byte k:daysofthemonthdebtordefaulted){
    totalAmount=totalAmount+amountdebtorpayPerDay;

    amountOfDays++;
  }
   System.out.println("the number of days is " + amountOfDays);
  System.out.println("the total amount to pay is "+        totalAmount);
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
 
   for(int k=0; k<amountOfDays; k++){

     if(temp>=amountdebtorpayPerDay){
       temp =temp - amountdebtorpayPerDay;
       daysDebtorPaidFor++;
     }
     
     else if(temp<amountdebtorpayPerDay){
       break;
     }
   }

   for(int k=0;k<daysDebtorPaidFor;k++){
      System.out.println("The debtor paid for day " + daysofthemonthdebtordefaulted[k]);
   }

   if(amountDebtorPaid%amountdebtorpayPerDay>0&&amountDebtorPaid<totalAmount){
     System.out.println("The days that was not completely paid for is day "+daysofthemonthdebtordefaulted[daysDebtorPaidFor]);System.out.println("The amount left  to complete it is " +(amountdebtorpayPerDay-    (amountDebtorPaid%amountdebtorpayPerDay)));
   }
   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if(amountDebtorPaid<totalAmount){
     amountleftToPay=totalAmount-amountDebtorPaid;
     System.out.println("the amount left to pay is " +  amountleftToPay);
   }
   else if(amountDebtorPaid>totalAmount){
       extra=amountDebtorPaid-totalAmount;
       System.out.println("the amount you are being owed is " + extra);

     }
   else if(amountDebtorPaid==totalAmount){
     System.out.println("you have paid the exact amount");
   } 
   //kindly remove the statement below when you are done with the assignment
    
  }
}