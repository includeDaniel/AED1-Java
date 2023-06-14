// adicionar fim da lista = .add(nome)
// adicionar pos específica = .add(indice,nome)
// atualizar contéudo da lista = .set(indice,nome)
// remove conteúdo da lista = .remove(indice,nome)
// remove o ultimo indice = .remove(lista.size()-1)
// apaga a lista = .clear
// pegar itens da lista pra somar/imprimir/etc = .get()
// pesquisar itens = .indexOf(nome) -> retorna o índice
// lembrando que posição = índice + 1

// ORDENA EM ORDEM CRESCENTE (ALFABÉTICA)
// listaNomes.sort(null);

// ORDENA EM ORDEM CRESCENTE DESCONSIDERANDO MAÍUSCULO/MINÚSCULO
// listaNomes.sort(String.CASE_INSENSITIVE_ORDER);

// ORDENA EM ORDEM DECRESCENTE (ALFABÉTICA INVERSA)
// listaNomes.sort((new Comparator<String>() {
// public int compare(String ordena1, String ordena2) {
// return ordena2.compareToIgnoreCase(ordena1);

// for(int aux=0; aux < NOMES.size()-1; aux++) {
// for(int x = 0; x < NOMES.size()-1; x++) {
// if (NOMES.get(x).compareToIgnoreCase(NOMES.get(x+1)) > 0) {
// tempNome = NOMES.get(x);
// NOMES.set(x, NOMES.get(x+1));
// NOMES.set(x+1,tempNome);
// tempIRPF = IRPF.get(x);
// IRPF.set(x, IRPF.get(x+1));
// IRPF.set(x+1,tempIRPF);
// }
// }
// }
// for(int aux = 0; aux < NOMES.size(); aux++) {
// System.out.println(NOMES.get(aux));
// System.out.println(IRPF.get(aux));