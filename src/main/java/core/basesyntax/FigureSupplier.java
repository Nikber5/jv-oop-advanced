package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    final int RANDOM_LIMIT = 100;

    private final Figure[] figures = new Figure[] {
            new Circle(new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor()),
            new Triangle(new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor()),
            new Square(new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor()),
            new Rectangle(new Random().nextInt(RANDOM_LIMIT), new Random().nextInt(RANDOM_LIMIT),
                    ColorSupplier.randomColor()),
            new IsoscelesTrapezoid(new Random().nextInt(RANDOM_LIMIT), new Random().nextInt(RANDOM_LIMIT),
                    new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor())};

    public Figure getRandomFigure() {
        return figures[new Random().nextInt(figures.length)];
    }
}
