Feature: Login tests


  @AceLogin
  Scenario: Login to Ace App and create minutas
    Given User login to Ace App with username "acetest" and password "123456"
		Then Click on Dashborad Menu list 
		Then Click on Auto
		Then User clicks on New Auto creation
		And Fill the deatils in auto creation page