package rabin_karp;

import java.util.ArrayList;

public class RabinKarpExtended {

  public final static int d = 256;

  //  static void searchRabinKarp(String pat, String txt, int q) {
  static ArrayList searchRabinKarp(String pat, String txt, int q) {

    ArrayList numberPosition = new ArrayList();
    int patternLength = pat.length();
    int txtLength = txt.length();
    int i, j;
    int hashPattern = 0; // хеш-значение для шаблона
    int hashText = 0; // хеш-значение для txt
    int h = 1;

    // Значение h будет "pow (d, M-1)% q"

    for (i = 0; i < patternLength - 1; i++) {
      h = (h * d) % q;
    }

    // Вычисляем значение хеша pattern - first

    for (i = 0; i < patternLength; i++) {

      hashPattern = (d * hashPattern + pat.charAt(i)) % q;
      hashText = (d * hashText + txt.charAt(i)) % q;

    }

    // Скользим шаблон по тексту один за другим

    for (i = 0; i <= txtLength - patternLength; i++) {

      // Проверяем значения хеш-функции текущего окна текста
      // и шаблон. Если значения хеша совпадают, то проверяем наличие символов по одному

      if (hashPattern == hashText) {

        /*Проверяем символы по одному */
        for (j = 0; j < patternLength; j++) {

          if (txt.charAt(i + j) != pat.charAt(j)) {
            break;
          }

        }

        // если hashPattern == hashText и pat [0 ... patternLength-1] = txt [i, i + 1, ... i + patternLength-1]
        if (j == patternLength) {
          numberPosition.add(i);
        }

      }

      // Рассчитываем значение хеша для следующего окна текста: Удаляем
      // начальную цифру, добавляем завершающую цифру

      if (i < txtLength - patternLength) {
        hashText = (d * (hashText - txt.charAt(i) * h) + txt.charAt(i + patternLength)) % q;

        // Если получили отрицательное значение hashText, преобразем его к положительному
        if (hashText < 0) {
          hashText = (hashText + q);
        }

      }
    }
    return numberPosition;
  }
}


