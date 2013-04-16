package br.com.senacrs.alp.aulas;

public interface Lista<T extends Object> {

	void adicionarFinal(T valor){

	
		Nodo<Tipo> ultimo = obterUltimo();
    	Nodo<Tipo> novoUltimo = new Nodo<Tipo>(valor);
	    ultimo.setProximo(novoUltimo);
	
	}
	
	void adicionarInicio(T valor){
		Nodo<Tipo> inicio = null;
		Nodo<Tipo> primeiro = null;
		Nodo<Tipo> novoPrimeiro = null;
		inicio = this.inicio;
		primeiro = inicio.getProximo();
		novoPrimeiro = new Nodo<Tipo>(valor);		
		novoPrimeiro.setProximo(primeiro);
		inicio.setProximo(novoPrimeiro);
	}
	
	void adicionarPosicao(int posicao, T valor){
     
	Nodo<Tipo> nodo = null;
	 Obter(posicao);
	nodo = buscarNodo(posicao + 1);
	return nodo.getValor();
	}

	T obterPrimeiro();
	
	Nodo <T> nodo = inicio;
	indice = -1
    while(!(indice == posicao)){
    	return nodo;
		
	}
	
	T obterUltimo(){
	int tamanho = obterTanho();
	array[array.lenght-1 ]
	T resultado = obterPosicao(tamanho -1);
	return resultado;
	}
	
	T obterPosicao(int posicao);

	public T Obter nodo posicao(int posicao);
	   Nodo <T> nodo = null;
	   nodo = obter nodo posicao (posictao);
	   return nodo.conteudo;
	
	
	int obterTamanho(){
		Nodo<Tipo> nodo = getInicio();
		int resultado = 0;
		while (nodo.getProximo() != null) {
			nodo = nodo.getProximo();
			resultado++;
		}
		
	}

	T removerPosicao(int posicao);
	    Nodo<Tipo> anterior = null;
    	Nodo<Tipo> nodo = null;
		Nodo<Tipo> proximo = null;
	
	void esvaziar() {
		ObterPosicao(int posicao);
		anterior = ObterPosicao(posicao);
		nodo = anterior.getProximo();
		proximo = nodo.getProximo();
		anterior.setProximo
		
	}
	
}
