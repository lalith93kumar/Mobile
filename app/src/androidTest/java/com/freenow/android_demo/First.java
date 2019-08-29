package com.freenow.android_demo;
import com.freenow.android_demo.activities.MainActivity;
import android.support.test.rule.ActivityTestRule;
import com.freenow.android_demo.lib.pages;
import android.support.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import android.support.test.InstrumentationRegistry;

@RunWith(AndroidJUnit4.class)
public class First {

    public static pages loginPageObj;
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @BeforeClass
    public static void pageObject()
    {
        First.loginPageObj = new pages();

    }

    @Before
    @After
    public void beforeFunction()
    {
        if(First.loginPageObj.SEARCH_DRIVER_FIELD.isPresent()) {
            First.loginPageObj.logout();
        }
    }
    @Test
    public void validLoginCredentials() throws InterruptedException {
        First.loginPageObj.login();
        First.loginPageObj.SEARCH_DRIVER_FIELD.isPresent();
        //openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
    }
}