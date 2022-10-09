package Shildt.chapter9.example1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Constructor of basic class");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class Derived extends Protection {
    Derived () {
        System.out.println("Constructor of subclass");
        System.out.println("n = " + n);

        //�������� ������ ��� ������
        //System.out.println("n_pri = 4" + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Constructor from this package");
        System.out.println("n = " + p.n);

        //�������� ������ ��� ������
        //System.out.println("n_pri = 4" + n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}


