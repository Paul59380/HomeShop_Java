package com.genly.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {
    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
        Delivery relayDelivery = new RelayDelivery(5);
        assertEquals(0.0, relayDelivery.getPrice(), 0.01);
    }
    @Test
    public void Given_LowPriceRelay_WhenGettingDeliveryPrice_ThenGet2e99() {
        Delivery relayDelivery = new RelayDelivery(27);
        assertEquals(2.99, relayDelivery.getPrice(), 0.01);
    }
    @Test
    public void Given_HighPriceRelay_WhenGettingDeliveryPrice_ThenGet4e99() {
        Delivery relayDelivery = new RelayDelivery(52);
        assertEquals(4.99, relayDelivery.getPrice(), 0.01);
    }
}