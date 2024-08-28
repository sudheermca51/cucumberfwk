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
  Scenario Outline: User cannot login with valid username and password
    Given User visited to the mmp site
    When Users inputs the invalid <username> and <password>
    Then User cannot login successfully
    

    Examples: 
      | username | password |
      | ria1     | Ria1234567 |
      | ria1     | Ria12347 |
