Feature: Login Page

  @maillogin
  Scenario: Successfully E-Posta Login Case
    Given Click Login Button
    When  E-Posta Radio Button has been chosen
    And nd  e-mail is entered "uygnerenn@gmail.com"
    And  password is entered "123lcw"
    And  Click the login button
    Then  User see the My Account Button "Hesabım"

  @phonelogin
  Scenario: Successfully Phone Login Case
    Given Click Login Button
    And  Click the Phone Radio Button
    And  phone number is entered ""
    And  password is entered "123lcw"
    And  Click the login button
    Then  User see the My Account Button "Hesabım"
