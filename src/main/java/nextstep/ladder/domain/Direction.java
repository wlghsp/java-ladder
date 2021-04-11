package nextstep.ladder.domain;

public enum Direction {
    DOWN(0),
    RIGHT(1),
    LEFT(-1);

    private final int nextIndex;

    Direction(int nextIndex) {
        this.nextIndex = nextIndex;
    }

    public int nextIndex() {
        return nextIndex;
    }
}
