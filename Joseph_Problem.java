//Joseph Problem
//adapted from the final exam of PUB142: Java Programming in last June
//copyright@Smiling Jimmy

//Suppose there are M kids (numbered 1-M) in a circle.
//Now the first kid begins to number off one by one from 1
//KidA who yells out N is to leave the circle, actually if M>N, N is the one to leave
//Then the kid next to KidA begin to number off one by one from 1
//KidB who yells out N is to leave the circle, actually if M>2N, 2N is the one to leave
//Then the kid next to KidB begin to number off one by one from 1
//......
//until no kids are in the circle
//What is the order of the kids to leaving the circle?



import java.util.Scanner;


public class Kids{
private static Scanner input=new Scanner(System.in);
private static boolean[] status;

public static void main(String[] args){

//input M
System.out.print("How many kids are there in a circle? ");
int totalNumber=input.nextInt();
status= new boolean[totalNumber];

//create a list of M kids; if the particular kid is in the circle, his/her status is true
for(int count=0;count<status.length;count++){
status[count]=true;
}

//input N
System.out.print("What is the number for leaving the circle? ");
int leavingNumber=input.nextInt();
System.out.println("Here is the leaving order!");

//everyone is in the circle at the beginning
int leftNumber=totalNumber;

//counter is to count 1-N, to decide which to leave the circle
int counter=0;

//index represents the kids' number (1-M), beginning from 1
int index=1;

//They begin to leave the circle!
//the loop stops when left_number==0
while(leftNumber>=1){

//when this particular kid is in the circle (true)
if(status[index-1]==true){
counter++;

//when this particular kid is to leave the circle
if(counter==leavingNumber) {
counter=0;
status[index-1]=false;
System.out.println(index);
leftNumber--;
}
}

//next kid
index++;

//back to the first kid if index>M
if(index==totalNumber+1)index=1;
}
}
}
