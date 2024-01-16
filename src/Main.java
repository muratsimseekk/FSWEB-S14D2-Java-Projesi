import com.workintech.hw.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("************ Project Starts ***************");

        Bedroom bedroom = new Bedroom("Cocuk" , new Wall("Sol Duvar") , new Wall("Sag Duvar"), new Wall("Karsi Duvar") ,
                new Wall("Arka Duvar") ,new Ceiling(100 , PaintColor.ORANGE) ,
                new Bed("Visco",2,70,2,1) ,new Lamp(LampType.TABLE,true,9),
                new Wardrobe(120,210,35),new Carpet(250,600,PaintColor.BROWN)
        );

        System.out.println(bedroom.getCeiling().getHeight());
        System.out.println(bedroom.getBed());
        bedroom.getLamp().turnOn();

        Room room = new Room("Cocuk Odasi" , new Bedroom("En kucuk cocuk odasi",new Wall("Arka duvar") ,new Wall("On duvar") ,
                new Wall("Yan duvar") , new Wall("Diger yan duvar") , new Ceiling(250 , PaintColor.RED) ,
                new Bed("Kaz Tuyu Yatak" ,4,120,3,2) ,new Lamp( LampType.WALL ,true,7),new Wardrobe(230,230,60),new Carpet(100,220,PaintColor.YELLOW)));

        room.getBedroom().getLamp().turnOn();
        room.getBedroom().getCeiling().create();
        System.out.println(room.getBedroom().getBed().getSheets());
        room.getBedroom().getBed().make();
    }
}