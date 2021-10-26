package com.mthree.c130.vendingMachine;

import com.mthree.c130.vendingMachine.controller.VendingMachineController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
      appContext.scan("com.mthree.c130.vendingMachine");
      appContext.refresh();

      VendingMachineController controller = appContext.getBean("vendingMachineController", VendingMachineController.class);
      controller.run();
   }
}
