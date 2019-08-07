package com.netflix.discovery.util;

import com.netflix.discovery.util.StringUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: StringUtil */
  // Test written by Diffblue Cover.
  @Test
  public void joinInput0OutputNull() {

    // Arrange
    final String[] values = {};

    // Act
    final String actual = StringUtil.join(values);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void joinInput1OutputNotNull() {

    // Arrange
    final String[] values = {"3"};

    // Act
    final String actual = StringUtil.join(values);

    // Assert result
    Assert.assertEquals("3", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void joinInputNullOutputNull() {

    // Arrange
    final String[] values = null;

    // Act
    final String actual = StringUtil.join(values);

    // Assert result
    Assert.assertNull(actual);
  }
}
