package com.feicuiedu.junittestdemo;

import android.support.test.espresso.Espresso;
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
import static org.junit.Assert.*;

/**
 * Created by gqq on 2017/2/13.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    /**
     * 1. 指定运行的环境
     * 2. 指定Activity：启动的测试的Activity
     * 3. 完善测试的UI
     */

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void onClick() throws Exception {
        /**
         * 1. 找到button，button设置点击事件
         * 2. 找到TextView、检测textView展示的文本是不是我们期望的结果
         */

        // 找到View：id、text

        onView(withId(R.id.btnShow)).perform(click());

        Thread.sleep(2000);

        onView(withId(R.id.tvShow)).check(matches(withText("Java")));

    }
}