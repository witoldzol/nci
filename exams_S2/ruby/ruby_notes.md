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
	gives us: Class name , object id, instance !!! (only) variables 

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

Type of framework designed to help developers to build web applications. They ususally provide functionalities
common to web applications:
	-session management
	-data persistance
	-templating systems

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

A way of separating logiacally different responsabilities of the application.
	Responsabilities:
		M: represents data stored in objects
		V: represents visualization of the data that models contain
		C: acts on both model and views. Controls how data flows and updates the view whenever data changes
				Routing: mapping requested URL to code responsible for generating associated HTML
				essentially:	( hook up URL to relevant function )


------------------------------
What to consider when choosing framework
------------------------------
-language
-learning curve
-updates (does it update regularly)
-provided functionalities
-community / available documentation

------------------------------
LAMP STACK
------------------------------
Linux
Apache
MySql
PHP ( Perl / Python )

----------------------------------------
UNIT TESTING
----------------------------------------

Unit tests are code that tests and makes assertions about code.
In unit testing, we take a little part of code, say a method of a model, and test its inputs and outputs.
Unit tests are your friend. 


------------------
What is a Web Framework
-----------------
 
-framework for developing web applications
-provides abstraction of many low level functions ( setting up structure, dealing with specific routings etc)
-increases productivity as long as user follows the internal rules governing the framework
-Rails follows Convention over Configuration rule for example ( rails is opinionated )
       : instead of configuring apps , user follows conventional rules ( for example file naming rules,
       or where to keep certain files) in order not have to create config files ( because most things are
       already pre configured )
       this increases speed and productivity at the cost of flexibility
-enforces good desing practices, like separation of duties in MVC model
 
------------------------------
Object Oriented Concept
------------------------------
 
OOP is a prgramming paradigm based on concept of 'objects'.
Objects are collections of data that have attributes ( fields ) / procedures ( methods)
Feature of objects is that methods can access them and change their state / attributes
In OOP applications / programs are made out of objects interacting with one another
Objects  are instances of classes ( Class is a template, and object is a actual element based on that schema)
 
 
 
----------
Rails commands
----------
 
Create new project~
       rails new <Name>
 
Start server
      rails s -i $IP -p $PORT
 
Generate controller
      rails generate controller Catalog_Items index show new edit
 
Generate scaffold
      rails generate scaffold Disc (SINGULAR) name:string band:string year:integer price:decimal producer:string

      : generates model / view / migration / tests / controller for given RESOURCE 

Destroy scaffold
	rails destroy scaffold ModelName (singular)
	
Install all dependencies specified in gemfile
      bundle install

Associations (MODELS)
has_one
	Example:
		Class User < ActiveRecord::Base
			has_one :profile
		end

		Class Profile < ActiveRecord::Base
			belongs_to :user
		end



--------------------
Ruby output
--------------------
 
> puts 1.class
>Fixnum
> =>nil
 
> puts 1.12.class
> Float
> =>nil
 
> puts "dkfjfdl".class
> String
> =>nil
 
(every method returns something in Ruby // )
 
// get array size
array.length
 
// check if array length equals given number
a.length.eql? 100
 
//check if array contains element
a=[1,2,3,4]
a.count(1)
 
//count how many items are divisible by 2
a.count{ |x| x % 2 == 0 }
> =>2
 
//is array empty
a.empty?

