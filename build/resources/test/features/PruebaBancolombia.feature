#autor: luis moreno

  @stories
  Feature: academy choucair
    as a user, i want create a user in the page utest

  @scenario1
  Scenario: Create new user
    Given than luis wants create a new user
    When he register in the page utest
    |strFirstName|strLastName|strEmail               |strMonth|strDay|strYear|strCity |strCodePostal|strPassword   |
    |luis        |moreno     |luismoreno343@gmail.com|August  |7     |1997   |Medellín|050043       |LuisMoreno7700|
    Then he will have a new user in the page
    |strText                                             |
    |Welcome to the world's largest community of testers.|