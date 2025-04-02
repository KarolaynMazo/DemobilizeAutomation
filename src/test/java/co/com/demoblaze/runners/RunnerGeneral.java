package co.com.demoblaze.runners;

import net.serenitybdd.cucumber.cli.Main;

public class RunnerGeneral {
    public static void main(String[] args) throws Throwable {
        Main.main(new String[]{"-g", "co.com.demoblaze.stepdefinitions", "src/test/resources/features/demoblaze.feature"});        
    }
}
