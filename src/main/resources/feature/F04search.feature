@smoke
  Feature: F04_search : user could search using product name

    Scenario Outline :  user could search using product name

      When  user enters product name <round>
      And  user clicks on search button
      Then search shows relevant results
      Examples:
      |round|
      | books   |
      |  laptop   |
      |   nike  |

      Scenario Outline : user could search for product using sku
        When user enters sku<sku>
        And  user clicks on search
        And user clicks on the product in search results
        Then user gets the results
        Examples:
        |sku|
        |SCI_FAITH   |
        |APPLE_CAM   |
        |  SF_PRO_11 |
