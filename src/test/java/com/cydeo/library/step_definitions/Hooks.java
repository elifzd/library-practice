package com.cydeo.library.step_definitions;

import com.cydeo.library.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    //@After
    public void tearDown(){
        Driver.closeDriver();
    }

}
