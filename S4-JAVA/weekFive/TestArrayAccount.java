package weekFive;

import java.util.Scanner;

// ARRAYS ARRAYS ARRAYS ARRAYS

public class TestArrayAccount {
    public static void
     main(String[] args){
        // Objects
        // ArrayAccount A1 = new ArrayAccount("d10", "George", 10000);
        // ArrayAccount Ainee = new ArrayAccount ("007", "Ainee", 1000);
        // ArrayAccount George = new ArrayAccount ("008", "George", 500);
        // Ainee.TransferTO(George, 500);
        // System.out.println("the account details are:" + A1);
        // System.out.println("the account details are:" + Ainee);
        // System.out.println("the account details are:" + George);
        
        // ARRAYS ARRAYS ARRAYS ARRAYS 
        
        // this is creating an array with all indices of value 0
        Scanner in = new Scanner(System.in);
        in.close();
        // int c[] = new int[10]; // 10 is the size of the array

        // c[0] = 10;
        // c[1] = 20;
        
        

        // remember that at the time of creation your array needs to specify the length or be hardcoded  

        // c[0] = 20;

        // the loop accessing the Scanner object allowing the user to make inputs 
        // outputs the entered values to the terminal as an array

        // SECONDARY DEPTH OF CONCEPT IS NOW SENDING THIS ARRAY TO A METHOD TO CALCULATE THE SUM AND AVERAGE 
        // for(int i = 0;i<10;i++){
        //     c[i] = in.nextInt();
            
        // }

        //////////////////////////////////////////////////

        // REMEMBER TO CALL THE METHODS OR NOTHING WILL RUN
        // this is creating an array with hard coded values initialized indice by indice 
        int c[] = {10,20,30,40,50,60,70,80,90,0}; 
        // Largest(c);
        // SqCu(c);
        // SumAvg(c);
        Increment(c);
        ////////////////////////////////////////////////////
    }
        
        public static void SumAvg(int a[]){
            int sum = 0;
            float avg = 0.0f;
            System.out.println(a.length);
            for(int i = 0; i<a.length; i++){
                
                sum = sum + a[i];
                
            }
            avg = sum/a.length;
            
            System.out.println("Sum = " + sum + " Average = " + avg);

        }
        public static void Increment(int a[]){
            for (int i =0; i<a.length; i++){
                a[i] = a[i] + 1;
            }
            for (int i =0; i<a.length; i++){
                System.out.println(a[i]);
            }
        }
        public static void SqCu(int a[]){
            int square[] = new int[a.length];
            int cube[] = new int[a.length];
            for(int i = 0;i<a.length;i++){

                square[i] = a[i] * a[i];
                cube[i] = a[i] * a[i] * a[i];
               }
               for(int i = 0;i<a.length;i++){
                System.out.println(a[i] + "   " + square[i] + "   " + cube[i]);}

        }
        // public static void Largest(int a[]){
        //     for (int i=0; i<a.length; i++){
        //         int max = 0;
        //         int index = 0;
        //         if(a[i]>max){
                   
        //             max = a[i];
        //             index = i;
        //             for(int i; i<a.length ;i++){ // can't get print statement working 
        //                 System.out.println(a[i]);
        //             }
        //         }
                
        //     }
            
        // }
    }

        // System.out.println("you entered ");
        // in.close();
        
        // // once your array is created you can use a loop to access each index and print it on the screen 
        // for(int i = 0;i<10;i++){
        //     System.out.println(c[i]);
        // }
    

                

        