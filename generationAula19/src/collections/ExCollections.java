package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExCollections {
	public static void main(String[] args) {
		
		
		//Criando uma lista do tipo Array.
		List<Integer> listaAtual = new ArrayList<Integer>();
		
		//Elementos da lista
		listaAtual.add(4);
		listaAtual.add(2);
		listaAtual.add(1);
		listaAtual.add(3);
		
		
		//Percorre toda a lista de elementos
		for(Integer listaElementos: listaAtual) 
		{
			System.out.println(listaElementos);
		}
		
		//o .get pega uma posi��o do ArrayLista
		int primeiroItem = listaAtual.get(0);
		System.out.println("O primeiro elemento �: " +listaAtual);
		System.out.println();
		
		for(int contador = 0; contador < listaAtual.size(); contador++) 
		{
			//Imprime as posi��es atrav�s do indice
			System.out.println("Elemento: " +listaAtual.get(contador));
		}
		
		//Ordena o ArrayList
		Collections.sort(listaAtual);
		System.out.println("Lista depois de ordenada");
		System.out.println(listaAtual);
		System.out.println();
		
		//Cria um HashSet chamado meuSet
		Set<Integer> meuSet = new HashSet<Integer>();

		//Adiciona elementos para o meuSet
		meuSet.add(10);
		meuSet.add(30);
		meuSet.add(100);
		
		//Cria um Iterator para ordenar e n�o repete elementos.
		Iterator<Integer> imeuSet = meuSet.iterator();
		
		//Procura por posi��o e retorna TRUE caso encontre algum elemento na posi��o, caso contr�rio retorna FALSE
		while (imeuSet.hasNext()) 
		{
			//imprime o pr�ximo elemento
			System.out.println(imeuSet.next());
		}
		
		
		
		
		
		
		
	}

}
