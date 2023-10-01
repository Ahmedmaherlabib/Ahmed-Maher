
Feature: user can search for item
  Scenario: search for item
  Given user go to url
  When user press on search field
  Then user could type item name
  Then user click Enter button
    Then url contain the item name

