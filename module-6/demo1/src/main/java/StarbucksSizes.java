
public class StarbucksSizes {

    public enum Size {
        Small("Tall"),
        MEDIUM("Grande"),
        LARGE("Venti"),
        EXTRALARGE("Trenta");

        private String label;

        Size(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        for (Size size : Size.values()) {
            System.out.println(size + ": " + size.getLabel());
        }
    }
}
