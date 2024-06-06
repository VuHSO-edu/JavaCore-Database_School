package hus.oop.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = Double.NEGATIVE_INFINITY;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object nextValue = iterator.next();
            if (nextValue != null) {
                double value = (double) nextValue;
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = Double.POSITIVE_INFINITY;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object nextValue = iterator.next();
            if (nextValue != null) {
                double value = (double) nextValue;
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0.0;
        int count = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object nextValue = iterator.next();
            if (nextValue != null) {
                double value = (double) nextValue;
                sum += value;
                count++;
            }

        }
        return count > 0 ? sum / count : 0;
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double mean = mean();
        double temp = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object nextValue = iterator.next();
            if(nextValue != null) {
                double value = (double) nextValue;
                temp += (mean-value)*(mean-value);
            }
        }
        return temp / (data.size() - 1);
    }
}
