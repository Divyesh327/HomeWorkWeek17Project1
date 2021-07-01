package com.nopcommerce.demo.propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader
{
        //Declare the PropertyReader variable
        private static volatile com.nopcommerce.demo.propertyreader.PropertyReader propInstance;

        //Create Private constructor Because of prevent the Instantiation of class
        private PropertyReader() {

        }

        /**
         * This method will return instance of PropertyReader class
         * @return
         */
        public static synchronized com.nopcommerce.demo.propertyreader.PropertyReader getInstance(){
            if (propInstance == null){
                propInstance = new com.nopcommerce.demo.propertyreader.PropertyReader();
            }
            return propInstance;
        }

        /**
         * This method will read property from property file
         * @param propertyName
         * @return
         */
        public String getProperty(String propertyName){

            Properties prop = new Properties();
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\propertiesfile\\config.properties");
                prop.load(inputStream);
                if (prop.getProperty(propertyName) != null){
                    return prop.getProperty(propertyName);
                }
            } catch (Exception e) {
                System.out.println("Property not found");
            }
            return null;
        }


}