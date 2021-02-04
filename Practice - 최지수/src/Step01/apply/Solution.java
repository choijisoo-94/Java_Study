package Step01.apply;

import java.util.List;
import java.util.ArrayList;

class Solution {
  public long[] solution(int x, int n) {
      List<Long> list = new ArrayList<>();

      for (long i = 1; i <= n; i++) {
          list.add((long)x * i);
      }

      long[] arr = new long[list.size()];

      for (int j = 0; j < list.size(); j++) {
          arr[j] = list.get(j);
      }

      return arr;
  }
}
