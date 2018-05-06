public class Inovice implements PayAble,YearSalery,Package,BonousCal{

    private int inoviceNumber;
    private String partId;
    private double price;
    private int quantity;
    private String description;

    public Inovice(int inoviceNumber, String partId, double price, int quantity, String description) {
        this.inoviceNumber = inoviceNumber;
        this.partId = partId;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getInoviceNumber() {
        return inoviceNumber;
    }

    public void setInoviceNumber(int inoviceNumber) {
        this.inoviceNumber = inoviceNumber;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrition) {
        this.description = description;
    }

    @Override
    public double paymentAmount() {
        return 7647;
    }

    @Override
    public double totalSalery() {

        double tSal = paymentAmount() * 12;
        return tSal;
        }
    }

    @Override
    public double bonousPerYear() {
        if (paymentAmount() * 12 > 4643){
         }
        else{
            System.out.println("No bonou0s is alloted");
        }

//    @Override
//    public double calBonous() {
//       if(paymentAmount() * 12 > 79765){
//
//           double tSal = paymentAmount() * 12;
//           double bonousGet = tSal / 5;
//           return bonousGet;
//       }
//    }
