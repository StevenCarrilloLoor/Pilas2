import java.util.Stack;

public class Pila {
    private Stack<Character> pila;

    public Pila(){
        pila=new Stack<Character>();
    }
    public void insertar (Character dato){
        pila.push(dato);
    }
    public Character eliminar() throws Exception {
        if(pila.empty()){
            throw new Exception("Pila sin elemnetos");
        }
        return pila.pop();
    }
    public boolean esVacia(){
        return pila.isEmpty();
    }
    public Character consultarTope() throws Exception {
        if(pila.empty()){
            throw new Exception("Pila sin elemnetos");
        }
        return pila.peek();
    }

    @Override
    public String toString() {
        String resultados= "===PILA=== \n";
        for(int i=pila.size()-1; i>=0 ; i--){
            resultados+=pila.get(i)+"\n";
        }
        return resultados;
    }
}
