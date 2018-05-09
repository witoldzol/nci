------------------------------
RUBY
------------------------------

Notes

1. variable names that start with special chars denoting their scope have to be preserved when calling back the variable
   example: declaration--- $variable1, later on call it back: puts $variable1 (not variable1)

2. iterating over an array doesn't apply changes to it 
             arr = [1,2,3]
             arr.each do |x| x=x*2 end 
   this will only output (if you put in 'puts') the transient result

3. iterating over hash: use |key,val| NOT |key.val| (comma not dot notation), also you might need to use interpolation
                  puts "#{val}"   	   (remember to use the quotes first!}

4. put curly brackets when executing if statement, example:  
   	     	  hash.delete_if{|key, val| val==1}

5. method .inspect outputs an object in human readable form ( it uses to_s method if not overriden)

6. iterate over hash :
			hash.each do |x, y| puts "key: #{x} , value: #{y}" end

7. iterate over hash with if statements
			a= {"a"=>:splendid, "b"=>:medium, "c"=>:lame}
			b={}
			
			a.each{ |key, val| if val==:splendid then b[val]=3 elsif val==:medium then b[val]=2 end}
			b
			=> {:lame=>1, :medium=>2, :splendid=>3} 
			
			this will populate other has based on conditions
			REMEMBER: it is ELSIF not ELSEIF !!!!!!!!!!!!!!!!!!
			also there is THEN after each condition (tutuorials don't mention it)

8. :<name> are SYMBOLS, each symbol have the same object_id ( every time you crete object, it gets separate id because
								its a separate instance, SYMBOLS don't, they are very
								memory efficient because of that)



----------------------------------------
COMMANDS
------------------------------
//create new rails app
	rails new MusicBusters
//start server on given ip and port
	rails server -b $IP -p $PORT
//generate controller (remember Capital Letters - name of controler, lower case methods, NO COMMAS !)
	rails generate controller Catalog_Items index show new edit
//generate scaffolding	( NAME start with capital, fields lower case, NO COMMAS)
	rails generate scaffold Discs name:string band:string year:date price:integer producer:string

-------------------------------------------------- THEORY QUESTIONS --------------------------------------------------
----------------------------------------------------------------------------------------------------------------------


-------------------------------
What is a Web Framework
-------------------------------

Provides:
	-framework for building web applications
	-pre defined configuration
	-can be opinionated (makes assumptions : rails / ember) convention over configuration
		this removes decision making but constricts choices

	-includes all necessary files and dependencies
	-often abstracts away a lot of mundane tasks
	-can write code for developer (metaprogramming)
	-provides boilerplates / templates for developers which saves time
	-can include other frameworks like:
		Active record:
			-ORM ( object relational mapper ) which handles calls to database ( does it for you )


Purpose:
	-to hide boilerplate and 'infrastructure' related to handling HTTP requests & responses.
	-essentially: 1) RECEIVE HTTP request
		      2) Run RELEVANT code for given request
		      3) Create and dispatch HTTP response with content


----------------------------------------
MVC
----------------------------------------

A way of separating logiaclly different responsabilities of the application.
	Responsabilities:
		M: deal with data
		V: display requested info
		C: calculate / route / operate on models
			Routing: mapping requested URL to code responsible for generating associated HTML
				essentially:	( hook up URL to relevant function )





----------------------------------------
UNIT TESTING
----------------------------------------

Unit tests are code that tests and makes assertions about code.
In unit testing, we take a little part of code, say a method of a model, and test its inputs and outputs.
Unit tests are your friend. 

------------------------------
Object Oriented Programming
------------------------------

Object is an encapsulation of data (related state and behaviour)
Object has:
       -identity (unique reference number, ex. object id in ruby)
       -state ( variables)
       -behaviour (methods)

Object is an instance of a class. Class is often called ADT (abstract data type)

Class vs Object:

concept / a phenomenon
part of a program / part of data and a program execution
description of common properties / representation of properties in a single instance

Objects are created from classes.
Class contains receipe on how to create an object.


------------------------------
Encapsulation
	Internal representation of an object is hidden from the outside.
	Only the object can interact with its own internal data.
	Public methods allow external world to interact with class.
	Encapsulation decreases system complexity (black box - i don't need to know,
		how clas implements / does things, I just execute method and stuff happens).
	Encaplusation increases system roboustness.
	
------------------------------
Inheritance
	Defines relationship between two classes. Class inherits features of it's parent.
	Methods from parent can be overriden, new methods /logic can be added.
	Promotes specialization.
	Class can only inherit from only one Class (in ruby, unlike in C++)

	Example
		class Cat < Animal
		      def makeSound
		      end
		end
------------------------------
Polymorphism
	Ability to send the same message to different objects and get different results.
	Can be achieved through inheritance, where two classes that inherit from same parent, implement same method differently
	Duck typing example
	     Class Parser
	     	   def parse(parser)
		       parser.parse
		   end
	     end

	     Class Xml
	     	   def parse
		       puts 'im xml'
		   end
	     end
   	     Class Json
	     	   def parse
		       puts 'im json'
		   end
	     end

	     Application:
	     
	     parser = Parser.new
	     parser.parse(Xml.new)
		       
------------------------------
