import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordsReverser {
	 private String inputText;

	    public String getInputText() {
	        return inputText;
	    }

	    public void setInputText(String inputText) {
	        this.inputText = inputText;
	    }

	    public String reverse(String text){

	        String[] words = text.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            char[] sourceWord = word.toCharArray();
	            char[] resultWord = new char[sourceWord.length];

	            for (int i = 0; i < sourceWord.length; i++) {
	                if (!Character.isLetter(sourceWord[i])) {
	                    resultWord[i] = sourceWord[i];
	                }
	            }
	            for (char c : sourceWord) {
	                if (Character.isLetter(c)) {
	                    for (int j = resultWord.length - 1; j >= 0; j--) {
	                        if (resultWord[j] == 0) {
	                            resultWord[j] = c;
	                            break;
	                        }
	                    }
	                }
	            }
	            result.append(resultWord).append(" ");
	        }
	        return new String(result).trim();
	    }

	    public static String readInputText() throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        return reader.readLine();
	    }

	    public static void main(String[] args) {
	        WordsReverser wordsReverser = new WordsReverser();
	        System.out.println("Type words to Reverse");
	        try{
	            while (true){
	                wordsReverser.setInputText(readInputText());
	                if(wordsReverser.getInputText().length()>0) {
	                    System.out.println(wordsReverser.reverse(wordsReverser.getInputText()));
	                }else{
	                    break;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Wrong input data"); 
	        }
	    }
}
