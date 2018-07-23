package com.me.bui.teatime;

import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by mao.bui on 7/23/2018.
 */

@RunWith(AndroidJUnit4.class)
public class IdlingResourceMenuActivityTest {

    /**
     * The ActivityTestRule is a rule provided by Android used for functional testing of a single
     * activity. The activity that will be tested, MenuActivity in this case, will be launched
     * before each test that's annotated with @Test and before methods annotated with @Before.
     *
     * The activity will be terminated after the test and methods annotated with @After are
     * complete. This rule allows you to directly access the activity during the test.
     */
    @Rule
    public ActivityTestRule<MenuActivity> mActivityTestRule =
            new ActivityTestRule<>(MenuActivity.class);

    private IdlingResource mIdlingResource;


    // TODO (6) Registers any resource that needs to be synchronized with Espresso before
    // the test is run.
    @Before
    public void registerIdlingResource() {

    }

    // TODO (7) Test that the gridView with Tea objects appears and we can click a gridView item
    @Test
    public void idlingResourceTest() {

    }

    // TODO (8) Unregister resources when not needed to avoid malfunction
    @After
    public void unregisterIdlingResource() {

    }
}
