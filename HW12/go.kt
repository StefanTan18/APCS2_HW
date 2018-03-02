Stefan Tan
APCS2 pd1
HW12 -- +3R|\/|1|\|4|_  1|_|_|\|3$$
2018-03-01

Q0: What do you make of the multiple class definitions in a single .java file?
I believe the classes that don't have protection can only be accessed by the
class by the class with the protection. 

Q1: How are the command line arguments processed?
The command line take in the args as an array of Stringsseperated by the
spaces. The arguments can be accessed performing methods on the array args. 

Q2: What happens if no command line arguments are given?
If no command line arguments are given, then the code is ran using the defaults
values for boardsize and delay that is in the code.

Q3: What is the nature/purpose of the recursion? Is it necessary for the
animation?
The recursion is used to print a number that increments on a position on the
board and updates the board. By updating the board, the animation occurs.
Recursion is not necessarily needed for the animation as any type of loops can
make the animation.

Q4: What do you expect to see when you run it?
I expect to see the board with the board being updated incrementally with delays
between each update. 

Q5: What does ANSI stand for? (You are permitted some intertubes searching
here…). What is it good for?
ANSI stands for American National Standards Institute. It is a set of commands
that is used to control the options of the terminal such as cursor location and
color.

Q7: How did your expectations compare to your observations?
The code ran just like I expected. The output shows the board being updated each
time with a delay in between the updates. 

Q8: How might you adapt this framework to animate a probing for a Knight’s Tour?
We can use this framework so that each time the board updates each time the
knight moves or whenever the knight's move has to be undo until either the
knight has no moves left or the knight has visited every square.

ALGORITHM FOR KNIGHT'S TOUR
1. Checks if the the knight has visited all the squares by seeing if the knight
had made n*n moves.

2. If it is true then that is the solution.

3. If it is false then move the knight and recursively check it this move leads
to a solution.

4. If it doesn't lead to the solution then undo that move and have the knight
make another possible move. 

5. If none of the possible moves work then it is impossible. 
