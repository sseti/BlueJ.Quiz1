
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        String returnInput = "";
        returnInput = input;
        return returnInput;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String result = baseValue .concat (valueToBeAdded);
        return result;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
    if (valueToBeReversed == null) {
        return valueToBeReversed;
    }
    String output = "";
    for (int i= valueToBeReversed.length() - 1; i >= 0; i--) {
        output = output + valueToBeReversed.charAt(i);
    }
    
    return output;
}


    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
       int result = word.length();
       int middle = result/2;
       char c [] = word.toCharArray();
       return c [middle];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        //StringBuilder result = value.toString(charToRemove);
        
       String result = null;
       if ((value != null) && (value.length() > charToRemove )) {
        result = value.substring(charToRemove, value.length() - 1);
       
        }
        return result;
    }
   
        
    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        
        String result = sentence.substring(sentence.lastIndexOf(" ")+1);
        return result;
    }
}
