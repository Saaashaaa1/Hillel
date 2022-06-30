public enum Size {
    SMALL("S", 11, 40), MEDIUM("M", 15, 50)
    , LARGE("L", 20, 60), EXTRA_LARGE("XL", 20, 60);
    private String name;
    private int width;
    private int length;

    Size(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getName()+ " or " + super.toString() + "\nsize: " + "\nwidth = "+getWidth() + " \nlength = " + getLength();
    }
}
