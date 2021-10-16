   public static String decodeString (String input) {
        String output = input;
        Pattern pattern = Pattern.compile("(\\d+)\\[([a-z]+)\\]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            output = output.replace(matcher.group(0), new String(new char[Integer.valueOf(matcher.group(1))]).replace("\0", matcher.group(2)));
        }
        if (output.contains("[")) {
            output = decodeString(output);
        }
        return output;
    }
