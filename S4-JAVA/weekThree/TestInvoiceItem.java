package weekThree;

public class TestInvoiceItem {
    
        public static void main(String[] args){
            InvoiceItem I1 = new InvoiceItem("1234", "apple", 10, 10.0);
            InvoiceItem I2 = new InvoiceItem("1235", "banana", 100, 20.0);
            System.out.println(I1.toString());
            System.out.println(I2.toString());
            System.out.println(InvoiceItem.getInvoiceCount());
            System.out.println(I1.getTotal());
        }
    
}


