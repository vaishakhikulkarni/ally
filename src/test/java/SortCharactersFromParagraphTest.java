import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortCharactersFromParagraphTest {

    private static final String LOWERCASE = "a";
    private static final String UPPERCASE = " A";
    private static final String SPACE = " ";
    private static final String SPECIALCHARACTER = ".";
    private static final String EMPTY = "";

    @Test
    void inputStringNull_ReturnCharacter() {
        String input = null;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(EMPTY, actualOutput);
    }

    @Test
    void inputStringEmpty_ReturnCharacter() {
        String input = EMPTY;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(EMPTY, actualOutput);
    }

    @Test
    void inputSingleCharacter_ReturnCharacter() {
        String input = LOWERCASE;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(input, actualOutput);
    }

    @Test
    void inputSingleCharacterWithSpace_ReturnCharacterWithoutSpace() {
        String input = SPACE + LOWERCASE + SPACE;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(input.trim(), actualOutput);
    }

    @Test
    void inputSingleUpperCase_ReturnCharacterInLowerCase() {
        String input = SPACE + UPPERCASE;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(input.trim().toLowerCase(), actualOutput);
    }

    @Test
    void inputStringHasSpecialSymbols_ReturnStringsWithNoSpecialSymbols() {
        String input = UPPERCASE + SPACE + SPECIALCHARACTER;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("a", actualOutput);
    }

    @Test
    void twoSimilarCharactersHasSpaceBetweenThem_ReturnStringsWithNoSpaceBetweenCharacters() {
        String input = SPECIALCHARACTER + UPPERCASE + SPACE + LOWERCASE;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("aa", actualOutput);
    }

    @Test
    void inputString_returnNaturalSortedString() {
        String input = "test";
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("estt", actualOutput);
    }

    @Test
    void inputStringsWithSpecialSymbolUpperCase_returnNaturalSortedString() {
        String input = UPPERCASE + " test " + SPECIALCHARACTER + " sorting characters" + SPACE + SPECIALCHARACTER;
        String actualOutput = SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("aaacceeghinorrrssstttt", actualOutput);
    }
}