Feature: The product consists of a news portal, that lists articles sorted by publication date on the homepage.


Scenario Outline: Articles by category
 Given the user accesses the category <category>
 Then  the site must list all os articles related to the selected category 
 Examples:
 | category  | 
 | POLITICS  |
 | BUSINESS  | 
 | TECH      |
 | SCIENCE   |
 | SPORTS    |   

Scenario Outline: Category empt
 Given the user accesses the category <category>
 And   the category no have articles
 Then  the site must display a  blank state message 
Examples:
 | category  | 
 | POLITICS  |
 | BUSINESS  | 
 | TECH      |
 | SCIENCE   |
 | SPORTS    |   

Scenario: User logs in to the site
 Given the user log in to the site witch your e-mail
 When  acess your account  
 Then  the site must to allow the user selected one our more category of your preference 
 And   the site must direct user for the homepage

 Scenario: User accesses the site through mobile devices
 Given the user acess the site through a movel device 
 When  show the site 
 Then  the site mus show the menu hamburguer with options of the site

 Scenario: Messages in the site 
 Given the user browse in the site 
 When  effect some action that be alert ou suport
 Then the site must messages of alert ou suport 

 Scenario: Loaders of the site
 Given the user browser in the site 
 When  effect some action 
 And   the server to take for reply
 Then  the site must show loaders indicanting it is loading 

