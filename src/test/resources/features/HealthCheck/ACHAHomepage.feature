@AHCA
@Healthcheck

Feature: Navigation for Top Menu Options

  Scenario: User navigates to Customer Login page "https://app.cpraedcourse.com/user/login?version=v2"
    Given the user is on the home page
    When the user clicks on "Customer Login"
    Then the user should be navigated to the Customer Login page

  Scenario: User navigates to Group Login page "https://app.cpraedcourse.com/groupadmin/login"
    Given the user is on the home page
    When the user clicks on "Group Login"
    Then the user should be navigated to the Group Login page

 Scenario: User navigates to CPR/AED + First Aid Combo Course page "https://cpraedcourse.com/course/cpr-first-aid-certification/1/"
    Given the user is on the home page
    When the user hovers over Course Information
    And clicks on "CPR/AED + First Aid Combo Course"
    Then the user should be navigated to the CPR AED + First Aid Combo Course page

  Scenario: User navigates to Healthcare Provider CPR/AED + First Aid Combo - BLS Course page "https://cpraedcourse.com/course/healthcare-cpr/cpr-introduction/"
    Given the user is on the home page
    When the user hovers over Course Information
    And clicks on "Healthcare Provider CPR/AED + First Aid  Combo - BLS Course"                  
   Then the user should be navigated to the Healthcare Provider CPR AED + First Aid Combo - BLS Course page

  Scenario: User navigates to CPR/AED Course page "https://cpraedcourse.com/course/cpr-certification/cpr-introduction/"
    Given the user is on the home page
    When the user hovers over Course Information
    And clicks on "CPR/AED Course"
    Then the user should be navigated to the CPR AED Course page

  Scenario: User navigates to Standard First Aid Course page "https://cpraedcourse.com/course/first-aid-course/first-aid-course-introduction/"
    Given the user is on the home page
    When the user hovers over Course Information
    And clicks on "Standard First Aid Course"
    Then the user should be navigated to the Standard First Aid Course page

  Scenario: User navigates to Bloodborne Pathogens Course page "https://cpraedcourse.com/course/bloodborne/1/"
    Given the user is on the home page
    When the user hovers over Course Information
    And clicks on "Bloodborne Pathogens "
    Then the user should be navigated to the Bloodborne Pathogens Course page

  Scenario: User navigates to ACLS/PALS Course page "https://cpraedcourse.com/course/acls/1/"
    Given the user is on the home page
    When the user hovers over Course Information
    And clicks on "ACLS/PALS Course"
    Then the user should be navigated to the ACLS PALS Course page 
