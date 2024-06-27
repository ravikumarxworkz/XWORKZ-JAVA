package com.modal.bankApp.service;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.exception.InsuffiucentBalnce;

public class EmiTranstion {

    private final BankAppService bankAppService = new BankAppServiceImpl();

    public synchronized void emiProcess(CreateBankAccount bankAccount) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " transaction initiated.....");
            bankAppService.depositAmount(bankAccount, 10000);
        }, "Paytm");

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " initiated.....");
            try {
                bankAppService.withdrawalAmount(bankAccount, 30000);
            } catch (InsuffiucentBalnce e) {
                e.printStackTrace();
            }
        }, "EMI process");

        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " transaction initiated.....");
            bankAppService.depositAmount(bankAccount, 10000);
        }, "Salary");

        try {
            t2.start();
           // t2.join();  // Ensure t2 completes before starting t1 and t3

            Thread.sleep(5000);

            t1.start();
           // t1.join();  // Ensure t1 completes before starting t3

            Thread.sleep(5000);

            t3.start();
           // t3.join();  // Ensure t3 completes before proceeding
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
