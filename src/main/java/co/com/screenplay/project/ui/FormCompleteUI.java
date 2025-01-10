package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormCompleteUI extends PageObject {

    /**
     * Mapeo de localozadores vista RECRUITMENT
     */



    public static final Target INPUT_FIRST_NAME = Target.the("ingresa el nombre")
            .located(By.name("firstName"));

    public static final Target INPUT_MIDDLENAME = Target.the("ingresa la contraseña")
            .located(By.name("middleName"));

    public static final Target INPUT_LASTNAME = Target.the("ingresa la contraseña")
            .located(By.name("lastName"));

    public static final Target INPUT_EMAIL = Target.the("ingresa la contraseña")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));

    public static final Target INPUT_CONTACTNUMBER = Target.the("ingresa la contraseña")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));

    public static final Target INPUT_KEYWORDS = Target.the("ingresa la contraseña")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input"));

    public static final Target BUTTON_CONSENT = Target.the("pulsa el boton reclutar")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i"));

    public static final Target BUTTON_SAVE = Target.the("pulsa el boton entrar")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));

    public static final Target EMPLOYEE_NAME = Target.the("nombre del empleado")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[1]/div[1]/div/div[2]"));

    public static final Target BUTTON_ADD = Target.the("pulsa el boton reclutar")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
}