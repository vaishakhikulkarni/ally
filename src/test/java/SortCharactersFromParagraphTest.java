import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortCharactersFromParagraphTest {

    @Test
    void inputSingleCharacter_ReturnCharacter() {
        String input = "t";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(input,actualOutput);
    }

    @Test
    void inputSingleCharacterWithSpace_ReturnCharacterWithoutSpace() {
        String input = " t ";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(input.trim(),actualOutput);
    }

    @Test
    void inputSingleUpperCase_ReturnCharacterInLowerCase() {
        String input = " T ";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals(input.trim().toLowerCase(),actualOutput);
    }

    @Test
    void inputStringHasSpecialSymbols_ReturnStringsWithNoSpecialSymbols() {
        String input = " T. ";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("t",actualOutput);
    }

    @Test
    void twoSimilarCharactersHasSpaceBetweenThem_ReturnStringsWithNoSpaceBetweenCharacters() {
        String input = " T. t";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("tt",actualOutput);
    }

    @Test
    void inputString_returnNaturalSortedString() {
        String input = "test";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("estt",actualOutput);
    }

    @Test
    void inputStringsWithSpecialSymbolUpperCase_returnNaturalSortedString() {
        String input = "test sorting characters";
        String actualOutput =SortCharactersFromParagraph.sortInputData(input);
        Assertions.assertEquals("aacceeghinorrrssstttt",actualOutput);
    }
}