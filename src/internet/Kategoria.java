package internet;

import java.util.Arrays;
import java.util.Objects;

public class Kategoria {
    private String nameKategoria;
    private Tovar[] tovars;

    public Kategoria(String name, Tovar[] tovars) {
        this.nameKategoria = name;
        this.tovars = tovars;
    }



    public String getNameKategoria() {
        return nameKategoria;
    }

    public void setNameKategoria(String nameKategoria) {
        this.nameKategoria = nameKategoria;
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
                "nameKategoria='" + nameKategoria + '\'' +
                ", tovars=" + Arrays.toString(tovars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kategoria kategoria = (Kategoria) o;
        return Objects.equals(nameKategoria, kategoria.nameKategoria) &&
                Arrays.equals(tovars, kategoria.tovars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameKategoria);
        result = 31 * result + Arrays.hashCode(tovars);
        return result;
    }


}
