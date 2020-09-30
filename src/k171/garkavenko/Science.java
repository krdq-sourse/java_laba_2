package k171.garkavenko;

import java.util.Arrays;

public class Science {

    public int findSumOfOddIndexElements(int[] numberSet){
        int sum = 0;

        for(int i = 1; i < numberSet.length; i += 2) sum += numberSet[i];
        return sum;

    }

    public int findSumOfElementsBetweenNegaive(int[] numberSet){
        int sum = 0;

        int firstNegativeNumberIndex = -1;
        int lastNegativeNumberIndex = -1;

        for (int i = 0; i < numberSet.length; i++){
            if (numberSet[i] < 0) {
                firstNegativeNumberIndex = i;
                break;
            }
        }

        for(int i = numberSet.length - 1; i > 0; i--){
            if (numberSet[i] < 0) {
                lastNegativeNumberIndex = i;
                break;
            }
        }

        boolean borderOrEqualityExists = firstNegativeNumberIndex != -1 || lastNegativeNumberIndex != -1 || firstNegativeNumberIndex != lastNegativeNumberIndex;

        if (borderOrEqualityExists){
            for (int i = firstNegativeNumberIndex + 1; i < lastNegativeNumberIndex; i++) {
                sum += numberSet[i];
            }
        }

        return sum;
    }

    public char[] sortWord(char[] wordToSort){
        char[] sortedWord = wordToSort.clone();

        for(int i = 0; i < wordToSort.length; i++){
            for(int j = 0; j < wordToSort.length - 1; j++) {
                if((int) sortedWord[j] > (int) sortedWord[j + 1]) {
                    char temp = sortedWord[j];
                    sortedWord[j] = sortedWord[j + 1];
                    sortedWord[j + 1] = temp;
                }
            }
        }
        return sortedWord;
    }


    public int binarySearchInSorted(int numberToSearch, int[] toSort){

        int[] copy = toSort.clone();

        for(int i = 0; i < copy.length; i++){

            int highestNumberIndex = i;
            for(int j = 0; j < copy.length - 1; j++){

                if(copy[highestNumberIndex] < copy[j]){
                    highestNumberIndex = j;
                }

                int temp = copy[i];
                copy[i] = copy[highestNumberIndex];
                copy[highestNumberIndex] = temp;
            }
        }

        int searchedIndex = Arrays.binarySearch(copy, numberToSearch);

        return searchedIndex;
    }
}
