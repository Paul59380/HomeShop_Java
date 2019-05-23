package com.genly.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    private String output;
    private Writer writerMock = new Writer() {
        @Override
        public void start() {
            output = "";
        }

        @Override
        public void writeLine(String line) {
            output += line + "%n";
        }

        @Override
        public void stop() {

        }
    };

    private Product cafe = new Product("Phillips HD7888546/61",
            "Phillips SENSEO Quandrante Noir - 1 ou 2 tasses", 79.99);
    private Television tv = new Television("TV Samsung D6R27-H59P",
            "Smart TV LED incurvée 49\"", 599, 49, "LED");
    private Fridge fridge = new Fridge("BEKO TSE 1042 F",
            "Réfrigirateur BEKO 130L -Classe A - Blanc", 189, 130, false);
    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostDelivery = new RelayDelivery(27);

    @Test
    public void Given_2productsAndDelivery_WhenGeneratingBill_Then_goodLineNumber() {
        Bill bill = new Bill(customer, lowCostDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.generate(writerMock);
        int lineNumber = output.split("%n").length;
        assertEquals(20, lineNumber);
    }
    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, lowCostDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        assertEquals(870.98, bill.getTotal(), 0.01);
    }
}