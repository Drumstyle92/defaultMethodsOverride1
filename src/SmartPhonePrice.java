import java.util.Objects;

/**
 * @author Drumstyle92
 * Class that contains the variables producer and retail, methods with which you can clone,
 * compare two objects and print producer and retail. Implemented with the Cloneable interface.
 */
public class SmartPhonePrice implements Cloneable{
    String priceType;
    double priceInEuro;

    /**
     *
     * @return Return to the object created in the method.
     * @throws CloneNotSupportedException
     * Method that gives the possibility to clone objects.
     */
    @Override
    public SmartPhonePrice clone() throws CloneNotSupportedException {
        SmartPhonePrice clonedSmartPhonePrice = (SmartPhonePrice)super.clone();
        return clonedSmartPhonePrice;
    }

    /**
     *
     * @return shows if the cost type is producer or retail and the cost in euros.
     * method that prints the variables of the SmartPhonePrice class.
     */
    @Override
    public String toString() {
        return "SmartPhone price {" +
                "priceType= " + priceType + '\'' +
                "priceInEuro= " + priceInEuro +
                "}";
    }

    /**
     *
     * @param o Object to compare.
     * @return Returns the boolean result if the equality is true or false.
     * method that compares two objects correctly.
     */
    @Override
     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhonePrice that = (SmartPhonePrice) o;
        return Double.compare(that.priceInEuro, priceInEuro) == 0 && priceType.equals(that.priceType);
    }

    /**
     *
     * @return Returns from the memory pointer to a hash number.
     * method that changes the number from a memory pointer to a hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuro);
    }

    /**
     *
     * @param type parameter that indicates whether the cost type is wholesale or retail.
     * @param price The cost of the mobile phone in euros.
     * parameterized constructor method of the SmartPhonePrice class.
     */
    SmartPhonePrice(String type, double price){
        this.priceType = type;
        this.priceInEuro = price;
    }
}
