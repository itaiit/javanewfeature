package userfuncimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc{

    @Override
    public String getName() {
        return "AbsPlus";
    }

    @Override
    public int func(int a, int b) {
        return a + b;
    }
    
}
