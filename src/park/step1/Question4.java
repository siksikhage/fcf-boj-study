package park.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 1002

public class Question4 {

  public static void main(String[] args) {

      // 조규현 좌표 x1, y1
      // 백승환 좌표 x2, y2
      // 조규현이 계산한 류재명과의 거리 r1
      // 백승환이 계산한 류재명과의 거리 r2
      // 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램

      try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

        String inputT = reader.readLine(); // 테스트 케이스 개수

        int T = Integer.parseInt(inputT);
        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<>();

        for (int i = 0; i < T; i++) {
          twoDArray.add(new ArrayList<>());
          String inputT2 = reader.readLine(); // 테스트 케이스 개수
          String[] numberStr = inputT2.split(" ");
          for (int j = 0; j < numberStr.length ; j++) {
            twoDArray.get(i).add(Integer.parseInt(numberStr[j]));
          }
        }

        // x1, y1, r1, x2, y2, r2
        // 터렛사이거리 = Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2))
        // 마린터렛1사이거리 = r1
        // 마린터렛2사이거리 = r2

        // case 1 : 마린이 터렛1과 터렛2 와 같은 거리에 있는 경우 접점 1개
        // case 2 : 마린이 터렛1과 터렛2 와 같은 거리가 아닌 경우 접점 2개 (터렛끼리 지름을 넘지않음)
        // case 3 : 마린이 터렛1과 터렛2 와 같은 거리가 아닌 경우 접점 1개 (터렛끼리 지름을 넘음)


        for (int i = 0; i < twoDArray.size(); i ++){

          int x1 = twoDArray.get(i).get(0);
          int x2 = twoDArray.get(i).get(3);
          int y1 = twoDArray.get(i).get(1);
          int y2 = twoDArray.get(i).get(4);

          double T1_T2_Distance = Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
          int T1_M_Distance = twoDArray.get(i).get(2);
          int T2_M_Distance = twoDArray.get(i).get(5);


          // r1 + r2 = 터렛사이 거리
            if(T1_M_Distance + T2_M_Distance == T1_T2_Distance) {
              System.out.println(1);
            } else if (T1_T2_Distance + T1_M_Distance == T2_M_Distance){
              System.out.println(1);
            } else if (T1_T2_Distance + T2_M_Distance == T1_M_Distance){
              System.out.println(1);
            } else if (T1_T2_Distance + T1_M_Distance > T2_M_Distance) {
              System.out.println(2);
            } else if (T1_T2_Distance + T2_M_Distance > T1_M_Distance) {
              System.out.println(2);
            } else {
              System.out.println(0);
            }
        }
      } catch (IOException e) {
        e.printStackTrace();
      }

  }
}