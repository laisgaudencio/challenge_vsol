# challenge_cheeseCake
Automate cases test challenge Chesse Cake Lab

<p><strong>Feature:</strong>The product consists of a news portal, that lists articles sorted by publication date on the homepage.</p>
</br>
</br>

<strong>Scenario Outline:</strong> Articles by category </br>
 Given the user accesses the category <category> </br>
 Then  the site must list all os articles related to the selected category </br>
 Examples: </br>
 | category  | </br>
 | POLITICS  | </br>
 | BUSINESS  | </br>
 | TECH      | </br>
 | SCIENCE   | </br>
 | SPORTS    | </br>
 </br>
 
 <strong>Scenario Outline:</strong> Category empt </br>
 Given the user accesses the category <category>  </br>
 And   the category no have articles  </br>
 Then  the site must display a  blank state message  </br>
 Examples: </br>
 | category  | </br>
 | POLITICS  | </br>
 | BUSINESS  | </br>
 | TECH      | </br>
 | SCIENCE   | </br>
 | SPORTS    | </br>
 </br>

<strong>Scenario:</strong> User logs in to the site </br>
 Given the user log in to the site witch your e-mail </br>
 When  acess your account </br>
 Then  the site must to allow the user selected one our more category of your preference </br>
 And   the site must direct user for the homepage </br>
 </br>
 
 <strong>Scenario:</strong> User accesses the site through mobile devices </br>
 Given the user acess the site through a movel device </br>
 When  show the site </br>
 Then  the site mus show the menu hamburguer with options of the site </br>
 </br>
 
 <strong>Scenario:</strong> Messages in the site </br>
 Given the user browse in the site </br>
 When  effect some action that be alert ou suport </br>
 Then the site must messages of alert ou suport </br>
 </br>
 
 <strong>Scenario:</strong> Loaders of the site </br>
 Given the user browser in the site </br>
 When  effect some action </br>
 And   the server to take for reply </br>
 Then  the site must show loaders indicanting it is loading </br>
 </br>