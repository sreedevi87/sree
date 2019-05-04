 Feature: login functionality of application
 
 @Automated
 Scenario:Verfication of login button
 Given Open the chrome and launch the application
 When application opened
 Then verifying the title whether it has correct title OrangeHRM - New Level of HR Management
 Then Enter the Username and Password
 Then login is successful
 Then verifying the title whether it has correct title
 Then Verify Username text
 Then VerifyTextPresent
 Then selectframe
 #Then clickView
 Then exitframe
 Then PIM Main menu link
 Then selectingframe
 And Entering firstname and lastname
 Then verify logout
 Then teardown
 
 Scenario:Verfication of login button
 Given Open the chrome and launch the application
 When application opened
 Then verifying the title whether it has correct title OrangeHRM - New Level of HR Management
 Then Enter the Username and Password
 Then login is successful
 Then verifying the title whether it has correct title
 Then Verify Username text
 Then VerifyTextPresent
 Then Employee Leave Summary sub menu
 Then selectframe
 Then clickView
 Then exitframe
 Then PIM Main menu link
 Then selectingframe
 And Entering firstname and lastname
 Then verify logout