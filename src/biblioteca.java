import java.util.Stack;

public class biblioteca {
    private Stack<String> libros;
    public biblioteca(){
        libros=new Stack<String>();
    }

    public boolean estaVacia(){
        return libros.empty();
    }

    public String mirarelementoTop() throws Exception{
        if (libros.empty())
            throw new NullPointerException();
        else
            return libros.peek();
    }
    public String apilarLibro(String nombre){
        return libros.push(nombre);
    }

    public void vaciarLibreria(){
        while (!libros.isEmpty()){
            libros.pop();
        }
    }
    public String quitarLibro(String text) throws Exception{
        if (libros.empty())
            throw new NullPointerException();
        else
            return libros.pop();
    }
    public boolean borrarLibro(String nombreAEliminar){
        Stack <String> librosAux = new Stack<>();
        boolean elementoEncontrado=false;
        while (!libros.isEmpty()){
            String elemento=libros.pop();
            if (elemento.equalsIgnoreCase(nombreAEliminar)){
                elementoEncontrado=true;
            }
            else {
                librosAux.push(elemento);
            }

        }
        while (!librosAux.isEmpty()){
            libros.push(librosAux.pop());
        }
        return elementoEncontrado;
    }
    public int buscarElemento(String nombre){
        if (libros.empty())
            throw new NullPointerException();
        else
            return libros.search(nombre);
    }

    public int cantidadDeLibros(){
        return libros.size();
    }
    @Override
    public String toString(){
        String nombre = "";
        for (int i = libros.size()-1; i>=0; i--){
            nombre = nombre + libros.get(i).toString()+"\n";
        }
        return nombre;
    }



}
