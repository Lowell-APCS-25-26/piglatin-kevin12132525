package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    for(int i = 0; i < sWord.length(); i++){
            if(sWord.charAt(i) == 'a' || sWord.charAt(i) =='e'|| sWord.charAt(i) == 'i' || sWord.charAt(i) =='o' || sWord.charAt(i) == 'u')
                return i;
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(findFirstVowel(sWord) == -1){ return sWord + "ay"; }
        else if(findFirstVowel(sWord) == 0){ return sWord + "way"; }
        else if(sWord.length() >= 2 && sWord.substring(0, 2).equals("qu")){
            return sWord.substring(2) + "qu" + "ay";
        }
        else{
            int firstVowelIndex = findFirstVowel(sWord);
            String start = sWord.substring(0, firstVowelIndex);
            String end = sWord.substring(firstVowelIndex);
            return end + start + "ay";
        }
    }
}
