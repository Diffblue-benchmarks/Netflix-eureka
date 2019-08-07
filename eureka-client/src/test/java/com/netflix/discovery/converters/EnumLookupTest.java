package com.netflix.discovery.converters;

import com.netflix.discovery.converters.EnumLookup;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EnumLookupTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: EnumLookup */
  // Test written by Diffblue Cover.
  @Test
  public void equalsInput0NullZeroZeroOutputTrue() {

    // Arrange
    final char[] a1 = {};
    final char[] a2 = null;
    final int a2Offset = 0;
    final int a2Length = 0;

    // Act
    final boolean actual = EnumLookup.equals(a1, a2, a2Offset, a2Length);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInput1NullZeroZeroOutputFalse() {

    // Arrange
    final char[] a1 = {'\u0000'};
    final char[] a2 = null;
    final int a2Offset = 0;
    final int a2Length = 0;

    // Act
    final boolean actual = EnumLookup.equals(a1, a2, a2Offset, a2Length);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInput11ZeroPositiveOutputFalse() {

    // Arrange
    final char[] a1 = {'\u0001'};
    final char[] a2 = {'\u0000'};
    final int a2Offset = 0;
    final int a2Length = 1;

    // Act
    final boolean actual = EnumLookup.equals(a1, a2, a2Offset, a2Length);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInput22ZeroPositiveOutputFalse() {

    // Arrange
    final char[] a1 = {'\u0000', '\u0001'};
    final char[] a2 = {'\u0000', '\u0000'};
    final int a2Offset = 0;
    final int a2Length = 2;

    // Act
    final boolean actual = EnumLookup.equals(a1, a2, a2Offset, a2Length);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeInput0ZeroZeroOutputPositive() {

    // Arrange
    final char[] a = {};
    final int offset = 0;
    final int length = 0;

    // Act
    final int actual = EnumLookup.hashCode(a, offset, length);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeInput8ZeroPositiveOutputPositive() {

    // Arrange
    final char[] a = {'\u0000', '\u0000', '\u0001', '\u0001',
                      '\u0001', '\u0001', '\u0001', '\u0001'};
    final int offset = 0;
    final int length = 1;

    // Act
    final int actual = EnumLookup.hashCode(a, offset, length);

    // Assert result
    Assert.assertEquals(31, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeInputNullZeroZeroOutputZero() {

    // Arrange
    final char[] a = null;
    final int offset = 0;
    final int length = 0;

    // Act
    final int actual = EnumLookup.hashCode(a, offset, length);

    // Assert result
    Assert.assertEquals(0, actual);
  }
}
