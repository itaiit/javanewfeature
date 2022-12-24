module userfuncimp {
    requires userfuncs;
    provides userfuncs.binaryfuncs.BinFuncProvider with
        userfuncimp.binaryfuncsimp.AbsMinsProvider,
        userfuncimp.binaryfuncsimp.AbsPlusProvider;
}
