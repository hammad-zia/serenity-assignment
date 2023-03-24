package efinancialcareers.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchUI {
    public static final Target SEARCH_INPUT = Target.the("search input field").locatedBy("//input[@placeholder=\"Job title, keyword or company\"]");
    public static final Target VERIFY_SEARCH_FIRST_ITEM = Target.the("first QA job").locatedBy("//div[@class=\"title\"]//a[contains(text(),\"QA Engineer\")]");

    public static final Target APPLY_FIRST_JOB = Target.the("apply first job").locatedBy("//button[contains(text(),\"Apply now\")]");
}
