SERVER SIDE DEVELOPMENT PROJECT
------------------------------

GROUP E:

Imran Zulfiqar	| x16112369
Witold Zolnowski | x17143853

Murad Oudha | X14115603 [ We were unable to contact Murad -- we assumed he left the course ]

------------------------------
LINKS
------------------------------

Github repo:
https://github.com/witoldzol/store_ruby

Heroku deployment:
https://keychain-shop.herokuapp.com/

Youtube presentation:
https://www.youtube.com/watch?v=lCPqh2X4C0I

------------------------------
Technical specification report
------------------------------

1. Introduction
----------

This project aims at producing a functional web store that is capable of handling user requests and process payments.
It's very basic in design and only most fundamental functionalities have been considered. 
Imran has offered an idea to create a key-chain shop (inspired by his wife's hobby)

2. Model
----------

Given the nature of the shop and products offered, we kept database models very simple.

Tables used: 
- Items: holds information on products offered
- Profiles: holds info on registered users.
	: associated with User. Type of association is one-to-one
- Users: holds registration information on users ( log in information etc )
	: associated with Profiles - one-to-one
	
3. Key Users Flows
----------

**
User Action: Log In
URL: /users/sign_in
Method: login
Precondition: User has to be logged out.
Description: This method new creates session variable for user, redirects user to the profile page & displays the notification on screen informing user that she has logged in.

**
User Action: Log out
URL: /users/sign_out
Method: logout
Preconditions: User has to be logged in.
Description: This method destroys (sets to nil) current session variable, redirects to profile page & displays notification to user that she has logged out.

**
User Action: Go to cart
URL: /cart/index
Method: index
Preconditions: Function available at any time. If user is not logged in, cart will always be empty. If user is an admin, cart will always be empty.
Description: This method redirect user from current location to her shopping cart. Method checks initially if cart session exists, if it doesn't it creates one.

**
User Action: Add item to cart
URL: /cart/:id
Method: add
Preconditions: User has to be logged in, and User cannot be admin.
Description: This method takes an integer parameter ( item id ), checks if cart session exists (creates one if it doesn't exist), and finally creates line item in cart ( or increment exisiting one, if given item already exists in the cart)

**
User Action: Register
URL:  /users/sign_in (POST)
Method: login
Preconditions: User has to be logged out.
Description: This method takes input from user (email & password), validates input, stores it & redirects user to profile creation page. User can enter his/her information on the Profile page.

**
User Action: View item
URL:  /items/:id
Method: show
Preconditions: User can view items at any time. No login required.
Description: This method allows user to view item. After user click on the item pricture, she's redirected to item page, where all the item's relevant information is displayed. 

**
User Action: Add item
URL: /items
Method: create (POST)
Preconditions: User has to be logged in as Admin. Operation available from main page.
Description: This method allows user with admin access to add items & specifiy their details ( title, description, price, and image).

**
User Action: Edit item
URL:  /items/:id/edit
Method: edit
Preconditions: User has to be logged in & have Admin access rights.
Description: This method allows Admin user to edit information about the item. 

**
User Action: Destroy item
URL: /items/:id
Method: destroy (DELETE)
Preconditions: User has to logged in as Admin. Option is available from main page as well as from 'show item' page.
Description: This method removes item from the database & displayes appropriate message to the user once the operation has been completed.

**
User Action: Search for item
URL: items
Method: get
Preconditions: Any user has access to this functionality. User has to be on the main page.
Description: This method takes user input (string) and matches it agains all item's titles. All matches are displayed in descending order. Itemm that failed match test, are not displayed.

**
User Action: View profile
URL: /profiles/signedinuserprofile
Method: index
Preconditions: User has to be signed in.
Description: This method takes user to his / her user profile page.


4. Access control
----------

There are two levels of access:

--User: restrictions on editing items / other user information 

--Admin: restricted from adding items to cart / making purchases

5. 3rd party gems
----------

- rails_12factor | gem to enable deployment to heroku
- bootstrap-sass  | gem that adds bootstrap library to webpages
- devise | user authentication & login functionality


6. External interfaces
----------

No external interfaces implemented


7. Report
----------

a) Describe implementation
__________

We decided to use Git for version control, Github for code backup & Heroku for hosting.
Once we have agreed on what ruby & rails version we should use, we split the work between ourselves.
Imran took upon himself to look after project proposal, came up with shop idea and name, and was in charge of front end for About Us & Contact Us pages.
Witold was in charge of setting up application, models, controllers, views, stylesheets, configuration of sass, version control, deployment of the app, technical report, and presentation video.
We deployed app on Heroku early on, to ensure that there would be no issues down the road.
Development process adhered to philosophy of incremental progress. We pushed every incremental functionality / segment of application separately.
We sticked to incremental development in order to avoid loosing progress in case something went wrong. It also made things easier to roll back changes, and made the whole process more manageable.
In terms of development tools, we decided to use Bootstrap framework to speed up the development of front end deliverables. In case of 'external' gems,  we relied on devise to handle users & access.

b) What issues you encountered & how you resolved them
__________

We predicted initially that the whole process shouldn't take more than one week. We underestimated issues that we would encounter, which resulted in significant extensions to the timeframe. Very early on, Witold decided to follow an online guide on how to set up the whole project. Unfortunately the guide turned out to be incomplete, and was missing crucial modules /element. This resulted in loss of two days. Witold rebooted the whole project, this time basing it on the guides available on the NCI course. This turned out to be a good decision, as it allowed us to progress with the whole project without major setbacks.
There was a number of issues that we grappled with:
1) We spend significant amount of time trying to figure out why our work isn't being reflected when refreshing webpage. Turned out that any changes to database / models require local server to be restarted.
2) We lacked experience with github, and wasted fair amount of time trying to figure out how to manage branches and commits. In the end we decided that the learning process was taking too long. Witold was in charge of commiting to single branch (master), and Imran shared his deliverables via email to Witold for subsequent commit.
3) Adding Bootstrap to our project turned out to be more complicated that expected. For some reason, bootstrap script was not being linked to view's. We ended up manually adding a link to cdn for Bootstrap files. Further, we spend some time trying to set up SaSS version of the CSS and precompiler for it. We managed to find solutions on how to set up config file on StackOverflow.
4) It took us fair amount of time to realize that after deploying site to Heroku, we still had to do the model migrations on Heroku itself to reflect any changes made on the local machines. 
5) One of the major setback was when we realized that Heroku requires Postgress database, and our application was running on sqlite. Witold spend whole day trying to migrate our database to postgres. The whole process turned out to be lengthy an convoluted. Despite transferring data to postgress, data was still not migrating to Heroku. In the end we had to rollback whole day's work ( git turned out to be a life saver in this instance ) and recreate data on Herolu manually.

c) What features you decided not to implement & why
__________

Because our group comprised of only two people, and we haven't allocated enough time for the project ( we were overly optimistic in our predictions ), we had to make drastic cuts to functionalities that would be implemented. We decided that front end should be kept to absolute minimum to save on time, with very basic styles. Further, we had to abandon the payments module. We intended to use stripe for payments processing, unfortunately due to time constraints we had to abandon it. Further, our model structure is very basic and bare bones.


REFERENCES
------------------------------

Contact form  (html / css) obtained from:
	https://codepen.io/stephanrusu/pen/QwKLJX