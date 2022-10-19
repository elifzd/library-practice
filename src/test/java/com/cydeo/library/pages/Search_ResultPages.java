package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Search_ResultPages {

    public Search_ResultPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Users']")
    public WebElement usersButton;

    /*
    @FindBy (xpath = "//th[@data-name='actions']")
    public WebElement actionsTag;

    @FindBy (xpath = "//th[@data-name='id']")
    public WebElement userIdTag;

    @FindBy (xpath = "//th[@data-name='full_name']")
    public WebElement fullNameTag;

    @FindBy (xpath = "//th[@data-name='email']")
    public WebElement emailTag;

    @FindBy (xpath = "//th[@data-name='group_name']")
    public WebElement groupNameTag;

    @FindBy (xpath = "//th[@data-name='status']")
    public WebElement statusTag;

     */

    @FindBy (xpath = "//th")
    public List<WebElement> allButton;


}
