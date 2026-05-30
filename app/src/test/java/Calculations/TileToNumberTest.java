package Calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import SelfDefinedErrors.InvalidTileError;

public class TileToNumberTest {

    public static final boolean playerColour = false;

    @Test
    public void invalidStartTileLengthTooLong() {
        TilePackage testPackage = new TilePackage(playerColour, "a11", "a2");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid Start Tile Length.", exception.getMessage());
        assertEquals("a11", exception.getErrorTile());
    }

    @Test
    public void invalidEndTileLengthTooLong() {
        TilePackage testPackage = new TilePackage(playerColour, "a1", "a22");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid End Tile Length.", exception.getMessage());
        assertEquals("a22", exception.getErrorTile());
    }

    @Test
    public void invalidStartRankChar() {
        TilePackage testPackage = new TilePackage(playerColour, "a!", "a2");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid Start Rank Character.", exception.getMessage());
        assertEquals("a!", exception.getErrorTile());
    }

    @Test
    public void invalidEndRankChar() {
        TilePackage testPackage = new TilePackage(playerColour, "a1", "a½");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid End Rank Character.", exception.getMessage());
        assertEquals("a½", exception.getErrorTile());
    }

    @Test
    public void invalidStartFile() {
        TilePackage testPackage = new TilePackage(playerColour, "i1", "a2");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid Start File.", exception.getMessage());
        assertEquals("i1", exception.getErrorTile());
    }

    @Test
    public void invalidEndFile() {
        TilePackage testPackage = new TilePackage(playerColour, "a1", "52");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid End File.", exception.getMessage());
        assertEquals("52", exception.getErrorTile());
    }

    @Test
    public void invalidStartRank() {
        TilePackage testPackage = new TilePackage(playerColour, "a9", "a2");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid Start Rank.", exception.getMessage());
        assertEquals("a9", exception.getErrorTile());
    }

    @Test
    public void invalidEndRank() {
        TilePackage testPackage = new TilePackage(playerColour, "a1", "a0");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Invalid End Rank.", exception.getMessage());
        assertEquals("a0", exception.getErrorTile());
    }

    @Test
    public void invalidEndTile() {
        TilePackage testPackage = new TilePackage(playerColour, "a1", "a1");
        TileToNumber testCalc = new TileToNumber();

        InvalidTileError exception = assertThrows(InvalidTileError.class, () -> {
            testCalc.tileToNumber(testPackage);
        });

        assertEquals("Start Tile Equals End Tile.", exception.getMessage());
        assertEquals("a1", exception.getErrorTile());
    }

    @Test
    public void ValidStartAndEndTile() {
        TilePackage testPackage = new TilePackage(playerColour, "a1", "d3");
        TileToNumber testCalc = new TileToNumber();

        testCalc.tileToNumber(testPackage);

        assertEquals(7,testPackage.getStartTileI());
        assertEquals(20,testPackage.getEndTileI());
        assertEquals(13, testPackage.getDistance());

    }
}
