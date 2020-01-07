# mockito-hamcrest
Examples for Mockito and Hamcrest Matchers course

**hamcrest 2.2 javadocs**

http://hamcrest.org/JavaHamcrest/javadoc/2.2/

## Notes

**Matchers class**<br>
is(...) - same as equalTo or pass-thru for wrapped matcher (makes code more readable)
  - is("str")
  - is(equalTo("str")) - passes thru equalTo matcher, basically same as the above
  
allOf(...) - does object match all specified matchers

anyOf(...) - 

lessThan(...), greaterThan(...), lessThanOrEqualTo(...), etc... - creates comparable matcher, objects must implement Comparable

closeTo(x, err) - compares values within an error range




