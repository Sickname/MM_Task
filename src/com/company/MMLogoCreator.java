package com.company;

public class MMLogoCreator {

    char a = '-';
    char b = '*';

    public String printLogo(int letterWidth) {

        if (letterWidth < 2 || letterWidth > 10000)
            return "Letter width must be in the range 2 < N < 10000";

        if (letterWidth % 2 == 0)
            return "Must be odd number!";

        String finalAnswer = "";

        for (int i = 0; i <= letterWidth; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 5 * letterWidth; j++) {
                sb.append(a);
            }
            for (int j = 0; j < letterWidth; j++) {
                sb.setCharAt(j + letterWidth - i, b);
            }
            for (int j = 0; j < letterWidth; j++) {
                sb.setCharAt(j + letterWidth + i, b);
            }
            for (int j = 0; j < letterWidth; j++) {
                sb.setCharAt(j + 3 * letterWidth - i, b);
            }
            for (int j = 0; j < letterWidth; j++) {
                sb.setCharAt(j + 3 * letterWidth + i, b);
            }

            finalAnswer += sb.toString() + sb.toString() + "\n";
        }

        return finalAnswer;
    }
}
