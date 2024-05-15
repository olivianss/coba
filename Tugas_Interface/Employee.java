package Tugas_Interface;
public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;
    private int invoiceCount;

    public Employee(int registrationNumber, String name, int salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new Invoice[100];  
        this.invoiceCount = 0;
    }

    public void addInvoice(Invoice invoice) {
        if (invoiceCount < invoices.length) {
            invoices[invoiceCount++] = invoice;
        } else {
            System.out.println("Maksimal jumlah transaksi tercapai.");
        }
    }

    @Override
    public double getPayableAmount() {
        double total = 0;
        for (int i = 0; i < invoiceCount; i++) {
            total += invoices[i].getPayableAmount();
        }
        return total;
    }

    public double getFinalSalary() {
        return salaryPerMonth - getPayableAmount();
    }

    public void displayEmployeeDetails() {
        System.out.println("============== EMPLOYEE STATS ==============");
        System.out.printf("%-20s : %s%n", "Nama", name);
        System.out.printf("%-20s : %d%n", "Registrasi Number", registrationNumber);
        System.out.printf("%-20s : Rp %,10d.00%n", "Gaji Awal", salaryPerMonth);
        System.out.println("Detail Belanja       :");
        for (int i = 0; i < invoiceCount; i++) {
            System.out.println(" - " + invoices[i]);
        }
        System.out.println("============================================");
        System.out.printf("%-20s : Rp %,10d.00%n", "Total Belanja", (int) getPayableAmount());
        System.out.printf("%-20s : Rp %,10d.00%n", "Gaji Akhir", (int) getFinalSalary());
        System.out.println("============================================");
    }
}

