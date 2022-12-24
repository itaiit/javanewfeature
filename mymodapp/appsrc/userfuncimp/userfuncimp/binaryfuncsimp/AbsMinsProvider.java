package userfuncimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinsProvider implements BinFuncProvider {

    @Override
    public BinaryFunc get() {
        return new AbsMinus();
    }
    
}
