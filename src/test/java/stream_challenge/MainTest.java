package stream_challenge;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void challengeOne() {
        LocalDate result = Main.challenge();
        assertEquals(LocalDate.of(2022, 1, 1), result);
    }
}
