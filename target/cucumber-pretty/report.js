$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "Gooogle Functionality",
  "description": "",
  "id": "gooogle-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@featuretag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Signup Functionality",
  "description": "",
  "id": "gooogle-functionality;signup-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@signup"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "launch the broswer and navigate to elearning url",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user is on homepage and signup link should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user click on signup link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user navigate to the Registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user enters all the mandatory information",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user click on register",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user should be able to see the successful registration message",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user clicks on profile dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user should be able to see to his registered email id",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user click on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user click on compose",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enters data for  send to",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enters data for subject",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enters message in message box",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user clicks on send message button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user should be able to see the acknowledgement",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.launch_the_broswer_and_navigate_to_elearning_url()"
});
formatter.result({
  "duration": 16516007000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_is_on_homepage_and_signup_link_should_be_displayed()"
});
formatter.result({
  "duration": 183793000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_click_on_signup_link()"
});
formatter.result({
  "duration": 10971560600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_navigate_to_the_Registration_page()"
});
formatter.result({
  "duration": 137289100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_enters_all_the_mandatory_information()"
});
formatter.result({
  "duration": 6223386100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_click_on_register()"
});
formatter.result({
  "duration": 7354250900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_should_be_able_to_see_the_successful_registration_message()"
});
formatter.result({
  "duration": 122967700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_clicks_on_profile_dropdown()"
});
formatter.result({
  "duration": 148464600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_should_be_able_to_see_to_his_registered_email_id()"
});
formatter.result({
  "duration": 112031500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_click_on_homepage()"
});
formatter.result({
  "duration": 2697158000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_click_on_compose()"
});
formatter.result({
  "duration": 4027394900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_enters_data_for_send_to()"
});
formatter.result({
  "duration": 8519355200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_enters_data_for_subject()"
});
formatter.result({
  "duration": 230324000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_enters_message_in_message_box()"
});
formatter.result({
  "duration": 9746062000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_clicks_on_send_message_button()"
});
formatter.result({
  "duration": 5576185600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_should_be_able_to_see_the_acknowledgement()"
});
formatter.result({
  "duration": 144993400,
  "status": "passed"
});
});