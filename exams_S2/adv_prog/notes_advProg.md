------------------------------
Write code for Bubble Sort Algo
------------------------------

: assume swap() is already defined / implemented

//outer looop
while( itemSwapped ) {

	//set flag to false
	itemSwapped = false
	
	//inner loop
	for(int i=0, i<array.length; i++)
		//compare first item with second one
		if(array[i]>array[i+1]
			//swap items if first is bigger than second
			swap(array[i], array[i+1])
			//flip the flag 'itemSwapped' to 'true'



}

------------------------------
Insertion Sort
------------------------------

sudo code

     loop i from 1 to length -1
     	  curr = array[i]
	  prev = i - 1

	  as long as ( prev >= 0 && prev > curr) do this
	     //put higher number up a notch
	     array[prev + 1] = array[prev]
	     //decrement counter one down
	     prev = prev -1

	  done
	  //finally insert the number we started with
	  array[prev + 1] = curr

     done
	  

------------------------------
Exception handling concept
------------------------------
Two types:
    checked and unchecked
    	    :unchecked are System Errors and Runtime Exceptions
	    :all other exceptions (IO Exception, ClassNotFoundException etc)
	    
For handling runtime errors (as opposed to syntax or compile error)

Checked exceptions: occur at compile time - they have to be handled, and cannot be ignored
	Example: IOException - file not found

Unchecked exception: occurs at runtime / time of execution of the program. These are ignored at the compilation stage. It's up to the programmer if he/she wants to handle them.
	  Example: NullPointer Exception - trying to access object that is null

Errors: not exceptions, problems that are outside of control of the programmer
	Example: error in JVM itself, OS ran out of memory etc.

All exceptions belong to Class: Exception
Exception class is a subclass of 'Throwable' Class
	   
------------------------------
Threads - priority
------------------------------
Basic info
--------------------

Thread is a lightweight process. Implementation differs from OS to OS.

Task implements Runnable interface;
Task has to have a 'run' method implemented;
Create Thread with Task 'in it'
Start thread which will execute 'run' method

Priority ---
	Each thread has a priority.
	Priorities range between 1 to 10.
	Default priority is 5 (NORM_PRIORITY)
	They are used by scheduler to determine order of thread execution.
	Priority doesn't guarantee thread will be executed first, as there are many factors that affect scheduler.
	Priority can be changed with .setPriority(int priority) method


States:
	New		- thread allocated & waiting for start()
	Runnable	- thread is in ready state OR executing
	Blocked		- thread is waiting for event (example IO)
	Waiting		- thread is waiting as result of .wait()/join()/park() methods
	Terminated	- thread finished


------------------------------
BIG O notation
------------------------------

Describes complexity of an algorithm and how it scales with the amount of data.
4 rules to calculating Big O:
	-ignore constants
	-ignore elements of smaller magnitude (for example n^3 + 2n == O(n^3))
	-different steps get added
	-different inputs -> different variables

Examples:
	loop = n		n
		loop = n	n	n^2
			constant + (c * c) = constant
	loop = n		
			constant * constant = constant

Result: n^2 + n => O(n^2)

------------------------------
Insertion sort algorithm
------------------------------

	value = arr[i] // int i = 1
	prev = arr[j] // int j = i-1

	while( j>=0 && val < prev ){
		set arr[i] = prev
		j--	
	{

	arr[j+1] = value

Example: array {7,6,1,9,3,5}

iteration 1
set val as 6
set prev as 7
compare val to prev
change 6 to 7
decrement j
set 7 to 6
iteration 2
val = 1
prev = 7
set arr[2] = 7
decrement j to 1
compare 1 to 6
set arr[1] = 6
decrement j to 0


-----------------------------
Serialization
-----------------------------

Concept of Serialization & DeSerialization:
	Process of converting object instances into a linear stream of bytes, which then can be sent through socket,
	stored to a file, or manipulated as a stream of data.

	Serialized object is an object represented as a sequence of bytes that include object's data & object's type

	Deserialized object - if object has been serialized and saved to a file, it can be recreated in memory along
				with it's type information & data
				
	Serialization / Deserialization is JVM independed (meaning we can save object on Windows and recreate it in Linux)
	
	
	
Main uses:
	-persistance mechanism ( save to file )
	-communication mechanism ( send objects via sockets )

4 conditions for serialization:
	-object needs to implement Serializable interface
	-object's fields (including other objects) must be serializable
	-superclass state is serializable


------------------------------
Sorting with recursion
------------------------------

Bubble sort - there is no efficiency gain using recursive version of Bubble Sort (which is inefficient as is)

sudo code:

class sort ( array, n ){
	//base condition
	if(n==1)
	return;

	//make a normal iterative pass of Bubble Sort
	//to place largest item at the end
	for ( i=0, i<n-1; i++ )
		if(arr[i] > arr[i+1] )
			swap(i,i+1)

		

	//recursively call function with n -1, th
	sort(arr, n-1)
}


------------------------------
SOCKETS
------------------------------

What is a socket:
	-one of the two end points of a communication link
	-it is bound to a port number
	-socket class represent connection between client and server program
	-throw checked exceptions

Socket has:
	-IP address
	-port number

Types of sockets:
	-Datagram sockets (connectionless sockets - use UDP instead of TCP )
	-Stream sockets ( connection-oriented sockets, use TCP )
	-Raw sockets ( available in routers , transport layer is bypassed )
	
Advantages & disadvantages of sockets:

Sample Server application that prints out input from client:

