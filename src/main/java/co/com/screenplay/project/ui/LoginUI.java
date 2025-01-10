package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {

    /**
     * Mapeo de localozadores vista LOGIN
     */

//    public static final Target MODAL_LOGIN = Target.the("selecciona en el modal la opcion login")
//            .located(By.id("login2"));

    public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
            .located(By.name("username"));

    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
            .located(By.name("password"));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

    public static final Target BUTTON_RECRUITMENT = Target.the("pulsa el boton reclutar")
            .located(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a"));

}