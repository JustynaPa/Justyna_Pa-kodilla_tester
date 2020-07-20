package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInvoiceRepositorySave(){
        //given
        Item item = new Item(new BigDecimal(1), 11, new BigDecimal(4), new Product("Beer"));
        Item item2 = new Item(new BigDecimal(2), 12, new BigDecimal(5), new Product("Bread"));
        Item item3 = new Item(new BigDecimal(3), 13, new BigDecimal(6), new Product("Butter"));

        Product product = new Product("Breakfast");
        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        List<Item> itemsList = new ArrayList<>();
        Invoice invoice = new Invoice("2020/07/21", itemsList);
        itemsList.add(item);
        itemsList.add(item2);
        itemsList.add(item3);

        //when
        productRepository.save(product);
        invoiceRepository.save(invoice);

        int id = invoice.getId();
        //then
        Assert.assertNotEquals(0, id);
        //cleanUp
        try {
            invoiceRepository.deleteById(id);
        } catch (Exception e){
            //do nothing
        }

    }
}

