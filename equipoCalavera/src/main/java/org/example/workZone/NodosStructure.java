package org.example.workZone;

public class NodosStructure {

    public class Stack implements IStackTwo{

        private Node first;

        @Override
        public void add(int a){
            this.first = new Node(a, this.first);
        }
        @Override
        public void remove(){
            if (this.first == null){
                System.out.println("No se puede desapilar una pila vacia.");
                return;
            }
            this.first = this.first.getNext();}

        @Override
        public boolean isEmpty(){

            return this.first == null;

        }


        @Override
        public int getTop(){
            if ( this.first == null){
                System.out.println("No se puede obtener el tope de una pila vacia.");
                return -1;
            }
            return this.first.getValue();
            //getValue me brinda el valor del nodo, no lo modifica.

        }
    }




}






