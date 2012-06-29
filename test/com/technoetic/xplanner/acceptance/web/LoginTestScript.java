package com.technoetic.xplanner.acceptance.web;

import java.text.MessageFormat;

import com.technoetic.xplanner.security.LoginModule;

//TODO:Remove
public class LoginTestScript extends AbstractPageTestScript
{
    protected void setUp() throws Exception
    {
        super.setUp();
        tester.login();
        setUpTestPerson();
        tester.logout();
    }

    protected void tearDown() throws Exception {
       super.tearDown();
    }

    public void testLogin_WrongPassword()
    {
        doLogin(developerUserId, "password_xyz");
        tester.assertTextPresent(getErrorMessage(LoginModule.MESSAGE_AUTHENTICATION_FAILED_KEY));
    }

   public void testLogin_NoUser()
   {
       doLogin("userWhoDoesNotExist", "password");
      tester.assertTextPresent(getErrorMessage(LoginModule.MESSAGE_USER_NOT_FOUND_KEY));
   }

    private void doLogin(String userId, String password)
    {
        tester.beginAt("/do/login");
        tester.setFormElement("userId", userId);
        tester.setFormElement("password", password);
        tester.submit();
    }

   private String getErrorMessage(String key) {
      MessageFormat messageFormat = new MessageFormat(tester.getMessage(key));
      return messageFormat.format(new Object[]{"XPlanner"});
   }

}
