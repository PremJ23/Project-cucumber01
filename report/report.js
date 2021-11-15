$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Check the room booking accordingly in Atactin application",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User checking the login page using the correct username and password",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the correct \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 11,
      "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;1"
    },
    {
      "cells": [
        "Kumar",
        "",
        "54226o"
      ],
      "line": 12,
      "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;2"
    },
    {
      "cells": [
        "anbu",
        "",
        "53333h"
      ],
      "line": 13,
      "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;3"
    },
    {
      "cells": [
        "8056976137",
        "",
        "805697613"
      ],
      "line": 14,
      "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User checking the login page using the correct username and password",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the valid \"Kumar\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the correct \"54226o\" in the password field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 5629173000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kumar",
      "offset": 22
    }
  ],
  "location": "AdactinStepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 200712400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "54226o",
      "offset": 24
    }
  ],
  "location": "AdactinStepDefinition.user_enter_the_correct_in_the_password_field(String)"
});
formatter.result({
  "duration": 162044800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 909180300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User checking the login page using the correct username and password",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the valid \"anbu\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the correct \"53333h\" in the password field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 619560100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anbu",
      "offset": 22
    }
  ],
  "location": "AdactinStepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 80955900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "53333h",
      "offset": 24
    }
  ],
  "location": "AdactinStepDefinition.user_enter_the_correct_in_the_password_field(String)"
});
formatter.result({
  "duration": 105098600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 756544600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User checking the login page using the correct username and password",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-checking-the-login-page-using-the-correct-username-and-password;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the valid \"8056976137\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the correct \"805697613\" in the password field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 606823600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8056976137",
      "offset": 22
    }
  ],
  "location": "AdactinStepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 103789400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "805697613",
      "offset": 24
    }
  ],
  "location": "AdactinStepDefinition.user_enter_the_correct_in_the_password_field(String)"
});
formatter.result({
  "duration": 99936000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 2438521300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User has to searching the hotels using checking and checkout date",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-has-to-searching-the-hotels-using-checking-and-checkout-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "User select the correct location in the location field",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User select the correct hotel in the hotels field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User has to select the corrcet room type in the room type field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User select the corrcet number of room in the number of rooms field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter the valid checkin date in the checkin date field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enter the valid checkout date in the checkout date field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User select the adults in the adults per room field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User select the childrens in the children per room field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User clicks the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_correct_location_in_the_location_field()"
});
formatter.result({
  "duration": 708646700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_correct_hotel_in_the_hotels_field()"
});
formatter.result({
  "duration": 150777600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_has_to_select_the_corrcet_room_type_in_the_room_type_field()"
});
formatter.result({
  "duration": 164469700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_corrcet_number_of_room_in_the_number_of_rooms_field()"
});
formatter.result({
  "duration": 265636700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_checkin_date_in_the_checkin_date_field()"
});
formatter.result({
  "duration": 205719400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_checkout_date_in_the_checkout_date_field()"
});
formatter.result({
  "duration": 144748600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_adults_in_the_adults_per_room_field()"
});
formatter.result({
  "duration": 201941200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_childrens_in_the_children_per_room_field()"
});
formatter.result({
  "duration": 196309700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_search_button()"
});
formatter.result({
  "duration": 1701955400,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User has to select the hotel",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-has-to-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User select the hotel in the select hotel field",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "User clicks on the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_hotel_in_the_select_hotel_field()"
});
formatter.result({
  "duration": 69661300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_continue_button()"
});
formatter.result({
  "duration": 878826400,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "User has to booking the hotel using valid credit card details",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-has-to-booking-the-hotel-using-valid-credit-card-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User enter the valid first name in the first name field",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enter the valid last name in the last name field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User enter the valid address in the billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enter the valid credit card number in the card no field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User selecting the correct card type in the credit card type field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User selecting the correct month in the expiry month field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User selecting the correct year in the expiry year field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User enter the valid cvv number in the cvv number field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User clicks on the book button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_first_name_in_the_first_name_field()"
});
formatter.result({
  "duration": 96937400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_last_name_in_the_last_name_field()"
});
formatter.result({
  "duration": 113612100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_address_in_the_billing_address_field()"
});
formatter.result({
  "duration": 80221800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_credit_card_number_in_the_card_no_field()"
});
formatter.result({
  "duration": 107040000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_selecting_the_correct_card_type_in_the_credit_card_type_field()"
});
formatter.result({
  "duration": 142097700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_selecting_the_correct_month_in_the_expiry_month_field()"
});
formatter.result({
  "duration": 144689400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_selecting_the_correct_year_in_the_expiry_year_field()"
});
formatter.result({
  "duration": 260312900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_valid_cvv_number_in_the_cvv_number_field()"
});
formatter.result({
  "duration": 75373100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_book_button()"
});
formatter.result({
  "duration": 87447100,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "User has to confirming the hotel booking",
  "description": "",
  "id": "check-the-room-booking-accordingly-in-atactin-application;user-has-to-confirming-the-hotel-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "User clicks on the ltinerary button",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "User clicks on the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_ltinerary_button()"
});
formatter.result({
  "duration": 7790461400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_on_the_logout_button()"
});
formatter.result({
  "duration": 671091100,
  "status": "passed"
});
});