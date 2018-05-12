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

Thread is a lightweight process. Implementation differs from OS to OS.

Task implements Runnable interface;
Task has to have a 'run' method implemented;
Create Thread with Task 'in it'
Start thread which will execute 'run' method

Priority ---
	 can be reset using setPriority(int priority) method
	 Constants: Thread.MIN_PRIORITY

States:
	New		- thread allocated & waiting for start()
	Runnable	- thread is in ready state OR executing
	Blocked		- thread is waiting for event (example IO)
	Waiting		- thread is waiting as result of .wait()/join()/park() methods
	Terminated	- thread finished


	