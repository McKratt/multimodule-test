package ch.mobi.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

class Module1ClassTest {

    @Test
    void should_contains_correct_child() {
        var mockedChild = mock(Module2Class.class);
        var module = new Module1Class(mockedChild);
        assertSame(mockedChild, module.getChild());
    }
}