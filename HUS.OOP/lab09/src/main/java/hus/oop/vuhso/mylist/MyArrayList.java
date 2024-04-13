package hus.oop.vuhso.mylist;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================
public class MyArrayList  extends MyAbstractList {
    static final int INITIAL_CAPACITY = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size == elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (size == elements.length) {
            enlarge();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        if (index < size - 1) {
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        }
        elements[--size] = null;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void  enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
