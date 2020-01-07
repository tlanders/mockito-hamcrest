package com.oreilly.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class IsUpperCase extends TypeSafeMatcher<String> {
    @Override
    protected boolean matchesSafely(String item) {
        return item.equals(item.toUpperCase());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("all upper case");
    }

    public static IsUpperCase upperCase() {
        return new IsUpperCase();
    }
}
