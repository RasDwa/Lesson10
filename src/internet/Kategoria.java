package internet;

import java.util.Arrays;
import java.util.Objects;

public class Kategoria {
    private String name;
    private Tovar[] tovars;

    public Kategoria(String name, Tovar[] tovars) {
        this.name = name;
        this.tovars = tovars;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tovar[] getTovars() {
        return tovars;
    }

    public void setTovars(Tovar[] tovars) {
        this.tovars = tovars;
    }

    @Override
    public String toString() {
        return "Kategoria{" +
                "name='" + name + '\'' +
                ", tovars=" + Arrays.toString(tovars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kategoria kategoria = (Kategoria) o;
        return Objects.equals(name, kategoria.name) &&
                Arrays.equals(tovars, kategoria.tovars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(tovars);
        return result;
    }


}
