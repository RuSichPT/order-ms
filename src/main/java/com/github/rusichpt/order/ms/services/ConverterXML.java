package com.github.rusichpt.order.ms.services;

import com.github.rusichpt.order.ms.entities.Order;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.StringWriter;

public class ConverterXML {

    public static String convert(Order order) {

        StringWriter writer = new StringWriter();

        if (order != null) {

            try {
                JAXBContext context = JAXBContext.newInstance(Order.class);

                Marshaller marshaller = context.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                marshaller.marshal(order, writer);

            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }

        return writer.toString();
    }

}
