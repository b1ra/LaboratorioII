package br.com.senacrs.alp.aulas;

public interface Fila<T extends Object> {

	void insercao(T valor){

    public void inserir(Object obj)    
        No novo = new No(obj);   
        novo.setProximoNo(inicio);   
        inicio = novo;   
    }
	
		
	T obter();

	
	T remocao();
	
	Object remover() {   
        No temp = inicio;   
        if (temp.getProximoNo() != null) {   
            inicio = null;   
            return (temp.getDado());   
        }   
        No ant = temp;   
        while (temp.getProximoNo() != null) {   
            ant = temp;   
            temp = temp.getProximoNo();   
        }   
        return (temp.getDado());   
    }   

	
	
	boolean vazia(){
		return (inicio == null)
	}

		
	int tamanho();
	
	void esvaziar();
}
