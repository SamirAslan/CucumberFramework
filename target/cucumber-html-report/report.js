$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login_Test.feature");
formatter.feature({
  "name": "Login Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Go to Trendyol and Login Test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginTest"
    }
  ]
});
formatter.step({
  "name": "Navigate to Website",
  "keyword": "Given "
});
formatter.step({
  "name": "click Popup",
  "keyword": "And "
});
formatter.step({
  "name": "click Sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "enter Email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "write Password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click Submit button",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "notstick61@gmail.com",
        "Antimon.55"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Go to Trendyol and Login Test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginTest"
    }
  ]
});
formatter.step({
  "name": "Navigate to Website",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.Login_Steps.navigate_to_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Popup",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Login_Steps.click_Popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Login_Steps.click_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email \"notstick61@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Login_Steps.enter_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "write Password \"Antimon.55\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Login_Steps.write_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Submit button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.Login_Steps.click_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});