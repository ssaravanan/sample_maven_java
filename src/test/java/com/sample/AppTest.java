package com.sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}
