/*
 * pendingpayment int 0
 * processing int 1
 * shipped int 2
 * delivered int3
 */

package enume;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int value;

    OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
