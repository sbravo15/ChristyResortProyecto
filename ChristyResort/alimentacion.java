/*
 * Elegir alimentacion
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */
package ChristyResortProyecto;

public class alimentacion {
    
    private String desayuno;
    private String almuerzo;
    private String cena;
    private String bebidas_alcohol;
    private int monto_comida;

    public alimentacion() {
    }

    public alimentacion(String desayuno, String almuerzo, String cena, String bebidas_alcohol, int monto_comida) {
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
        this.bebidas_alcohol = bebidas_alcohol;
        this.monto_comida = monto_comida;
    }

        public String getDesayuno() {
            return desayuno;
        }

        public void setDesayuno(String desayuno) {
            this.desayuno = desayuno;
        }

        public String getAlmuerzo() {
            return almuerzo;
        }

        public void setAlmuerzo(String almuerzo) {
            this.almuerzo = almuerzo;
        }

        public String getCena() {
            return cena;
        }

        public void setCena(String cena) {
            this.cena = cena;
        }

        public String getBebidas_alcohol() {
            return bebidas_alcohol;
        }

        public void setBebidas_alcohol(String bebidas_alcohol) {
            this.bebidas_alcohol = bebidas_alcohol;
        }

        public int getMonto_comida() {
            return monto_comida;
        }

        public void setMonto_comida(int monto_comida) {
            this.monto_comida = monto_comida;
        }
    
    
   
    }
