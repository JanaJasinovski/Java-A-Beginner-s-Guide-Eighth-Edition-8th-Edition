package Beans;

import java.beans.*;

public class InspectorDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);
            PropertyDescriptor[] propertyDescriptor =
                    beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor descriptor : propertyDescriptor) {
                System.out.println(descriptor.getName());
            }

            EventSetDescriptor[] eventSetDescriptors =
                    beanInfo.getEventSetDescriptors();

            for (EventSetDescriptor eventSetDescriptor : eventSetDescriptors) {
                System.out.println(eventSetDescriptor.getName());
            }
        } catch (ClassNotFoundException | IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
