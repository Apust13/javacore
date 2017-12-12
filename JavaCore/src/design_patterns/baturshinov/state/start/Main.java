package design_patterns.baturshinov.state.start;

import design_patterns.baturshinov.state.context.TransformerContext;
import design_patterns.baturshinov.state.state.FireState;
import design_patterns.baturshinov.state.state.MoveState;
import design_patterns.baturshinov.state.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
