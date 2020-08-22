package designPatterns.creational.abstractFactory.buttons;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
