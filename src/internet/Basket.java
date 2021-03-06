package internet;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Basket {
    private Tovar[] kyplenueTovaru;
    private User user;
    private LocalDate pocupkaData;

    public Basket(Tovar[] kyplenueTovaru, User user, LocalDate pocupkaData) {
        this.kyplenueTovaru = kyplenueTovaru;
        this.user = user;
        this.pocupkaData = pocupkaData;

    }

    public LocalDate getPocupkaData() {
        return pocupkaData;
    }

    public void setPocupkaData(LocalDate pocupkaData) {
        this.pocupkaData = pocupkaData;
    }

    public Basket(Tovar[] kyplenueTovaru, LocalDate pocupkaData) {
        this.kyplenueTovaru = kyplenueTovaru;
        this.pocupkaData = pocupkaData;
    }

    public Basket(Tovar tovar, User user1) {
    }

    public Tovar[] getKyplenueTovaru() {
        return kyplenueTovaru;
    }

    public void setKyplenueTovaru(Tovar[] kyplenueTovaru) {
        this.kyplenueTovaru = kyplenueTovaru;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Arrays.equals(kyplenueTovaru, basket.kyplenueTovaru) &&
                Objects.equals(user, basket.user);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(user);
        result = 31 * result + Arrays.hashCode(kyplenueTovaru);
        return result;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "kyplenueTovaru=" + Arrays.toString(kyplenueTovaru) +
                ", user=" + user +
                '}';
    }
}
