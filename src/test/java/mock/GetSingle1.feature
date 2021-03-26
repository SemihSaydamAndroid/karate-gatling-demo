Feature:
  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: get method
    Given path 'users/1'
    When method get
    Then status 200
    Then print response
    Then print responseTime
