package ch.mobi.test;

public class Module1Class {
    private final Module2Class child;


    public Module1Class(Module2Class child) {
        this.child = child;
    }

    public static void main(String[] args) {
        Module1Class module = new Module1Class(new Module2Class());
        System.out.println("Child is " + module.getChild());
    }

    public Module2Class getChild() {
        return child;
    }
}
