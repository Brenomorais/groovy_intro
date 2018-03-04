//Construtuores de uma classe

public class Linguagem{
    String nome
    String versao
    String tipo
}

//os construtores sao criados dianmicamento
//pode inicializar com apenas os atributos desejados

def linguagem = new Linguagem(nome: "Groovy", versao: "2.0")

println linguagem.nome
println linguagem.versao

//imprimindo elemento null e tratamento

//atributo null
println linguagem.tipo

if(linguagem != null){
    println ">>"+linguagem.tipo
}
//ou ? eveitar nullpointexception
println linguagem?.tipo
