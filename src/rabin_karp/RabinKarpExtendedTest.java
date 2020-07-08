package rabin_karp;

import static java.lang.Math.pow;
import static rabin_karp.RabinKarpExtended.searchRabinKarp;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RabinKarpExtendedTest {

  String txt = "Like the Naive Algorithm, Rabin-Karp algorithm also slides the pattern one by one. But unlike the Naive algorithm, Rabin Karp algorithm matches the hash value of the pattern with the hash value of current substring of text, and if the hash values match then only it starts matching individual characters. So Rabin Karp algorithm needs to calculate hash values for following strings.";
  String pat = "Rabin-Karp algorithm";
  ArrayList numberPositionTest = new ArrayList();
  //    int q = 101; // Простое число
  int q = (int) (pow(2, 64) - 1); // Простое число


  @BeforeEach
  void setUp() {
    numberPositionTest.add(26);

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void searchTest() {
    Assertions
        .assertArrayEquals(numberPositionTest.toArray(), searchRabinKarp(pat, txt, q).toArray());
  }
}