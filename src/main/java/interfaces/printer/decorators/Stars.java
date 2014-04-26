package interfaces.printer.decorators;

import interfaces.printer.ITextDecorator;

/**
 * Created by никита on 04.01.14.
 */
public class Stars implements ITextDecorator {
    @Override
    public void printLine() {
        System.out.println("********************");
    }
}
