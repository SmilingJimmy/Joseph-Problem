#Joseph Problem
#adapted from the final exam of PUB142: Java Programming in last June
#copyright@Smiling Jimmy

#Suppose there are M kids (numbered 1-M) in a circle.
#Now the first kid begins to number off one by one from 1
#KidA who yells out N is to leave the circle, actually if M>N, N is the one to leave
#Then the kid next to KidA begin to number off one by one from 1
#KidB who yells out N is to leave the circle, actually if M>2N, 2N is the one to leave
#Then the kid next to KidB begin to number off one by one from 1
#......
#until no kids are in the circle
#What is the order of the kids to leaving the circle?


#input M
total_number=int(input("How many kids are there in a circle? "))

#create a list of M kids; if the particular kid is in the circle, his/her status is True
kids=[True for index in range(1,total_number+1)]

#input N
leaving_number=int(input("What is the leaving number? "))

#everyone is in the circle at the beginning
left_number=total_number

#counter is to count 1-N, to decide which to leave the circle
counter=0

#index represents the kids' number (1-M), beginning from 1
index=1

#They begin to leave the circle!
print("Here is the leaving order!".center(50,"="))

#the loop stops when left_number==0
while left_number>=1:
    #when this particular kid is in the circle (True)
    if kids[index-1]==True:
        counter+=1
        #when this particular kid is to leave the circle
        if counter==leaving_number:
            counter=0
            kids[index-1]=False
            print(index)
            left_number-=1
    #next kid
    index+=1
    #back to the first kid if index>M
    if index==total_number+1:
        index=1
    
