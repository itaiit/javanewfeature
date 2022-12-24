package userfuncimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinus implements BinaryFunc{

    @Override
    public String getName() {
        return "AbsMins";
    }

    @Override
    public int func(int a, int b) {
        return a - b;
    }
    
}
