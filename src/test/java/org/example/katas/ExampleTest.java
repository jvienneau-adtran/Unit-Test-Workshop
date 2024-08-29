package org.example.katas;

import static kotlin.collections.CollectionsKt.any;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import kotlin.collections.CollectionsKt;
import lombok.val;
import org.junit.jupiter.api.Test;
/**
 * Example test class.
 */
class ExampleTest {

  /**
   * Test the sum method.
   */
  @Test
  void sum() {
    assertEquals(4, Example.sum(2, 2));
  }

  /**
   * Check that val and any are working.
   */
  @Test
  void testLombokAndKotlinSetup() {
    val list = List.of(1,2,3,4,5);
    assertTrue(any(list, i -> i == 1));
  }
}