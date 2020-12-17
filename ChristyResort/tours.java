/*
 * tours
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */
package ChristyResortProyecto;

public class tours {
    
    private String caminata_playa;
    private String kayak;
    private String tirolesa;
    private String pesca;
    private int monto_tours;

    public tours() {
    }

    public tours(String caminata_playa, String kayak, String tirolesa, String pesca, int monto_tours) {
        this.caminata_playa = caminata_playa;
        this.kayak = kayak;
        this.tirolesa = tirolesa;
        this.pesca = pesca;
        this.monto_tours = monto_tours;
    }

    public String getCaminata_playa() {
        return caminata_playa;
    }

    public void setCaminata_playa(String caminata_playa) {
        this.caminata_playa = caminata_playa;
    }

    public String getKayak() {
        return kayak;
    }

    public void setKayak(String kayak) {
        this.kayak = kayak;
    }

    public String getTirolesa() {
        return tirolesa;
    }

    public void setTirolesa(String tirolesa) {
        this.tirolesa = tirolesa;
    }

    public String getPesca() {
        return pesca;
    }

    public void setPesca(String pesca) {
        this.pesca = pesca;
    }

    public int getMonto_tours() {
        return monto_tours;
    }

    public void setMonto_tours(int monto_tours) {
        this.monto_tours = monto_tours;
    }
    
    
}
