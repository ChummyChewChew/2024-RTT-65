package introtojavabasics2;

public class InvalidProductException extends Exception {
    public InvalidProductException(String s) {
        //call constructor of the parent class - Exception
        super(s);
    }

    public static class ProductInfo{
        public void productCheck(double weight) throws InvalidProductException{
            if (weight<100){
                throw  new InvalidProductException("Product weight is low");
            }
        }
    }

    public static void main(String[] args) {
        ProductInfo obj = new ProductInfo();
        try{
            obj.productCheck(100);
        } catch (InvalidProductException e) {
            System.out.println("Caught the exception!");;
            System.out.println(e.getMessage());
        }
    }
}