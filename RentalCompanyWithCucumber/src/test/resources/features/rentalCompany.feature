Feature: Rent movie
	As an user
	I want to register movies rental
	To control prices and delivery dates 
	
Scenario: Should rent a movie with success
	Given a movie with stock of 2 units
	And that the rent price is R$ 3
	When rent
	Then the rent price will be R$ 3
	And the delivery date will be in the next day
	And the movie stock will be 1 unity
	
Scenario: Should not rent movies without stock 
	Given a movie with stock of 0 units
	When rent
	Then should not be possible rent for lack of stock
	And the movie stock will be 0 units

Scenario: Should give special conditions for extended category 
	Given a movie with stock of 2 units
	And that the rent price is R$ 4
	And that the rent type is "extended"
	When rent
	Then the rent price will be R$ 8
	And the delivery date will be in 3 days
	And the received pontuation will be of 2 points
	
	
Scenario: Should not allow rent of adult movies for underage people
  Given that the person who will rent is "underage"
  And that the movie classification is "18+"
  When rent
  Then should not be possible rent the adult movie 
 

 Scenario: Should not allow rent when the person money is not enough
  Given that the person has R$ 5 to rent a movie
  And that the movie rent price is R$ 8
  When rent
  Then should not be possible rent movie because money is not enough 
	