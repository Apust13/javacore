package com.apust.design_patterns.baturshinov.state.start;

import com.apust.design_patterns.baturshinov.state.context.TransformerContext;
import com.apust.design_patterns.baturshinov.state.state.FireState;
import com.apust.design_patterns.baturshinov.state.state.MoveState;
import com.apust.design_patterns.baturshinov.state.state.TransformerState;

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
