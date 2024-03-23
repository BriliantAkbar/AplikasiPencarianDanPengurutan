import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DataList {
    private List<Data> dataList;

    public DataList() {
        dataList = new ArrayList<>();
    }

    public void addData(Data data) {
        dataList.add(data);
    }

    public void removeData(Data data) {
        dataList.remove(data);
    }

    public Data searchDataLinear(int value) {
        for (Data data : dataList) {
            if (data.getValue() == value) {
                return data;
            }
        }
        return null;
    }

    public Data searchDataBinary(int value) {
        Collections.sort(dataList, (d1, d2) -> d1.getValue() - d2.getValue());
        int left = 0;
        int right = dataList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataList.get(mid).getValue() == value) {
                return dataList.get(mid);
            }
            if (dataList.get(mid).getValue() < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void bubbleSort() {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                if (dataList.get(j).getValue() > dataList.get(j + 1).getValue()) {
                    Collections.swap(dataList, j, j + 1);
                }
            }
        }
    }

    // Implementasi selection sort bisa ditambahkan di sini

    // Metode untuk menampilkan daftar data
    public void displayData() {
        for (Data data : dataList) {
            System.out.println("Value: " + data.getValue() + ", Description: " + data.getDescription());
        }
    }
}

/* Pencarian Linear:
Pencarian linear memiliki kompleksitas waktu O(n), di mana n adalah jumlah elemen dalam daftar.
Kinerjanya cocok untuk daftar yang tidak terlalu besar, tetapi tidak efisien untuk daftar yang sangat besar karena harus memeriksa setiap elemen satu per satu.

 Pencarian Biner (setelah pengurutan menggunakan Bubble Sort):
Pengurutan menggunakan bubble sort memiliki kompleksitas waktu O(n^2), di mana n adalah jumlah elemen dalam daftar.
Setelah pengurutan, pencarian biner memiliki kompleksitas waktu O(log n), di mana n adalah jumlah elemen dalam daftar.
Kinerjanya lebih baik daripada pencarian linear untuk daftar yang cukup besar karena memanfaatkan sifat daftar yang telah diurutkan. */
