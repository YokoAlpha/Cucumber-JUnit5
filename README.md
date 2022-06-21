# Cucumber_JUnit5

The objective of this project is to evaluate differences between JUnit 4 and new JUnit5 while undertaking Cucumber course. The project will be written in JUnit5 and while completing course that is delivered using JUnit4 I will be updating table in README.md with differences that I have found. Hopefully this simple project and table with differences will help someone make the first steps of running Cucumber tests with either JUnit4 or JUnit5. I am only learning myself so please feel free to add comments and suggestions of improvement they would be greatly appreciated. Thank you:)
#
-----------------------------

| Area of change | JUnit4 | JUnit5 |
| --- | --- | --- |
|Core engine to run scenarios | cucumber-junit | cucumber-junit-platform-engine |
|POM | ![POM_JUnit4](https://user-images.githubusercontent.com/23194565/169550826-b2bf4e79-a6e7-4548-b76c-603925a4a36b.jpg)|![POM_JUnit5](https://user-images.githubusercontent.com/23194565/169550859-ee1309c6-3909-4796-ac6e-75da2c94de8c.jpg)|
|File structure |Files are stored in the corresponding folder namely TestRunner, Features and StepDefinitions inside the src/test/java path ![jUnit4_fileStructure](https://user-images.githubusercontent.com/23194565/172447522-f37293aa-3477-45c2-8032-63593ecb001a.jpg)|In JUnit5 this differs slightly the recommendation is to place TestRunner and StepDefinitions inside the src/test/java path with Features to be added to src/test/resources path ![Junit5_fileStructure](https://user-images.githubusercontent.com/23194565/172447496-bd2f3a47-3a63-4c36-8d4c-4fe4ba0c7de7.jpg)|
|Test runner | @RunWith(Cucumber.class) and specify @CucumberOptions(...) |Define Cucumber options using JUnit.platform![JuNit5_testRunner](https://user-images.githubusercontent.com/23194565/172449822-19ea7ab8-a8b4-4293-b830-b654247d531e.jpg) |
|Granular step- notification | Defined in TestRunner with stepNotifications = true | Not supported in cucumber-junit-platform but can view scenario outline in console [source https://github.com/cucumber/cucumber-jvm/issues/2471]|
|Tags | Define tags in the test runner to specify what test to include @CucumberOptions(features = "src/test/java/features",glue = "stepDefinations", tags = "@Tag2") | Define tags in the test runner to specify what test to omit --> @ExcludeTags("Tag1") and which to run --> @IncludeTags("Tag2")|
