package com.practice.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts
{
@Test(priority = 1) 
public void createUser()
{
	Reporter.log("User created successfully!!!");
	Assert.fail();
}
@Test(dependsOnMethods="createUser")
public void editUser()
{
	Reporter.log("User details have been edited!!!");
}
@Test(dependsOnMethods="editUser")
public void deleteUser()
{
	Reporter.log("User deleted!!!");
}
}
