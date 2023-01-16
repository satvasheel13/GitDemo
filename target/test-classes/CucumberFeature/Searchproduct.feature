Feature: Search product 
  I want to use this template for my feature file

  @search
  Scenario Outline: Searching a product on Greenkart website
    Given User is on greencart landing page
		When User is serach product with short name <shortname> and extract the result
		And User is now on offer page
    Then User is searach same product on offer page <shortname> extract the result
    And User is validit both the results

Examples:
 |shortname|
 |Tom			 |
 |Bea			 |
