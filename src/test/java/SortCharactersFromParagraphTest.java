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

}