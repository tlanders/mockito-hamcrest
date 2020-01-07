# mockito-hamcrest
Examples for Mockito and Hamcrest Matchers course

**hamcrest 2.2 javadocs**

http://hamcrest.org/JavaHamcrest/javadoc/2.2/

## Notes

**Matchers class**<br>
is(...) - same as equalTo or pass-thru for wrapped matcher (makes code more readable)
  - is("str")
  - is(equalTo("str")) - passes thru equalTo matcher, basically same as the above

not(...) - negates result of matcher

sameInstance(...)

nullValue() - creates matcher checking that object is null

nullValue(Class<T>) - creates matcher checking that object is null and the correct type
  
allOf(...) - does object match all specified matchers

anyOf(...) - does object match at least one of the specified matchers

lessThan(...), greaterThan(...), lessThanOrEqualTo(...), etc... - creates comparable matcher, objects must implement Comparable

closeTo(x, err) - compares values within an error range

equalToIgnoringCase(...) - case-insensitive string comparison

equalToCompressingWhiteSpace(...) - string compare that mostly ignores white space

containsString(...) - does actual string contain expected substring

emptyString() - object is empty string, but not null

emptyOrNullString() - object is empty or null string

hasSize(num) - does collection have specific size

everyItem(...) - does every item in the collection match the specified matcher

contains(...) - does collection contain elements and in the same order

containsInAnyOrder(...) - does collection contain elements but not in the same order

hasItem(...) - does collection contain the single item

hasItemInArray(item) - is item in the actual array

hasProperty(propName) - does object have bean property propName

samePropertyValuesAs(bean) - does object have same prop vals as bean (can use when equals is not overridden)

## To Extend
BaseMatcher<T>

TypeSafeMatcher<T> - first checks for non-null and correct type




