public class Main {
    public static void main(String[] args) {
        // Membuat objek DataList
        DataList dataList = new DataList();

        // Menambahkan beberapa data ke dalam DataList
        dataList.addData(new Data(1, "Data 1"));
        dataList.addData(new Data(2, "Data 2"));
        dataList.addData(new Data(3, "Data 3"));
        dataList.addData(new Data(4, "Data 4"));
        dataList.addData(new Data(5, "Data 5"));

        // Menampilkan data sebelum pengurutan
        System.out.println("Data sebelum pengurutan:");
        dataList.displayData();

        // Melakukan pengurutan menggunakan bubble sort
        dataList.bubbleSort();

        // Menampilkan data setelah pengurutan
        System.out.println("\nData setelah pengurutan:");
        dataList.displayData();

        // Melakukan pencarian linear
        int searchValue = 3;
        Data resultLinear = dataList.searchDataLinear(searchValue);
        if (resultLinear != null) {
            System.out.println("\nData dengan nilai " + searchValue + " ditemukan secara linear: " + resultLinear.getDescription());
        } else {
            System.out.println("\nData dengan nilai " + searchValue + " tidak ditemukan secara linear.");
        }

        // Melakukan pencarian biner
        searchValue = 8;
        Data resultBinary = dataList.searchDataBinary(searchValue);
        if (resultBinary != null) {
            System.out.println("\nData dengan nilai " + searchValue + " ditemukan secara biner: " + resultBinary.getDescription());
        } else {
            System.out.println("\nData dengan nilai " + searchValue + " tidak ditemukan secara biner.");
        }
    }
}
