public class StatisticsApplication {
    static Statistics collectStatisticsA(String... inputs) {
        if (inputs.length == 0) {
            return new Statistics(0.0, 0);
        }
        double len = 0;
        int digitCount = 0;
        double averageLen = 0;
        for (String s : inputs) {
            if (s != null && !s.isEmpty()) {
                len += s.length();
                for (char ch : s.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        digitCount += 1;
                    }
                }
            }
        }
        averageLen = len / inputs.length;
        return new Statistics(averageLen, digitCount);
    }


    static Statistics collectStatisticsC(String... inputs) {
        if (inputs.length == 0) {
            return new Statistics(0.0, 0);
        }
        double len = 0;
        int digitCount = 0;
        double averageLen = 0;
        int amount = 0;
        for (String s : inputs) {
            if (s != null && !s.isEmpty()) {
                len += s.length();
                amount += 1;
                for (char ch : s.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        digitCount += 1;
                    }
                }
            }
        }
        averageLen = len / amount;
        return new Statistics(averageLen, digitCount);
    }

    static Statistics collectStatisticsD(String... inputs) {
        if (inputs.length == 0) {
            return new Statistics(0.0, 0);
        }
        double len = 0;
        int digitCount = 0;
        double averageLen = 0;
        int amount = 0;
        for (String s : inputs) {
            try {
                len += s.length();
                amount += 1;
                for (char ch : s.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        digitCount += 1;
                    }
                }
            } catch (NullPointerException e) {
                System.out.println("null input ignored");
            }
        }
        averageLen = len / amount;
        return new Statistics(averageLen, digitCount);
    }


    static Statistics collectStatisticsE(String... inputs) {
        if (inputs.length == 0) {
            return new Statistics(0.0, 0);
        }
        double len = 0;
        int digitCount = 0;
        double averageLen = 0;
        int amount = 0;
        for (String s : inputs) {
            try {
                if (s == null) {
                    throw new NullPointerException();
                }
                if (s.contains("@")) {
                    throw new InvalidCharacterException("Invalid character '@' in input : \"" + s + "\"");
                }
                len += s.length();
                amount += 1;
                for (char ch : s.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        digitCount += 1;
                    }
                }

            } catch (InvalidCharacterException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("null input ignored");
            }
        }
        averageLen = len / amount;
        return new Statistics(averageLen, digitCount);
    }


    public static void main(String[] args) {
        Statistics sa1 = collectStatisticsA();
        System.out.println("collectStatisticsA()");
        System.out.printf("average length: %.2f\n", sa1.len);
        System.out.println("digits: " + sa1.countDigit);

        Statistics sa2 = collectStatisticsA("abc", "123", "foo5");
        System.out.println("collectStatisticsA(\"abc\", \"123\", \"foo5\")");
        System.out.printf("average length: %.2f\n", sa2.len);
        System.out.println("digits: " + sa2.countDigit);

        Statistics sc1 = collectStatisticsC("abc", null, "", "42");
        System.out.println("collectStatisticsC(\"abc\", null, \"\", \"42\")");
        System.out.printf("average length: %.2f\n", sc1.len);
        System.out.println("digits: " + sc1.countDigit);

        Statistics sd1 = collectStatisticsD("Java", null, "42", "foo3");
        System.out.println("collectStatisticsD(\"Java\", null, \"42\", \"foo3\")");
        System.out.printf("average length: %.2f\n", sd1.len);
        System.out.println("digits: " + sd1.countDigit);

        Statistics se1 = collectStatisticsE("Java", null, "42", "foo@bar", "OK3");
        System.out.println("collectStatisticsE(\"Java\", null, \"42\", \"foo@bar\", \"OK3\")");
        System.out.printf("average length: %.2f\n", se1.len);
        System.out.println("digits: " + se1.countDigit);
    }


}
