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
        Statistics s1 = collectStatisticsA();
        Statistics s2 = collectStatisticsC("I", "like", "Java 17", "very", "much");
        Statistics s3 = collectStatisticsE("Java", null, "42", "fff@fff");

        System.out.println("average length: " + s3.len);
        System.out.println("digits: " + s3.countDigit);
    }
}
