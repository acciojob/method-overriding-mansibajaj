package com.driver;

public class Main {


    public static void main( String[]arg){
        B b=new B();
        b.meth();
        B b1=new B();
        b1.meth();

        //System.out.println(b.meth());

       // System.out.println("This is sample solution");
    }
     static class A{
     public  String meth(){
         return "Invoking method from class A";

        }
    }
     static class B extends A{
        @Override

        public  String meth(){

            return"Method is overridden in Extended class B";
        }
    }
}
