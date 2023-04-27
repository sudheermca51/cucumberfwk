Feature: User can login to MMP Website site
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
    When Users inputs the valid <username> and <password>
    Then User can login successfully

    Examples: 
      | username | password |
      | ria1     | Ria1234567 |
