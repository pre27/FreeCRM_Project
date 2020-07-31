Feature: validate crmsite functionality

Scenario: Login into site
Given launch browser and get url
When to get title
Then enter username and password
Then clcik login

Scenario: CasesPage Validation
When Clicking on navigation menu
Then Click View drop down 
And Show Filters
Then Click New
Then Export  



Scenario: ContactPage Validation
When to select contact in dashboard
Then select new
Then enter firstname,lastname,email
Then select category
Then select status
Then select zone
Then select date
Then select month
Then select year
Then upload image
And save the page
Then take screenshot 
