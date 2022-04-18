package com.julian.uitestsapp.tests

import cucumber.api.CucumberOptions
import cucumber.api.android.CucumberAndroidJUnitRunner

@CucumberOptions(glue = ["com.julian.uitestsapp.tests"], features = ["features"], tags = ["~@wip"])
class GroceriesAppAndroidTestRunner : CucumberAndroidJUnitRunner()