Feature: User can login to MMP Website site
  
  Background: User is Logged In
	Given I have instantiated the driver instance
	When I have nagivated to login Page
	Then Login Page is displayed successfully

	@sanity
  Scenario Outline: User can login with valid username and password
    Given User visited to the mmp site
    When Users inputs the valid <username> and <password>
    Then User can login successfully

    Examples: 
      | username | password |
      | ria1     | Ria12345 |
      
  @regression
  Scenario Outline: User can login with valid username and password
    Given User visited to the mmp site
    When Users inputs the invalid <username> and <password>
    Then User cannot login successfully

    Examples: 
      | username | password |
      | ria1     | Ria1234567 |
