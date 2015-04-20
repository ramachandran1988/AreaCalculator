package com.example.ram;

/**
 * Created by Ravi on 20-Apr-15.
 */
public class AreaCalculator {
    public static void main(String[] args) {
       if(args!=null){
           int argLength = args.length;
           switch (argLength){
               case 1 :
                   int side = Integer.parseInt(args[0]);
                   System.out.println("Area of square is : " + (side * side) );
               break;
               case 2:
                   int length = Integer.parseInt(args[0]);
                   int breadth = Integer.parseInt(args[1]);
                   System.out.println("Area of Rectangle is " + (length * breadth));
                   break;
           }
       }
        else
       {
           System.out.println("Please enter the input as arguments");
       }
    }
}
