package ma.enset.patterns.strategy;

import ma.enset.Entities.Figure;

import java.util.List;

public interface Strategy {
    public void traiter(List<Figure> figures);
}
