package com.udacity.projects.gradle.jokes;

import org.junit.Test;

public class MyJokesTest {
    @Test
    public void testGetJoke(){
        MyJokes jokes = new MyJokes();
        assert jokes.getJoke().length() > 0;
    }
}