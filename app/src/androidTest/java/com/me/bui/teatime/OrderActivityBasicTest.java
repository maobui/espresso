package com.me.bui.teatime;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by mao.bui on 7/23/2018.
 */
@RunWith(AndroidJUnit4.class)
public class OrderActivityBasicTest {

    @Rule
    public ActivityTestRule<OrderActivity> mOrderActivityTestRule = new ActivityTestRule<>(OrderActivity.class);

    @Test
    public void clickIncrementButton_ChangesQuantityAndCost() {
        // Click on increment button
        onView((withId(R.id.increment_button)))
                .perform(click());

        // Check if the view does what you expected.
        onView(withId(R.id.quantity_text_view)).check(matches(withText("1")));
        onView(withId(R.id.cost_text_view)).check(matches(withText("$5.00")));

    }

    @Test
    public void clickDecrementButton_ChangesQuantityAndCost() {
        // Check the initial quantity variable is zero
        onView((withId(R.id.quantity_text_view))).check(matches(withText("0")));

        // Click on decrement button
        onView((withId(R.id.decrement_button)))
                .perform(click());

        // Verify that the decrement button decreases the quantity by 1
        onView(withId(R.id.quantity_text_view)).check(matches(withText("0")));

        // Verify that the increment button also increases the total cost to $5.00
        onView(withId(R.id.cost_text_view)).check(matches(withText("$0.00")));

    }
}
