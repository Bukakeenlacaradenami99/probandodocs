/**
 * clase datos del juego
 */
public class Singleton {

    /**
     * numero generado para adivinar
     */
    private int num_aleatorio;
    /**
     * numero introducido por el usuario
     */
    private int num_adivinado;
    /**
     * intentos para acertar el numero
     */
    private final int INTENTOS_MAX = 2;
    /**
     * numero de aciertos en una partida
     */
    private int num_aciertos;
    /**
     * alias del jugador
     */
    private String alias;
    /**
     * los intentos que el usuario lleva
     */
    private int contadorIntentos;
    /**
     * rondas en cada partida
     */
    private int rondas_partida;
    /**
     * la ronda en la que estamos actualmente
     */
    private int ronda_actual;
    /**
     * numero de fallos del jugador
     */
    private int num_fallos;

    /**
     * instanciamos singleton a null
     */
    private static Singleton instance = null;


    /**
     * constructor por defecto provado
     */
    private Singleton() {

    }

    /**
     * constructor con parametros privado
     * @param num_aleatorio el numero aleatorio
     * @param num_adivinado el numero elegido para adivinar
     * @param num_aciertos el numero de aciertos que tenemos
     * @param contadorIntentos el contador de intentos
     * @param rondas_partida las rondas que llevamos en la partida
     * @param ronda_actual la ronda en la que estamos actualmente
     * @param num_fallos el numero de fallos que tuvimos
     */
    private Singleton(int num_aleatorio, int num_adivinado, int num_aciertos, int contadorIntentos, int rondas_partida, int ronda_actual, int num_fallos) {
        this.num_aleatorio = num_aleatorio;
        this.num_adivinado = num_adivinado;
        this.num_aciertos = num_aciertos;
        this.contadorIntentos = contadorIntentos;
        this.rondas_partida = rondas_partida;
        this.ronda_actual = ronda_actual;
        this.num_fallos = num_fallos;
    }

    /**
     * los getter y los setter
     * @return sus atributos correspondientes
     */
    public int getNum_aleatorio() {
        return num_aleatorio;
    }

    public void setNum_aleatorio(int num_aleatorio) {
        this.num_aleatorio = num_aleatorio;
    }

    public int getNum_adivinado() {
        return num_adivinado;
    }

    public void setNum_adivinado(int num_adivinado) {
        this.num_adivinado = num_adivinado;
    }

    public int getINTENTOS_MAX() {
        return INTENTOS_MAX;
    }

    public int getNum_aciertos() {
        return num_aciertos;
    }

    public void setNum_aciertos(int num_aciertos) {
        this.num_aciertos = num_aciertos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }

    public int getRondas_partida() {
        return rondas_partida;
    }

    public void setRondas_partida(int rondas_partida) {
        this.rondas_partida = rondas_partida;
    }

    public int getRonda_actual() {
        return ronda_actual;
    }

    public void setRonda_actual(int ronda_actual) {
        this.ronda_actual = ronda_actual;
    }

    public int getNum_fallos() {
        return num_fallos;
    }

    public void setNum_fallos(int num_fallos) {
        this.num_fallos = num_fallos;
    }

    /**
     * metodo para instanciar un unico objeto
     * @return la instancia
     */
    public static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();
        }

       return instance;
    }


}