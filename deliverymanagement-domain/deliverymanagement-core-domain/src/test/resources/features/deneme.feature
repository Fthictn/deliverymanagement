Feature: Bonus policy
  The company follows a bonus policy

  Scenario Outline: Regular passenger bonus policy
    Given we have a regular passenger
    When the regular passenger <pass1> travels <pass2>
    Then the bonus points of the regular passenger should <points>

    Examples:
      |asdasd|asdasd|asdasd|asdas|
      |123   |asd   |asdasd|asd  |
      |123   |asd   |asdasd|asd  |