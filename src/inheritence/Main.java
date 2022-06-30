package inheritence;

import inheritence.phone.Smatphone;

public class Main {
    public static void main(String[] args) {

        Smatphone iphone = new Smatphone("Apple", 2018,
                14.5, true, "IOS", 14.3);

        iphone.call();
        iphone.ring();
    }
}
