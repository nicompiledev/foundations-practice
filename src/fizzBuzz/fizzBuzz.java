package fizzBuzz;

public class fizzBuzz {

    public static String[] calculateFizzBuzz(int n) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.setLength(0);

            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }

            answer[i - 1] = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        String[] result = calculateFizzBuzz(n);

        for (String str : result) {
            System.out.println(str);
        }
    }

}
