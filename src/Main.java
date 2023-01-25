import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

//        Swimable[] okanarium = {
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Turlte(),
//                new Turlte(),
//                new Turlte(),
//                new Turlte(),
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Duck()
//        };
//
//        for (Swimable swimable : okanarium) {
//            swimable.swim();
//        }


        Bread bread=new Bread();
        Cupcake cupcake=new Cupcake();
        Bun bun=new Bun();
        bread.baked();
        cupcake.baked();
        bun.baked();
    }
}