@stories
Feature: I as user want to create one business unite and schedule a new meeting

  Background:

    Given login in to page serenity

    @CreateBusinessUnit
    Scenario: Create a new business unit
      When inter the component organizations and create a new business unit
      Then business create success full

      @CreateMeeting
      Scenario: Schedule a new meeting
        When enter the component meeting and create a nue meeting
        Then meeting create success full
