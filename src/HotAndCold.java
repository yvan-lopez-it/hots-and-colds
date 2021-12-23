public class HotAndCold {

    public static void main(String[] args) {
        HotAndCold hotAndCold = new HotAndCold();
        hotAndCold.testCases();
    }

    public String getHint(String hiddentStr, String guessStr) {

        int hots = 0;
        int colds = 0;

        String[] hStrArr = hiddentStr.split("");
        String[] gStrArr = guessStr.split("");

        for (int i = 0; i < hiddentStr.length(); i++) {
            if (gStrArr[i].equals(hStrArr[i])) {
                hots++;
            } else {
                if (hiddentStr.contains(gStrArr[i])) {
                    colds++;
                }
            }
        }

        return hots + "H" + colds + "C";
    }

    public boolean assertHint(int caseNumber, String results, String expected) {
        boolean correct = results.equals(expected);
        System.out.println("Expected value = " + expected + " Actual value = " + results);
        System.out.println("Case " + caseNumber + " = " + (correct ? "passed" : "fail"));
        return results.equals(expected);
    }

    public void testCases() {
        String case1 = getHint("1807", "7810");
        assertHint(1, case1, "1H3C");

        String case2 = getHint("1807", "2805");
        assertHint(2, case2, "2H0C");

        String case3 = getHint("1807", "9807");
        assertHint(3, case3, "3H0C");

        String case4 = getHint("1807", "1807");
        assertHint(4, case4, "4H0C");

        //insert additional test cases here
        String case5 = getHint("1234", "1234");
        assertHint(5, case5, "4H0C");

        String case6 = getHint("1234", "1236");
        assertHint(6, case6, "3H0C");

        String case7 = getHint("1234", "0235");
        assertHint(7, case7, "2H0C");

    }


}
