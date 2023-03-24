package efinancialcareers.ui;


import net.serenitybdd.screenplay.targets.Target;

public class ApplyUI {
    public static final Target MODAL_JOB = Target.the("apply job modal").locatedBy("//div[@class=\"modal-body\"]");
    public static final Target FIRST_NAME = Target.the("firstname field").locatedBy("//input[@id=\"firstname\"]");
    public static final Target SUR_NAME = Target.the("surname field").locatedBy("//input[@id=\"lastname\"]");
    public static final Target OPEN_CV_UPLOAD_DIALOG = Target.the("cv upload field").locatedBy("//span[contains(text(),\"Upload CV\")]");
    public static final Target CV_UPLOAD = Target.the("cv upload modal").locatedBy("#fsp-fileUpload");
    public static final Target UPLOAD_BUTTON = Target.the("upload button").locatedBy("//span[@title=\"Upload\"]");
    public static final Target APPLY = Target.the("apply job button").locatedBy("//span[contains(text(),\"Apply\")]");
}
