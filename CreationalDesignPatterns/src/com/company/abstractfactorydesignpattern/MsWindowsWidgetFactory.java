package com.company.abstractfactorydesignpattern;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory{
    //create an MSWindow
    public Window createWindow(){
        MSWindow window = new MSWindow();
        return window;
    }
}
