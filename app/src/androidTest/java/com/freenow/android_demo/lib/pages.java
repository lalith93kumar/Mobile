package com.freenow.android_demo.lib;

public class pages extends locator {

    public void login() throws InterruptedException {
        USERNAME_FIELD.sendKeys("crazydog335");
        PASSWORD_FIELD.sendKeys("venture");
        LOGIN_BUTTON.click();
        Thread.sleep(1000);
    }

    public void logout() {
        SIDE.click();
        LOGOUT_BUTTON.click();
    }
}
