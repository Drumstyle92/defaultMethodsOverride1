import java.util.Objects;

/**
 * @author Drumstyle92
 * Class that has parameters and methods for cellular objects.
 */
public class SmartPhone implements Cloneable {
    String brandName;
    String modelName;
    int batterymAh;
    public SmartPhonePrice producerPrice;
    public SmartPhonePrice retailPrice;

    /**
     *
     * @return Returns all the variables of the SmartPhone class.
     * Method that prints all the variables of the class.
     */
    @Override
    public String toString() {
        return  "SmartPhone:\n" +
                " ***** brandName= " + brandName + "\n " +
                "**********" +
                " modelName= " + modelName + "\n " +
                "***************" +
                " batterymAh= " + batterymAh + "\n " +
                "********************" +
                " producerPrice= " + producerPrice + "\n " +
                "*************************" +
                " retailPrice= " + retailPrice +
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
        SmartPhone that = (SmartPhone) o;
        return batterymAh == that.batterymAh && brandName.equals(that.brandName) && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice) && retailPrice.equals(that.retailPrice);
    }

    /**
     *
     * @return Returns from the memory pointer to a hash number.
     * method that changes the number from a memory pointer to a hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    /**
     *
     * @return Return to the object created in the method.
     * @throws CloneNotSupportedException
     * Method that gives the possibility to clone objects.
     */
    @Override
    public  SmartPhone clone() throws CloneNotSupportedException {
        SmartPhone clonedSmartPhone = (SmartPhone)super.clone();
        clonedSmartPhone.producerPrice = this.producerPrice.clone();
        clonedSmartPhone.retailPrice = this.retailPrice.clone();
        return clonedSmartPhone;
    }

    /**
     *
     * @param brand mobile phone name.
     * @param model cellphone model.
     * @param battery battery parameter of the product.
     * @param prodP parameter of the wholesale cost of the product.
     * @param retailP parameter of the retail cost of the product.
     * constructor method of the SmartPhone class.
     */
    SmartPhone(String brand, String model, int battery,SmartPhonePrice prodP, SmartPhonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}
