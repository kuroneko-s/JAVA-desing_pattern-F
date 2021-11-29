package com.inflearn.desing_pattern.abstractfactory;

import com.inflearn.desing_pattern.factorymethod.Ship;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

@Component
public class AbstractFactoryRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        WhiteshipFactory whiteshipFactory = new WhiteshipFactory(new ShipProPartsFactory());
        Ship ship = whiteshipFactory.createShip();

        System.out.println(ship.getWheel().getClass());
        System.out.println(ship.getAnchor().getClass());

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/config.xml"));
        System.out.println(document.getDocumentElement());

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
//        Ship whiteship = context.getBean("whiteship", Ship.class);
//        System.out.println(whiteship.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ShipFactory shipFactoryByBean = context.getBean(ShipFactory.class);
        System.out.println(shipFactoryByBean);
        Ship shipByBean = context.getBean(Ship.class);
        System.out.println(shipByBean);
    }
}
