Feature: validate crmsite functionality

Scenario: Login into site
Given launch browser and get url
When to get title
Then enter username and password
Then clcik login
#
#Scenario: CasesPage Validation
#When Clicking on navigation menu
#Then Click View drop down 
#And Show Filters
#Then Click New
#Then Export  


Scenario: DealPage Validation
When Click on Deal Menu
Then Click on pipeline
Then Click on Navbuttons
Then Click on New 
Then Enter Title and company name
Then Choose closedate
Then save

Scenario: CasesPage Validation
When Clicking on navigation menu
Then Click View drop down 
And Show Filters
Then Click New



Scenario: NewCasesPage Validation 
Then Enter Title,Company,Description,Contact,Deal,Identifier,Tags
And select Assigned To, Type, Priority, Status
Then Input Deadline Date and Close Date





Then Export  

Scenario: Create New Campaign
When Logged in
When Clicking on Campagign menu
Then Click New Campaign
And Enter details
Then Click Save

