package lesson6_hw;

public class Notebook {
    String brand;
    String model;
    String ram;
    String ssd;
    String os;
    String color;


    public Notebook(String brand, String model, String ram, String ssd, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Notebook: %s %s , RAM: %s, SSD: %s, OS: %s, Color: %s", brand, model, ram, ssd, os, color);
    }

    public boolean filterNotebook(Object selectedRam, Object selectedSsd, Object selectedOs, Object selectedColor) {
        if (checkNumParams(selectedRam, ram) &&
                checkNumParams(selectedSsd, ssd) &&
                checkStringParams(selectedOs, os) &&
                checkStringParams(selectedColor, color)) {
            return true;
        }
        return false;
    }

    private boolean checkNumParams(Object el, String comparedEl) {
        String stingedEl = el.toString();
        if (stingedEl.isEmpty()) {
            return true;
        }
        if (Integer.parseInt(stingedEl) <= Integer.parseInt(comparedEl)) {
            return true;
        }
        return false;
    }

    private boolean checkStringParams(Object el, String comparedEl) {
        String stingedEl = el.toString();
        if (stingedEl.isEmpty()) {
            return true;
        }
        if (stingedEl.equalsIgnoreCase(comparedEl)) {
            return true;
        }
        return false;
    }

}
