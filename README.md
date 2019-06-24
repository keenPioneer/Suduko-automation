# Suduko-automation
automating suduko using pure java
Here I have made a grid of 9x9 jButtons which have already been assosiated with respective events and everything else.
The User Can use a newspaper or someother source to input a suduko puzzle (unsolved) which should be solved using the chk button on the left top.
Also the reset button following the chk button is used to reset all the suduko buttons to blank(obvious). 
Now I have Been working on how the program should solve the suduko. 
Firstly i simply create simple algorithm which checks all the values from 1 to 9 in each box of the suduko and if only one of those value is salisfied and none else then it will asign that value to that box. ofcourse this didnt always solved the suduko completely because of the 3x3 grid concept ignored in it. But later i added that instead of checking all the values from 1 to 9, it only checks those values which are not present in that grid of that button.
