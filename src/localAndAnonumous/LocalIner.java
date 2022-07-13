package localAndAnonumous;
// create local inner and anonymous classes
public class LocalIner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getresult();

  /*      Math m1 = new Math() {
            public int sum (int a, int b) { // anonymous class
                return a+b;
            }
        };*/
    }
}

class Math {
    public void getresult () {
        class Divided { // local inner class
            private int divisible;
            private int devider;

            public int getDivisible() {
                return divisible;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public int getDevider() {
                return devider;
            }

            public void setDevider(int devider) {
                this.devider = devider;
            }

            public int getQuotient () {
                return devider / divisible;
            }
            public int remainderOfDivision () {
                return devider % divisible;
            }
        }
        Divided divided = new Divided();
        divided.setDevider(15);
        divided.setDivisible(2);
        System.out.println(divided.remainderOfDivision());
    }
}
