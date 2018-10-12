package com.company.abstractfactorydesignpattern;

//ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory{
    public Window createWindow(){
        MacOSXWindow window = new MacOSXWindow();
        return window;
    }
}
