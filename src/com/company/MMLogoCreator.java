package com.company;

public class MMLogoCreator {

    private char emptySymbol = '-';
    private char fillSymbol = '*';

    public String printLogo(int letterWidth) {

        if (letterWidth < 2 || letterWidth > 10000)
            return "Letter width must be in the range 2 < N < 10000\n";

        if (letterWidth % 2 == 0)
            return "Letter width must be an odd number!\n";

        StringBuilder finalAnswer = new StringBuilder();

        for (int i = 0; i <= letterWidth; i++) {
            StringBuilder sb = new StringBuilder();

            // Fill the line with empty symbols
            sb.append(String.valueOf(emptySymbol).repeat(5 * letterWidth));

            // Substitute empty symbol with fill symbol where necessary
            for (int j = 0; j < letterWidth; j++) {
                sb.setCharAt(j + letterWidth - i, fillSymbol);
                sb.setCharAt(j + letterWidth + i, fillSymbol);
                sb.setCharAt(j + 3 * letterWidth - i, fillSymbol);
                sb.setCharAt(j + 3 * letterWidth + i, fillSymbol);
            }

            finalAnswer.append(sb.toString()).append(sb.toString()).append("\n");
        }

        return finalAnswer.toString();
    }
}
