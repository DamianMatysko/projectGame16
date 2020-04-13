package game;


public class Game {
    private Field field;
    private State state;


    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Game() {
        //state = State.READY;
        this.field = new Field();
        this.state = State.READY;
    }
    public void start() {
        /*
        if (state == State.READY) {
            state = State.RUNNING;
            field = new Field();
            field.shuffle();
        }

         */
        if (state==State.READY) {
            state = State.RUNNING;
        }
        field.shuffle();
    }
    public void end() {
        if (state == State.RUNNING) {
            state = State.FINISHED;
            field = null;
        }
    }
    public void reset() {
        if(state != State.READY) {
            state = State.READY;
            field = null;
        }
    }
    public void nextMove(int code) {
        if(state == State.RUNNING) {
            field.toggleTiled(code);

            if(field.isWinner()) {
                System.out.println("You won");
                end();
            }
        }
    }
}
