/* RRectangle is acting like a capsule here since it has encapsulated all the data/variables and method inside it */
class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength(int value) {
        if (value <= 0)
            throw new IllegalArgumentException("Length cannot be 0 or negative");
        this.length = value;
    }

    public void setWidth(int value) {
        if (value <= 0)
            throw new IllegalArgumentException("Width cannot be 0 or negative");
        this.width = value;
    }
}
