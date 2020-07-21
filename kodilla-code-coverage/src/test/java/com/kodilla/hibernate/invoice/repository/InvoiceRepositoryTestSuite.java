package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.InvoiceRepository;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave(){

        //given
        Item item = new Item(new BigDecimal(3), new BigDecimal(6), new Product("Beer"));
        Item item2 = new Item(new BigDecimal(4), new BigDecimal(8), new Product("Bread"));
        Item item3 = new Item(new BigDecimal(5), new BigDecimal(10), new Product("Butter"));

        Product product = new Product("Breakfast");
        Invoice invoice = new Invoice("2020/07/21");

        product.getItem().add(item);
        product.getItem().add(item2);
        product.getItem().add(item3);
        invoice.getInvoiceItems().add(item);
        invoice.getInvoiceItems().add(item2);
        invoice.getInvoiceItems().add(item3);
        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //when
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        invoiceRepository.deleteById(id);
    }
}

