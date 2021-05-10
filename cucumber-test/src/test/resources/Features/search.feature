Feature: To test the search 

Scenario Outline: search Functionality

Given :navigates to the google page
When : user enters  data "<link>"in search box

Examples:
|   link   |
|developer |
|tester    |
|automation|
|software  |
|hardware  |
|telecom   |
|facebook  |
|twitter   |
|linkdin   |
|whatsapp  |
