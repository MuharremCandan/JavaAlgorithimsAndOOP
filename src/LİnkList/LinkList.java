package LİnkList;

public class LinkList {
    private Link root;
    private Link iter;

    private class Link {
        private Link next;
        private int data;

        Link(int veri) {
            data = veri;
            next = null;
        }
    }

    public void add(int d) {
        Link n = new Link(d);
        if (root == null) // liste boş
        {
            iter = n;
            root = n;
        } else { // bir sonraki elemanı ekleriz
            iter.next = n; // sonraki elemanı gösterir
            iter = n;
        }

    }

    public void remove(int r) {
        Link d = root;
        Link prev = null;
// d, başlangıç node, prev ise silindiğinde
// bir önceki ile silindikten sonraki nodeyi bağlamak için

        while (d != null) {
            if (d.data == r) {
                if (root.data == r) { // eğer root silinecekse özel durumdur
                    root = d.next;
                    break;
                }
                prev.next = d.next; // normal nodelar silinirken
                d = d.next;
                break;
            } else {
                prev = d;
                d = d.next;
            } // bir sonraki nodeye geç
        }
    }

    public void print() {
        Link d = root;
        while (d != null) {
            System.out.print(d.data + " ");
            d = d.next;
        }
    }

    public static void main(String[] args) {
        int[] nums = {31, 2, 1, 56, 33, 777, 123, 25, 15, 17, 20, 11, 10, 1, 23, 3};
    }
}
