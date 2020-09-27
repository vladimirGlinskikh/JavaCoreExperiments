package core.fields.restrictions;

 class UseBeforeDeclaration {
    static {
        int x = 100;
        int y = x + 1;
//        System.out.println(y);
        int v = x = 3;
//        System.out.println(v);
//        int z = UseBeforeDeclaration.x * 2;

        Object o = new Object() {
            void foo() {
//                x++;
            }

            {
//                x++;
            }
        };

        int j = 200;
         j += 1;
        int k = j = j + 1;
        System.out.println(k);
        int n = j = 300;
        System.out.println(n);
        int h = j++;
        System.out.println(h);
//        int l = this.j * 3;
    }

    public static void main(String[] args) {
        new UseBeforeDeclaration();
    }
}
