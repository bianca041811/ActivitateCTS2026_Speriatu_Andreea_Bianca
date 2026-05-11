package ro.ase.cts.hotel.clase;

public class Camera {
    private int nr;

    public Camera(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("nr=").append(nr);
        sb.append('}');
        return sb.toString();
    }
}
