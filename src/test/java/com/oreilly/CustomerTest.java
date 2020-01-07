package com.oreilly;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CustomerTest {
    @Test
    public void orderCustomerByName() {
        Customer c1 = new Customer("Fred");
        Customer c2 = new Customer("Barney");

        assertThat(c1, is(greaterThan(c2)));
    }

}
