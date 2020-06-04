package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("f/123"));
        //when
        Order orderResult = warehouse.getOrder("f/123");
        //then
        assertEquals(new Order("f/123"), orderResult);
    }

    @Test (expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order orderResult = warehouse.getOrder("abc/123");
    }

}