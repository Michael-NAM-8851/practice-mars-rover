package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_go_to_0_1_N_when_execute_command_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_execute_command_given_0_0_E_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_1_0_S_when_execute_command_given_1_1_S_M() {
        //given
        MarsRover marsRover = new MarsRover(1,1,"S");
        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }
}
