// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WordWrapTest {
    //Using Small Words
    @Test
    void isDogTrue() {
        int boundary = 1;
        String word = "dog";
        String expected = "d\no\ng\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isWowTrue() {
        int boundary = 1;
        String word = "wow";
        String expected = "w\no\nw\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isHiTrue() {
        int boundary = 1;
        String word = "hi";
        String expected = "h\ni\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isFunnyTrue() {
        int boundary = 5;
        String word = "funny";
        String expected = "funny";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //Using Large Words
    @Test
    void isOnomatopoeiaTrue() {
        int boundary = 4;
        String word = "Onomatopoeia";
        String expected = "Onom\natop\noeia\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isElephantTrue() {
        int boundary = 2;
        String word = "Elephant";
        String expected = "El\nep\nha\nnt\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //Testing differnt word breaks
    @Test
    void isAdvancedjavaTrue() {
        int boundary = 4;
        String word = "Advancedjava";
        String expected = "Adva\nnced\njava\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isMarcEncarnacionTrue() {
        int boundary = 5;
        String word = "MarcEncarnacion";
        String expected = "MarcE\nncarn\nacion\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isComputerTrue() {
        int boundary = 4;
        String word = "computer";
        String expected = "comp\nuter\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isHelloWorldTrue() {
        int boundary = 5;
        String word = "helloWorld";
        String expected = "hello\nWorld\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //Testing differnt word breaks
    @Test
    void isSupercalifragilisticexpialidociousTrue() {
        int boundary = 2;
        String word = "supercalifragilisticexpialidocious";
        String expected = "su\npe\nrc\nal\nif\nra\ngi\nli\nst\nic\nex\npi\nal\nid\noc\nio\nus\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isHippopotomonstrosesquippedaliophobiaTrue() {
        int boundary = 12;
        String word = "Hippopotomonstrosesquippedaliophobia";
        String expected = "Hippopotomon\nstrosesquipp\nedaliophobia\n";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //The boundary is greater than the word length, so the output would be the word itself
    @Test
    void isRiouxTrue() {
        int boundary = 20;
        String word = "Rioux";
        String expected = "Rioux";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isSimulatorTrue() {
        int boundary = 100;
        String word = "Simulator";
        String expected = "Simulator";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //The boundary is less than 0, so the output would be the word itself
    @Test
    void isJavaTrue() {
        int boundary = -5;
        String word = "Java";
        String expected = "Java";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isAppleTrue() {
        int boundary = -1000;
        String word = "Apple";
        String expected = "Apple";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //The boundary is the same length as the word, so the output is the word itself
    @Test
    void isCalculatorTrue() {
        int boundary = 10;
        String word = "calculator";
        String expected = "calculator";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isCyberDojoTrue() {
        int boundary = 9;
        String word = "cyberDojo";
        String expected = "cyberDojo";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    //The string length is equal to 0, so the output would be the word itself
    @Test
    void isBlankTrue() {
        int boundary = 5;
        String word = "";
        String expected = "";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual);
    };
    @Test
    void isAnotherBlankTrue() {
        int boundary = 0;
        String word = "";
        String expected = "";
        String actual = WordWrap.answer(boundary, word);
        assertEquals(expected, actual); 
    };
}
