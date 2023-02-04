package com.practice.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModuleScript
{
@Test(groups = {"Smoke","Task"} ,priority = 1) 
public void createTask()
{
	Reporter.log("Task created successfully!!!");
}
@Test(dependsOnMethods="createTask")
public void editTask()
{
	Reporter.log("Task details have been edited!!!");
}
@Test(dependsOnMethods="editTask")
public void deleteTask()
{
	Reporter.log("Task deleted!!!");
}
}
