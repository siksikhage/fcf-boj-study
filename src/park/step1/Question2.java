package park.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// 1000
public class Question2 {

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

      String input = reader.readLine(); // 한 줄을 읽어옴

      // 입력된 문자열을 공백으로 분리하여 숫자로 변환
      String[] numbersStr = input.split(" ");
      if (numbersStr.length != 2) {
        System.out.println(numbersStr.length + "개 입력함");
        return;
      }

      try {
        // 두 숫자로 변환
        int num1 = Integer.parseInt(numbersStr[0]);
        int num2 = Integer.parseInt(numbersStr[1]);

        // 두 숫자의 합 계산
        int sum = num1 + num2;

        // 결과 출력
        System.out.print(sum);
      } catch (NumberFormatException e){
        System.out.println("숫자가아니오");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}