package ch.mobi.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

class Module1ClassTest {

    @Test
    void should_contains_correct_child() {
        Module2Class mockedChild = mock(Module2Class.class);
        Module1Class module = new Module1Class(mockedChild);
        assertSame(mockedChild, module.getChild());
    }
}