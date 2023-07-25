package com.Actitime.objectRepositry;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class homepage {
@FindBy(xpath = "//div[.='Time-Track']")
private WebDriver timetracktab;

@FindBy(xpath = "//div[.='Tasks']")
private WebDriver task;

@FindBy(xpath = "//div[.='Reports'")
private WebDriver reports;

@FindBy(xpath = "//div[.='User']")
private WebDriver user;

@FindBy(id = "//div[.=logoutLink")
private WebDriver logout;

}
