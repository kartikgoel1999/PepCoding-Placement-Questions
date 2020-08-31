import java.util.*;
  
  public class isPrimeApproach2{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       for(int i = 0;i < t;i++){
           int n = scn.nextInt();
           
           int count=0;
           for(int div =2;div*div <= n;div++){  
	   //efficient approach checkingtill root n and starting from 2
               if(n % div == 0){
                  count++; 
                  break;
				  // 12->1,2,3,4,12 once it checks for 2 and increments count no need to check for rest numbers
               }
           }
           if(count == 0){
               System.out.println("prime");
           }
           else{
              System.out.println("not prime"); 
           }
       }
  
   }
  }