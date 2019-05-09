package lesson10.zad4;

public enum SizeDress {
    XXS(32){
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);
    private int euroSize;

    SizeDress(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }
}
