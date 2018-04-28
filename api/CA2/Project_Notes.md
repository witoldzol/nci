API Continuous Assesment 2
______________________________

Group: G

Witold Zolnowski	17143853
Imran Zulfiqar		16112369
Gheorghe Strugaru	16112385
Murad Oudha		14115603


Work done:
______________________________

Witold Zolnwski: Deliverables: 1,2,3,4,5,6

Imran, Gheorge, Murad: no work done.

Notes:
I've communicated with others (except Murad, who wouldn't even answer emails).
We've split the work between ourselves and agreed on the deadline. I've received no response by the deadline, so I've finished all deliverables myself and submitted.
______________________________       


Deliverable nb. 6

cUrl commands
------------------------------

GET all records:
	curl -i -H "Accept: application/json" "http://localhost:49000/api/books"

GET single record:
    	curl -i -H "Accept: application/json" "http://localhost:49000/api/books/1"

POST record:
     curl -X POST \
     http://localhost:49000/api/books/save \
       -H 'cache-control: no-cache' \
         -H 'content-type: application/json' \
	   -d '{
	
		"title" : "Father Ted the Book of Genesis",
		"author" : "that guy",
		"publisher" : "Seriously Serious Books"
		}'

DELETE record:

       curl -X DELETE \
       	 http://localhost:49000/api/books/remove/2 -H 'cache-control: no-cache' \
 	 