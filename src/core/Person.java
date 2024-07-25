package core;

interface UnionBudget {
    int slabBelow3Lacs();
}

class NirmalaSitaraman implements UnionBudget {


    int slabBelow5Lacs() {
        return 0;
    }

    int slabBelow10Lacs() {
        return 0;
    }

    @Override
    public int slabBelow3Lacs() {
        return 0;
    }
}

class ShashiTharoor implements  UnionBudget {
    @Override
    public int slabBelow3Lacs() {
        return 0;
    }

    int slabBelow7Lacs() {
        return 0;
    }

    int slabBelow12Lacs() {
        return 0;
    }
}

class FutureFM implements UnionBudget {
    int slabBelow6Lacs() {
        return 0;
    }

    int slabBelow8Lacs() {
        return 0;
    }

    int slabBelow13Lacs() {
        return 0;
    }

    @Override
    public int slabBelow3Lacs() {
        return 0;
    }
}