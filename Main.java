public class Main {

    // definimos que lista clietnes sera un atributo privado

    private ListaCliente listaCliente;

    public static void main(String[] args){

        // manejo tradicional de clases

        // creamos la clase cliente con sus atributos
        Cliente cliente = new Cliente("juan", "22222", "su casa", 0);

        // desplegar atributos
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getRut());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getPin());

        
        // agregar clientes a una lista de clientes

        // cremaos la lista clientes
        ListaCliente listaCliente = new ListaCliente(50);

        // creamos al clietne a agregar
        Cliente cliente2 = new Cliente("pedro", "11111", "su casa", 0);
        Cliente cliente3 = new Cliente("juan", "22222", "su casa", 0);


        // agregamos a los clientes
        listaCliente.agregarCliente(cliente);
        listaCliente.agregarCliente(cliente2);
        listaCliente.agregarCliente(cliente3);

        // buscamos a clientes en el vector
        System.out.println(listaCliente.buscarRutCliente("11111").getNombre());
        System.out.println(listaCliente.buscarRutCliente("22222").getNombre());

        
    }

    Cliente clienteNuevo = new Cliente(null, null, 0);
    Cliente clienteNuevo2 = new Cliente(null, null, null, 0);

    

}