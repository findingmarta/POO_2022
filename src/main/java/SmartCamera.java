import java.util.Objects;

/**
 * Uma SmartCamera é uma câmara de vigilância com uma certa resolução e tamanho de imagem
 */

public class SmartCamera extends SmartDevice {
    private double resolution;
    private double size;

    /**
     * Constructor for objects of class SmartBulb
     */
    public SmartCamera () {
        super();
        this.resolution=0.0;
        this.size = 0.0;
    }

    public SmartCamera (String id, boolean b, double re, double size){
        super(id,b);
        this.resolution = re;
        this.size = size;
    }

    public SmartCamera (boolean b, double re, double size){
        super(b);
        this.resolution = re;
        this.size = size;
    }

    public SmartCamera (double re, double size){
        this.resolution = re;
        this.size = size;
    }

    public SmartCamera (SmartCamera sc){
        super (sc);
        this.resolution = sc.getResolution();
        this.size = sc.getSize();
    }

    /**
     * Getters e Setters
     */
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public double getResolution(){
        return this.resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    /**
     * Metodo toString, equals e clone
     */
    public String toString (){
        String estado;
        if (getOn()) estado = "ON";
        else estado = "OF";
        final StringBuffer sc = new StringBuffer("\n SmarCamera (\u001B[36m").append(getID()).append("\u001B[0m");
        sc.append(",").append(estado).append("): ");
        sc.append("Resolução-> ").append(resolution).append("  ");
        sc.append("Tamanho-> ").append(size).append("  ");
        sc.append("Consumo Diário-> ").append(consumoEnergia());
        return sc.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SmartCamera sc = (SmartCamera) o;
        return super.equals(sc) &&
                this.resolution==sc.getResolution() &&
                this.size==sc.getSize();
    }
    /*return Objects.equals(this.getID(), that.getID()) && Objects.equals(this.getOn(), that.getOn()) &&
     Double.compare(that.getResolution(), getResolution()) == 0 && Double.compare(that.getSize(), getSize()) == 0;
    */


    public SmartCamera clone() {
        return new SmartCamera(this);
    }

    /**
     * Metodos
     */
    public double consumoEnergia(){
        return 3 + (this.resolution * this.size);
    }
}
