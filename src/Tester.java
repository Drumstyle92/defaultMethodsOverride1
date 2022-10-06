/**
 * @author Drumstyle92
 * Class containing the main.
 */
public class Tester {
    /**
     *
     * @param args main method parameter.
     * method that embeds objects and displays the result of the program.
     */
    public static void main(String[] args){
    // Objects created by the SmartPhonePrice class.
    SmartPhonePrice producerPrice1 = new SmartPhonePrice(" Cellular ",12);
    SmartPhonePrice producerPrice2 = new SmartPhonePrice(" Smartphone ",250);
    SmartPhonePrice retailPrice1 = new SmartPhonePrice(" Cellular ",35);
    SmartPhonePrice retailPrice2 = new SmartPhonePrice(" Smartphone ",320);

    // Objects created by the SmartPhone class.
    SmartPhone cellular1 = new SmartPhone(" Brondi "," C1 senior ",5000,producerPrice1,retailPrice1);
    SmartPhone smartPhone2 = new SmartPhone(" OPPO "," A91 ",4300,producerPrice2,retailPrice2);
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(cellular1);
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(smartPhone2);
    boolean out = cellular1.equals(smartPhone2);
    System.out.println("-------------------------------------------------------------------------");
    System.out.println("Is the first mobile the same as the second ?? " + out);
    System.out.println("-------------------------------------------------------------------------");
    try { SmartPhone clonedSmartPhone1 = smartPhone2.clone();
        boolean out1 = clonedSmartPhone1.equals(smartPhone2);
        System.out.println("Is the clone the same as the second cell phone ?? " + out1);
    }catch(Exception e){
        e.printStackTrace();
        System.out.println(" Error ");
    }
}
}
