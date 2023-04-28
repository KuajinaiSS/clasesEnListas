import java.util.Arrays;

public class ListaCliente {
    private Cliente[] vecCliente;
    private int cantActual;  // cantidad actual de clientes
    private int max;  // cantidad maxima de clientes


    public ListaCliente(int max){
        this.max = max;
        cantActual=0;
        vecCliente = new Cliente[max]; // cremos el vector de clientes
    }


    // agregar cliente
    public boolean agregarCliente(Cliente clienteAgregar){

        // corroboramos si esta llena la lista
        if(cantActual>=max){
            return false;
        }

        // si el cliente no existe lo agregamos
        if(buscarCliente(clienteAgregar.getNombre())==null){
            vecCliente[cantActual] = clienteAgregar;
            cantActual++;
            return true;

        // cualquier otro caso retonamos false
        }else{
            return false;
        }
    }

    // 
    // buscamos al cliente
    public Cliente buscarCliente(String nombre){
        for (int i = 0; i < cantActual; i++) {
            if(nombre.equalsIgnoreCase(vecCliente[i].getNombre())){
                return vecCliente[i];
            }
        }
        return null;
    }


    // buscamos al cliente y devolvemos al cliente
    public Cliente buscarRutCliente(String rut){
        for (int i = 0; i < cantActual; i++) {
            if(rut.equals(vecCliente[i].getRut())){
                return vecCliente[i];
            }
        }
        return null;
    }

    public Cliente[] getVecCliente() {
        return vecCliente;
    }


    @Override
    public String toString() {
        return "ListaCliente [vecCliente=" + Arrays.toString(vecCliente) + "]";
    }

    


}
