package com.example.myapplication.Fragments;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNull;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.android21buttons.fragmenttestrule.FragmentTestRule;
import com.example.myapplication.LecturerHomeFragment;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LecturerHomeFragmentTest {
    @Rule
    public FragmentTestRule<?, LecturerHomeFragment> lecturerHomeFragmentTestRule = FragmentTestRule.create(LecturerHomeFragment.class);
    LecturerHomeFragment lecturerAccountFragment = lecturerHomeFragmentTestRule.getFragment();

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(MainActivity.class.getName(),null ,false);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void isActivityInView(){
        onView(withId(R.id.lecturerHomeFragment)).check(matches(isDisplayed()));
    }

    @After
    public void tearDown() throws Exception {
    }
}
