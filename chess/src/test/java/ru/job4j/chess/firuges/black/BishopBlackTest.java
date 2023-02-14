package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        Cell result = Cell.C8;
        Figure bishopBlack = new BishopBlack(result);
        assertThat(result).isEqualTo(bishopBlack.position());
    }

    @Test
    void copy() {
        Cell start = Cell.C8;
        Figure bishopBlack = new BishopBlack(start);
        Cell finish = Cell.E6;
        Cell finishPosition = bishopBlack.copy(finish).position();
        assertThat(finish).isEqualTo(finishPosition);
    }

    @Test
    void isDiagonalIsTrue() {
        Cell start = Cell.D7;
        BishopBlack bishopBlack = new BishopBlack(start);
        Cell finish = Cell.G4;
        assertThat(bishopBlack.isDiagonal(start, finish)).isTrue();
    }

    @Test
    void isDiagonalIsFalse() {
        Cell start = Cell.D7;
        BishopBlack bishopBlack = new BishopBlack(start);
        Cell finish = Cell.D5;
        assertThat(bishopBlack.isDiagonal(start, finish)).isFalse();
    }
}