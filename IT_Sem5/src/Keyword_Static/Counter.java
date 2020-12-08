package Keyword_Static;

class Counter {
    //will get memory each time when the instance is created
    final int a = 10;
    static int count=0;
    Counter(){
        //incrementing value of count
        count++;
        //a = 20;
        System.out.println(count);
    }
    public static void main(String args[]){
        //Creating objects
        Counter c1=new Counter();		
        Counter c2=new Counter();
        Counter c3=new Counter();	}}
