//Manipulação de LIstas

//criando lista
List nomes = []

//adicionando elementos a lista, semelhante ao add do java
nomes << "Groovy"
nomes << "Grails"

//adicionando mais de um elemento a lista, semelhante ao addAll java
nomes += ["Java","Groovy"]

//Lista de tipos diferentes
List listaDiferente = []
listaDiferente << "Brasil"
listaDiferente << 1500
listaDiferente << 9.9

listaDiferente = ["Minas Gerais",100,9.8]

//Percorrendo a lista

println ">>" +listaDiferente

 println ">> Semelhante ao foreach"
nomes.each{   
    println it
}

println ">> ALterado o 'it' para a palaravra nome"
nomes.each{ nome ->   
    println nome
}

//removendo elemento da lista
while(nomes){
    nomes.remove(0);
}

//Busca na lista
List numeros = [90,34,87,23,11,9,23,12,5,7]
println "Numeros maior que  '10'..: " +numeros.find{it > 10}
println "Lista de numero maior que '10'..: "+numeros.findAll{it > 10}