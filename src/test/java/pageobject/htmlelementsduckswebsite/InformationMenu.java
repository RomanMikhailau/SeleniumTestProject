package pageobject.htmlelementsduckswebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


@Name("Information menu")
@FindBy(id = "box-information-links")

public class InformationMenu extends HtmlElement {

    @Name("About us button")
    @FindBy(css = "[href=’https://litecart.stqa.ru/en/about-us-i-1']")
    WebElement aboutUsButton;

    @Name("Delivery information button")
    @FindBy(css = "[href='https://litecart.stqa.ru/en/delivery-information-i-2’]")
    WebElement deliveryInformationButton;

    @Name("Privacy policy button")
    @FindBy(css = "[href=’https://litecart.stqa.ru/en/privacy-policy-i-3’]")
    WebElement privacyPolicyButton;

    @Name("Terms&conditions button")
    @FindBy(css = "[href='https://litecart.stqa.ru/en/terms-conditions-i-4’]")
    WebElement termsAndConditionsButton;

    @Name("Discounts and Promotions button")
    @FindBy(css = "[href='https://litecart.stqa.ru/en/skidki-i-akcii-i-5’]")
    WebElement discountsAndPromotionsButton;

    public void aboutUsButton() {
        aboutUsButton.click();
    }

    public void DeliveryInformationButton() {
        deliveryInformationButton.click();
    }

    public void privacyPolicyButton() {
        privacyPolicyButton.click();
    }

    public void termsAndConditionsButton() {
        termsAndConditionsButton.click();
    }

    public void discountsAndPromotionsButton() {
        discountsAndPromotionsButton.click();
    }
}