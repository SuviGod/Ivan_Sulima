Feature: Dropbox API testing

  Scenario: Upload file
    Given created file
      When user uploads the file
    Then the file is uploaded on Dropbox

  Scenario: Get file's metadata
    Given created file
      When user uploads the file
        And user requests file's metadata
      Then user has got file's metadata

  Scenario: Delete file
    Given created file
      When user uploads the file
        And user deletes the file
      Then The file is deleted from Dropbox
