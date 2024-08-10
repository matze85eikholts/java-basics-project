package base;

public class StringOperations {
    public static int getSummaryLength(String[] strings) {
        int length = 0;
        for (String elem : strings) {
            length += elem.length();
        }
        return length;
    }

    public static String getFirstAndLastLetterString(String string) {
        return string.substring(0,1) + string.substring(string.length()-1);
    }

    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        return (string1.charAt(index) == string2.charAt(index));
    }

    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        boolean answer = false;
        for (int i = 0; i < string1.length(); i++){
            if ((string1.charAt(i) == character)&&(string2.charAt(i) == character)){
                answer = true;
                break;
            } else {answer = false;}
        }
        return answer;
    }
    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        boolean answer = false;
        for (int i = string1.length()-1; i >= 0; i--) {
            if((string1.charAt(i) == character)&&(string2.charAt(i) == character)) {
                answer = true;
                break;
            } else {answer = false;}
        }
        return answer;
    }

    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        boolean answer = false;
        for(int i = 0; i < string1.length(); i++) {
            if ((i+str.length() > string1.length())||(i+str.length() > string2.length())) {
                answer = false;
                break;
            }
            else if((str.equals(string1.substring(i, i+str.length())))&&(str.equals(string2.substring(i, i+str.length())))) {
                answer = true;
                break;
            } else {answer = false;}
        }
        return answer;
    }
    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        boolean answer = false;
        for(int i = string1.length(); i>= str.length(); i--) {
            if((str.equals(string1.substring(i-str.length(),i)))&&(str.equals(string2.substring(i-str.length(),i)))) {
                answer = true;
                break;
            } else {answer = false;}
        }
        return answer;
    }

    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }
    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    public static boolean isSamePrefix(String string1, String string2,String prefix) {
        if ((prefix.length() <= string1.length())&&(prefix.length() <= string2.length())) {
            if ((string1.substring(0, prefix.length()).equals(string2.substring(0, prefix.length())))&&
                    (prefix.equals(string1.substring(0,prefix.length()))) ){
                return true;
            } else {
                return false;
            }
        } else {return false;}
    }

    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.substring(string1.length()-suffix.length(),string1.length()).equals(
                string2.substring(string2.length()-suffix.length(),string2.length()));
    }
    public static String getCommonPrefix(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        if(string1.length() >= string2.length()) {
            for (int i = 0; i < string2.length(); i++ ){
                if (string1.charAt(i) == string2.charAt(i)) {
                    sb.append(string1.charAt(i));
                } else { break;}
            }
        } else {
            for (int i = 0; i < string1.length(); i++ ){
                if (string1.charAt(i) == string2.charAt(i)) {
                    sb.append(string1.charAt(i));
                } else { break;}
            }

        }
        String common_prefix = sb.toString();
        return common_prefix;
    }

    public static String reverse(String string) {
        StringBuilder sb1 = new StringBuilder();
        for(int i = string.length()-1; i >= 0; i--) {
            sb1.append(string.charAt(i));
        }
        String reversed_string = sb1.toString();
        return reversed_string;
    }
    public static boolean isPalindrome(String string) {
        return reverse(string).equals(string);
    }

    public static boolean isPalindromeIgnoreCase(String string) {
        return reverse(string).compareToIgnoreCase(string) == 0;
    }

    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        int max_length = 0;
        String palindrome ="";
        for (String element : strings) {
            if(isPalindromeIgnoreCase(element)){
                if(element.length() > max_length) {
                    max_length = element.length();
                    palindrome = element;
                }
            }
        }
        return palindrome;
    }
    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        boolean answer;
        String substring1;
        String substring2;
        if (((index + length) > string1.length()) ||((index + length)> string2.length())) {
            answer = false;
        } else {
            substring1 = string1.substring(index,index+length - 1);
            substring2= string2.substring(index, index+length - 1);
            if (substring1.equals(substring2)) {
                answer = true;
            } else {
                answer =false;
            }
        }
        return answer;
    }

    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1,
                                                        String string2, char replaceInStr2, char replaceByInStr2) {
        return string1.replace(replaceInStr1,replaceByInStr1).equals(string2.replace(replaceInStr2,replaceByInStr2));
    }
    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1,
                                                     String string2, String replaceInStr2, String replaceByInStr2) {
        return string1.replace(replaceInStr1,replaceByInStr1).equals(string2.replace(replaceInStr2,replaceByInStr2));
    }

    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        StringBuilder sb = new StringBuilder();
        boolean answer;
        for (int i =0; i < string.length(); i++) {
            if(string.charAt(i) != ' ') {
                sb.append(string.charAt(i));
            }
        }
        String str_without_spaces;
        str_without_spaces = sb.toString();
        answer = isPalindromeIgnoreCase(str_without_spaces);
        return answer;
    }
    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return string1.trim().equals(string2.trim());
    }

    public static String makeCsvStringFromInts(int[] array) {
        int array_size = array.length;
        String answer;
        StringBuilder sb = new StringBuilder();
        if (array_size == 0) {
            answer = "";
        } else {
            for (int i =0; i < array_size; i++) {
                if ( i < (array_size - 1)) {
                    sb.append(array[i]+",");
                } else {
                    sb.append(array[i]);
                }
            }
            answer = sb.toString();
        }
        return answer;
    }
    public static String makeCsvStringFromDoubles(double[] array){
        int array_size = array.length;
        String answer;
        StringBuilder sb = new StringBuilder();
        if (array_size == 0) {
            answer = "";
        } else {
            for (int i =0; i < array_size; i++) {
                if ( i < (array_size - 1)) {
                    sb.append(String.format("%.2f",array[i])+",");
                } else {
                    sb.append(String.format("%.2f",array[i]));
                }
            }
            answer = sb.toString();
        }
        return answer;

    }
    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        int array_size = array.length;
        String empty_string;
        empty_string = "";
        StringBuilder sb = new StringBuilder();
        if (array_size == 0) {
            sb.append(empty_string);
        } else {
            for (int i =0; i < array_size; i++) {
                if ( i < (array_size - 1)) {
                    sb.append(array[i]+",");
                } else {
                    sb.append(array[i]);
                }
            }
        }
        return sb;
    }
    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        int array_size = array.length;
        String empty_string;
        empty_string = "";
        StringBuilder sb = new StringBuilder();
        if (array_size == 0) {
            sb.append(empty_string);
        } else {
            for (int i =0; i < array_size; i++) {
                if ( i < (array_size - 1)) {
                    sb.append(String.format("%.2f",array[i])+",");
                } else {
                    sb.append(String.format("%.2f",array[i]));
                }
            }
        }
        return sb;
    }

    public static StringBuilder removeCharacters(String string, int[] positions) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            sb.append(string.charAt(i));
        }
        for (int i = positions.length - 1; i >= 0; i--) {
            sb.deleteCharAt(positions[i]);
        }
        return sb;
    }

    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < string.length(); i++) {
            sb.append(string.charAt(i));
        }
        for (int i = characters.length-1; i >= 0 ; i--){
            sb.insert(positions[i],characters[i]);
        }
        return sb;
    }



}
