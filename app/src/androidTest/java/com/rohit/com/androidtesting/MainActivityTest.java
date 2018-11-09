package com.rohit.com.androidtesting;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityTest {

    @Rule
   public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String name = "Rohit";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenario(){
        Espresso.onView(withId(R.id.editText)).perform(typeText(name));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.textView)).check(matches(withText(name)));
    }

    @After
    public void tearDown() throws Exception {
    }
}